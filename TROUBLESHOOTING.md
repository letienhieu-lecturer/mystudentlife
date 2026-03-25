# 🐛 Hướng Dẫn Debug & Ghi Chú

Tài liệu này giúp sinh viên giải quyết các vấn đề thường gặp khi phát triển MyStudentLife.

---

## 🔴 Lỗi Compile (Lỗi Biên Dịch)

### ❌ Error: "Unresolved reference: ..."

**Nguyên nhân:** Import chưa được thêm hoặc tên class sai

**Cách fix:**
```kotlin
// Thêm import đúng
import com.hltech.mystudentlife.week1.model.SinhVien
import com.hltech.mystudentlife.week1.MainActivity
```

- Trong Android Studio: `Alt+Enter` (Windows) / `Option+Enter` (Mac)
- Hoặc viết tên class → Android Studio suggest import

### ❌ Error: "Cannot find symbol"

**Nguyên nhân:** File layout XML không tìm thấy

**Cách fix:**
1. Kiểm tra tên file layout:
   ```
   res/layout/activity_main.xml ✅
   res/layout/ActivityMain.xml ❌ (sai quy ước)
   ```

2. Clean + Rebuild:
   ```bash
   Build > Clean Project
   Build > Rebuild Project
   ```

### ❌ Error: "Type mismatch: inferred type is ... but ... was expected"

**Nguyên nhân:** Kiểu dữ liệu không khớp

**Ví dụ:**
```kotlin
// ❌ Sai
val gpa: String = 3.5
val subjects: List<MonHoc> = mutableListOf<MonHoc>()

// ✅ Đúng
val gpa: Double = 3.5
val subjects: MutableList<MonHoc> = mutableListOf<MonHoc>()
```

### ❌ Error: "Package does not exist"

**Nguyên nhân:** Dependency chưa thêm hoặc gradle chưa sync

**Cách fix:**
```kotlin
// File: build.gradle.kts (app level)
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}
```

1. Add dependency
2. File > Sync Now (hoặc Android Studio tự suggest)
3. Build > Rebuild Project

---

## 🔴 Lỗi Runtime (Lỗi Chạy Ứng Dụng)

### ❌ NullPointerException (NPE)

**Nguyên nhân:** Truy cập biến null

**Ví dụ:**
```kotlin
// ❌ Crash
val name: String? = null
val length = name.length // NPE!

// ✅ Fix
val name: String? = null
val length = name?.length ?: 0 // Null-safe
```

**Cách debug:**
1. Mở Logcat (Android Studio > View > Tool Windows > Logcat)
2. Tìm dòng `NullPointerException`
3. Xem stack trace → line number sai

### ❌ Android Runtime Error: "android.view.InflateException"

**Nguyên nhân:** Layout XML có lỗi syntax

**Cách fix:**
1. Kiểm tra XML syntax:
   ```xml
   <!-- ❌ Sai: quên đóng tag -->
   <LinearLayout>
       <TextView android:id="@+id/textView" />

   <!-- ✅ Đúng -->
   <LinearLayout>
       <TextView android:id="@+id/textView" />
   </LinearLayout>
   ```

2. Check tên resource: `android:text="@string/app_name"`
   - `@string/app_name` phải tồn tại trong `res/values/strings.xml`

3. Rebuild project: `Build > Rebuild Project`

### ❌ ClassCastException

**Nguyên nhân:** Cast type sai

```kotlin
// ❌ Sai
val textView: EditText = findViewById(R.id.textView) as EditText
// Nếu R.id.textView là TextView → crash!

// ✅ Đúng
val textView: TextView = findViewById(R.id.textView)
```

### ❌ IllegalStateException: "Fragment X was not attached to a context"

**Nguyên nhân:** Fragment bị destroy nhưng code vẫn tham chiếu

```kotlin
// ✅ Fix: Check context exists
if (isAdded && context != null) {
    // Code an toàn
}
```

### ❌ ViewBinding/FindViewById trả về null

**Nguyên nhân:** ID layout sai hoặc layout chưa set

```kotlin
// ❌ Sai
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val textView: TextView = findViewById(R.id.textView) // NULL!
    // onCreate chưa inflate layout
}

// ✅ Đúng
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val textView: TextView = view.findViewById(R.id.textView) // OK
}
```

---

## 🟡 Lỗi Logic (Code chạy nhưng kết quả sai)

### ❌ Button click không hoạt động

**Nguyên nhân 1:** Chưa set OnClickListener
```kotlin
// ❌ Sai
val button = findViewById<Button>(R.id.button)
// Quên: button.setOnClickListener { ... }

// ✅ Đúng
button.setOnClickListener {
    Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
}
```

**Nguyên nhân 2:** ID button sai
```xml
<!-- activity_main.xml -->
<Button android:id="@+id/btnClick" ... />

<!-- MainActivity.kt -->
val button = findViewById<Button>(R.id.button) // ❌ Sai! Phải là R.id.btnClick
```

### ❌ RecyclerView trống hoặc không update

**Nguyên nhân 1:** Adapter chưa set data
```kotlin
// ❌ Sai
val adapter = SubjectAdapter(emptyList())
recyclerView.adapter = adapter

// ✅ Đúng
val subjects = listOf(MonHoc(...), MonHoc(...))
val adapter = SubjectAdapter(subjects)
recyclerView.adapter = adapter
```

**Nguyên nhân 2:** Quên gọi notifyDataSetChanged()
```kotlin
// ❌ Sai: thêm vào list nhưng quên notify
adapter.subjects.add(newSubject)

// ✅ Đúng
adapter.subjects.add(newSubject)
adapter.notifyDataSetChanged() // hoặc notifyItemInserted()
```

**Nguyên nhân 3:** MutableList vs List
```kotlin
// ❌ Sai
class SubjectAdapter(val subjects: List<MonHoc>) {
    fun addSubject(subject: MonHoc) {
        subjects.add(subject) // ❌ List không có .add()
    }
}

// ✅ Đúng
class SubjectAdapter(val subjects: MutableList<MonHoc>) {
    fun addSubject(subject: MonHoc) {
        subjects.add(subject)
        notifyDataSetChanged()
    }
}
```

### ❌ Data không lưu vào SharedPreferences

```kotlin
// ❌ Sai: quên gọi apply()
val prefs = getSharedPreferences("settings", MODE_PRIVATE)
prefs.edit().putString("name", "John")
// Data không được lưu!

// ✅ Đúng
prefs.edit().putString("name", "John").apply()
```

### ❌ Room Database không lưu data

**Nguyên nhân 1:** Quên add @Entity
```kotlin
// ❌ Sai
data class MonHoc(
    val id: Int,
    val tenMon: String
)

// ✅ Đúng
@Entity(tableName = "mon_hoc")
data class MonHoc(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val tenMon: String
)
```

**Nguyên nhân 2:** Quên suspend hoặc lifecycleScope
```kotlin
// ❌ Sai: không chạy Coroutine
repository.insertSubject(subject)

// ✅ Đúng
lifecycleScope.launch {
    repository.insertSubject(subject)
}
```

### ❌ API không trả về dữ liệu

**Nguyên nhân 1:** API URL sai
```kotlin
// ❌ Sai
const val BASE_URL = "https://api.example.com" // Quên dấu /

// ✅ Đúng
const val BASE_URL = "https://api.example.com/"
```

**Nguyên nhân 2:** JSON property sai
```kotlin
// API trả về: { "quote": "...", "author": "..." }

// ❌ Sai
data class Quote(
    val text: String, // ❌ API không có "text"
    val name: String
)

// ✅ Đúng
@SerializedName("quote")
val text: String,

@SerializedName("author")
val name: String
```

**Nguyên nhân 3:** Quên xử lý Exception
```kotlin
// ❌ Sai: crash nếu API fail
try {
    val response = api.getQuote()
    updateUI(response)
} catch (e: Exception) {
    // Không xử lý
}

// ✅ Đúng
try {
    val response = api.getQuote()
    updateUI(response)
} catch (e: IOException) {
    showError("Network error: ${e.message}")
} catch (e: Exception) {
    showError("Error: ${e.message}")
}
```

---

## 🛠️ Các Tool Debug Hữu Ích

### 1️⃣ Logcat - Xem Logs

```
Android Studio > View > Tool Windows > Logcat
```

**Lọc log:**
```
// Chỉ xem log từ app
Logcat > dropdown > chọn "Show only selected application"

// Tìm error
Ctrl+F (Windows) / Cmd+F (Mac) > gõ "ERROR"
```

**In log:**
```kotlin
Log.d("TAG", "Message: $value")
Log.e("TAG", "Error: $error", exception)

// Tìm log bằng filter
// Logcat > search "TAG"
```

### 2️⃣ Debugger - Debug Code

```
1. Click dòng code → F9 (set breakpoint)
2. Run > Debug 'app'
3. Dừng tại breakpoint
4. Step over (F10) hoặc Step into (F11)
5. Xem biến trong "Variables" tab
```

### 3️⃣ Layout Inspector - Kiểm tra UI

```
Tools > Layout Inspector
```
- Xem hierarchy views
- Inspect properties (size, color, margin)
- Debug layout issues

### 4️⃣ Profiler - Kiểm tra Performance

```
View > Tool Windows > Profiler
```
- Memory usage
- CPU
- Network
- Energy

### 5️⃣ Database Inspector - Kiểm tra Room Data

```
View > Tool Windows > Database Inspector
```
- Browse table
- Query data
- Debug database operations

---

## 📱 Các Lỗi Thường Gặp

### ❌ "NoSuchMethodException: ..."

**Nguyên nhân:** Phiên bản library không khớp

```kotlin
// build.gradle.kts
dependencies {
    // Cập nhật version
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")
}
```

### ❌ "Gradle sync failed"

**Cách fix:**
1. File > Invalidate Caches
2. Restart Android Studio
3. Build > Clean Project
4. Build > Rebuild Project

### ❌ Emulator chậm

**Cách tối ưu:**
1. Tắt animations: Settings > Developer Options > Animation scale = 0.5x
2. Dùng Hardware acceleration
3. Allocate RAM tối đa trong Device Manager

### ❌ App crash trên device thật nhưng chạy OK trên emulator

**Nguyên nhân:** Phiên bản Android/API level khác

**Cách fix:**
1. Check `minSdkVersion` trong build.gradle.kts
2. Dùng compatibility library (androidx)
3. Test trên emulator với API level giống device

---

## 💡 Best Practices để Tránh Lỗi

1. **Luôn check null:**
   ```kotlin
   val value: String? = ...
   if (value != null) { ... }
   // hoặc
   value?.let { ... }
   ```

2. **Sử dụng try-catch:**
   ```kotlin
   try {
       // Code có thể fail
   } catch (e: Exception) {
       Log.e("TAG", "Error", e)
   }
   ```

3. **Viết logs:**
   ```kotlin
   Log.d("SubjectAdapter", "Items count: ${items.size}")
   ```

4. **Test incrementally:**
   - Hoàn thành 1 feature → test
   - Không code hết rồi test cuối

5. **Sử dụng Git:**
   ```bash
   git add .
   git commit -m "Add subject list feature"
   git push
   ```

---

## 🆘 Nếu Vẫn Không Fix Được

1. **Google lỗi:** Copy error message → Google
2. **Stack Overflow:** Tìm issue tương tự
3. **Documentation:** https://developer.android.com
4. **Hỏi bạn:** Cùng debug
5. **Hỏi giảng viên:** letienhieu@vute.edu.vn

---

**Happy coding! 🚀**

Tác giả: Lê Tiến Hiếu

