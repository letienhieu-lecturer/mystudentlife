package com.hltech.mystudentlife

// Import các thư viện cần thiết cho Android và Jetpack Compose
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

// Activity cho màn hình cài đặt
class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsScreen(onFinish = { finish() }) // Hiển thị giao diện cài đặt, khi lưu sẽ đóng màn hình
        }
    }
}

// Hàm Composable hiển thị giao diện cài đặt
@Composable
fun SettingsScreen(onFinish: () -> Unit) {
    val context = LocalContext.current // Lấy context hiện tại
    val prefs = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE) // Lấy SharedPreferences để lưu cài đặt
    var name by remember { mutableStateOf(TextFieldValue(prefs.getString("student_name", "") ?: "")) } // Tên sinh viên
    var theme by remember { mutableStateOf(prefs.getString("theme", "light") ?: "light") } // Chủ đề
    var fontSize by remember { mutableStateOf(prefs.getString("font_size", "medium") ?: "medium") } // Cỡ chữ
    var notifications by remember { mutableStateOf(prefs.getBoolean("notifications", false)) } // Thông báo
    var onboardingSeen by remember { mutableStateOf(prefs.getBoolean("onboarding_seen", false)) } // Đã xem onboarding chưa

    Column(modifier = Modifier.padding(24.dp)) {
        Text(text = "Tên sinh viên")
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Chủ đề")
        Row {
            RadioButton(
                selected = theme == "light",
                onClick = { theme = "light" }
            )
            Text("Sáng", modifier = Modifier.padding(end = 16.dp))
            RadioButton(
                selected = theme == "dark",
                onClick = { theme = "dark" }
            )
            Text("Tối")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Cỡ chữ")
        FontSizeDropdown(fontSize, onFontSizeSelected = { fontSize = it }) // Dropdown chọn cỡ chữ

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Thông báo")
        Switch(
            checked = notifications,
            onCheckedChange = { notifications = it }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Checkbox(
                checked = onboardingSeen,
                onCheckedChange = { onboardingSeen = it }
            )
            Text("Đã xem onboarding")
        }

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            // Lưu các cài đặt vào SharedPreferences
            with(prefs.edit()) {
                putString("student_name", name.text)
                putString("theme", theme)
                putString("font_size", fontSize)
                putBoolean("notifications", notifications)
                putBoolean("onboarding_seen", onboardingSeen)
                apply()
            }
            onFinish() // Đóng màn hình cài đặt
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Lưu")
        }
    }
}

// Dropdown chọn cỡ chữ
@Composable
fun FontSizeDropdown(selected: String, onFontSizeSelected: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) } // Trạng thái mở/đóng dropdown
    val options = listOf("small", "medium", "large") // Các lựa chọn
    val labels = mapOf("small" to "Nhỏ", "medium" to "Vừa", "large" to "Lớn") // Nhãn hiển thị
    Box {
        Button(onClick = { expanded = true }) {
            Text(labels[selected] ?: selected)
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(labels[option] ?: option) },
                    onClick = {
                        onFontSizeSelected(option) // Chọn cỡ chữ
                        expanded = false
                    }
                )
            }
        }
    }
}
