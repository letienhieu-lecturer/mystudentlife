package com.hltech.mystudentlife

// Import các thư viện cần thiết cho Android và Jetpack Compose
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.hltech.mystudentlife.ui.theme.MystudentlifeTheme

// MainActivity là Activity chính của ứng dụng
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Kích hoạt chế độ hiển thị tràn viền
        setContent {
            MainScreenWithTheme() // Gọi Composable để hiển thị giao diện
        }
    }
}

// Hàm Composable quản lý theme và trạng thái onboarding
@Composable
fun MainScreenWithTheme() {
    val context = LocalContext.current // Lấy context hiện tại
    val prefs = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE) // Lấy SharedPreferences để lưu cài đặt
    var theme by remember { mutableStateOf(prefs.getString("theme", "light")) } // Lưu trạng thái theme
    var onboardingSeen by remember { mutableStateOf(prefs.getBoolean("onboarding_seen", false)) } // Đã xem onboarding chưa
    val reloadFlag = remember { mutableStateOf(0) } // Biến để trigger reload khi quay lại từ Settings

    // Lắng nghe kết quả trả về từ SettingsActivity để reload lại cài đặt
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) {
        // Khi quay lại từ Settings, cập nhật lại theme và onboarding
        theme = prefs.getString("theme", "light")
        onboardingSeen = prefs.getBoolean("onboarding_seen", false)
        reloadFlag.value = reloadFlag.value + 1 // Tăng để trigger recomposition
    }

    // Nếu chưa xem onboarding thì hiển thị màn hình onboarding
    if (!onboardingSeen) {
        OnboardingScreen(onDone = {
            prefs.edit().putBoolean("onboarding_seen", true).apply() // Đánh dấu đã xem
            onboardingSeen = true
        })
    } else {
        // Nếu đã xem onboarding thì hiển thị giao diện chính với theme phù hợp
        MystudentlifeTheme(darkTheme = theme == "dark") {
            MainScreen(
                onSettingsClick = {
                    // Khi bấm nút cài đặt, mở SettingsActivity
                    launcher.launch(Intent(context, SettingsActivity::class.java))
                },
                reloadFlag = reloadFlag.value
            )
        }
    }
}

// Hàm Composable hiển thị giao diện chính
@Composable
fun MainScreen(onSettingsClick: () -> Unit, reloadFlag: Int) {
    val context = LocalContext.current
    val prefs = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    // Sử dụng reloadFlag để cập nhật lại khi quay về từ Settings
    val name = remember(reloadFlag) { prefs.getString("student_name", "") ?: "" }
    val fontSize = remember(reloadFlag) { prefs.getString("font_size", "medium") ?: "medium" }
    val theme = remember(reloadFlag) { prefs.getString("theme", "light") ?: "light" }
    val notifications = remember(reloadFlag) { prefs.getBoolean("notifications", false) }

    // Xác định giá trị cỡ chữ dựa vào lựa chọn
    val fontSizeValue = when (fontSize) {
        "small" -> 16.sp
        "medium" -> 26.sp
        "large" -> 36.sp
        else -> 26.sp
    }

    Scaffold(
        topBar = {
            Column {
                Spacer(modifier = Modifier.height(16.dp)) // Đẩy topBar xuống cho dễ bấm
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Xin chào, ${name.ifBlank { "Sinh viên" }}!", // Hiển thị tên sinh viên
                        fontSize = fontSizeValue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(onClick = onSettingsClick) {
                        Text("⚙️") // Nút mở cài đặt
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Cài đặt hiện tại:\n- Chủ đề: $theme\n- Cỡ chữ: $fontSize\n- Thông báo: ${if (notifications) "Bật" else "Tắt"}",
                fontSize = 16.sp
            )
        }
    }
}

// Màn hình onboarding hướng dẫn lần đầu
@Composable
fun OnboardingScreen(onDone: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Chào mừng bạn đến với ứng dụng!\nĐây là màn hình onboarding.", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onDone) {
                Text("Bắt đầu sử dụng")
            }
        }
    }
}
