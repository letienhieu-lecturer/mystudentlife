# Lộ Trình Giảng Dạy Lập Trình Ứng Dụng Di Động (Android)

**Khóa học:** 30 buổi × 4 giờ = 160 giờ (Tuần 1–6)  
**Dự án cá nhân:** Tuần 7–8 (10 buổi)  
**Tổng cộng:** 40 buổi (320 giờ)

---

## 📚 TUẦN 1: NỀN TẢNG KOTLIN & ANDROID (Buổi 1–5)

### Buổi 1: Kotlin Cơ Bản — Thiết Kế Data Model

**Kiến thức:**
- Biến và hằng (var, val)
- Hàm và lambda
- Null safety (?:)
- Data class
- List, Map, Set

**Bài tập:**
1. Tạo `SinhVien.kt` với data class:
   ```kotlin
   data class SinhVien(
       val hoTen: String,
       val mssv: String,
       val lop: String,
       val email: String?
   )
   ```

2. Tạo `MonHoc.kt`:
   ```kotlin
   data class MonHoc(
       val maMonHoc: String,
       val tenMon: String,
       val soTinChi: Int,
       var diemSo: Double?
   )
   ```

3. Viết hàm `tinhDiemTrungBinh(danhSach: List<MonHoc>): Double`
4. Viết hàm `xepLoaiHocLuc(gpa: Double): String`
5. Trong `main()`: tạo 1 SV + 5 môn, in bảng điểm

**File tạo:**
- `app/src/main/java/com/hltech/mystudentlife/week1/model/SinhVien.kt`
- `app/src/main/java/com/hltech/mystudentlife/week1/model/MonHoc.kt`
- `app/src/main/java/com/hltech/mystudentlife/week1/model/Constants.kt`
- `app/src/main/java/com/hltech/mystudentlife/week1/utils/DateTimeUtils.kt`

**Checkpoint:** Code chạy đúng trên Kotlin Playground

---

### Buổi 2: Android Studio — Tạo Project & Trang Chủ

**Kiến thức:**
- Tạo project mới trong Android Studio
- Cấu trúc thư mục project
- Activity, Intent, Manifest
- Layout XML (LinearLayout, TextEdit)

**Bài tập:**
1. Tạo project "MyStudentLife" (Empty Activity, Kotlin, API 24+)
2. Thiết kế `activity_main.xml`:
   ```
   - Header: "🎓 MyStudentLife" (bold, nền xanh, cỡ lớn)
   - Thông tin SV: Họ tên, MSSV, Lớp (hardcode)
   - GPA hiện tại (hiển thị lớn, số điểm)
   - Mục "Hôm nay": ngày tháng, lời chào (Sáng/Chiều/Tối)
   ```

3. Trong `MainActivity.kt`:
   ```kotlin
   - Lấy ngày hiện tại bằng Calendar
   - Tính toán giờ → lời chào phù hợp
   - Hiển thị thông tin SV từ data class
   ```

**File tạo:**
- `MainActivity.kt`
- `res/layout/activity_main.xml`
- `res/values/colors.xml` (sơ bộ)
- `res/values/strings.xml` (tên app)

**Checkpoint:** Trang chủ hiển thị đúng, lời chào logic đúng

---

### Buổi 3: Button & Sự Kiện — Trang Chủ Tương Tác

**Kiến thức:**
- Button, EditText, TextView
- setOnClickListener
- Toast, Snackbar
- Cập nhật UI runtime

**Bài tập:**
1. **Bộ đếm giờ học:**
   - Button "+" và "−"
   - TextView hiển thị số giờ
   - Toast khi đạt 2h, 4h, 6h

2. **Mục tiêu ngày:**
   - EditText nhập mục tiêu
   - Button "Lưu"
   - TextView hiển thị mục tiêu

3. **Button "Thay đổi thông tin":**
   - Click → Toast "Sẽ cập nhật sau!"

4. **Motivational quote:**
   - Mảng String hardcode (5-10 quote)
   - Random khi mở app
   - Button "Refresh quote"

**File tạo/cập nhật:**
- `MainActivity.kt` (cập nhật)
- `activity_main.xml` (cập nhật)

**Checkpoint:** Click button, dữ liệu cập nhật, Toast hiển thị

---

### Buổi 4: Intent — Màn Hình Hồ Sơ Chi Tiết

**Kiến thức:**
- Intent explicit (startActivity)
- putExtra, getExtra
- Nhiều Activity, navigation
- startActivityForResult (cũ)

**Bài tập:**
1. Tạo `ProfileActivity` với layout:
   ```
   - ImageView (placeholder ảnh đại diện)
   - Họ tên, MSSV, Lớp
   - Khoa, Email, SĐT
   - Danh sách sở thích (3-5 items)
   - Button "Quay lại"
   ```

2. Trên Trang chủ: Button "Xem Hồ Sơ"
   - `startActivity(Intent(MainActivity, ProfileActivity::class.java))`
   - `putExtra("name", "Nguyễn Văn A")`

3. ProfileActivity nhận tên:
   - `getStringExtra("name")`
   - Hiển thị "Hồ sơ của [Tên]"

4. **Bonus:** Tạo `EditProfileActivity`:
   - Form chỉnh sửa tên/email
   - Save → quay lại MainActivity
   - (Dùng Activity Result API)

**File tạo:**
- `ProfileActivity.kt`
- `EditProfileActivity.kt`
- `res/layout/activity_profile.xml`
- `res/layout/activity_edit_profile.xml`

**Checkpoint:** Click "Xem Hồ Sơ" → mở, click "Quay lại" → Trang chủ

---

### Buổi 5: Tổng Kết Tuần 1 — Tích Hợp MyStudentLife v1.0

**Bài tập Tổng Hợp:**
- Hoàn thiện tất cả 3 màn hình:
  1. **MainActivity:** Quote, bộ đếm, mục tiêu, lời chào
  2. **ProfileActivity:** Thông tin chi tiết
  3. **EditProfileActivity:** Form chỉnh sửa

**Tiêu chí:**
- ✅ Chạy không crash
- ✅ Navigation mượt (back button hoạt động)
- ✅ Dữ liệu truyền chính xác
- ✅ UI sạch sẽ, màu sắc nhất quán
- ✅ Padding/margin hợp lý

**Version:** MyStudentLife v1.0 ✅

---

## 📚 TUẦN 2: RECYCLERVIEW — QUẢN LÝ MÔN HỌC & CÔNG VIỆC (Buổi 6–10)

### Buổi 6: RecyclerView Cơ Bản — Danh Sách Môn Học

**Kiến thức:**
- RecyclerView, Adapter, ViewHolder
- LayoutManager (Linear, Grid)
- notifyDataSetChanged()

**Bài tập:**
1. Tạo `SubjectListActivity`
2. Tạo `adapter/SubjectAdapter.kt`:
   ```kotlin
   class SubjectAdapter(val subjects: List<MonHoc>) : 
       RecyclerView.Adapter<SubjectViewHolder>()
   ```
3. `item_subject.xml`: Tên môn, mã môn, số tín chỉ
4. 8-10 môn học hardcode trong Activity
5. Trên Trang chủ: Button "📚 Môn Học"

**File tạo:**
- `week2/SubjectListActivity.kt`
- `week2/adapter/SubjectAdapter.kt`
- `res/layout/activity_subject_list.xml`
- `res/layout/item_subject.xml`

**Checkpoint:** Danh sách môn scroll được

---

### Buổi 7: CardView — Giao Diện Đẹp

**Kiến thức:**
- CardView, Elevation, Margin
- Material Design
- GridLayoutManager(2)
- Badge, ProgressBar

**Bài tập:**
1. Nâng cấp `item_subject.xml`:
   ```
   - CardView
   - Icon/emoji môn học
   - Tên môn (bold, 18sp)
   - Điểm số (màu: ≥8 xanh, ≥6.5 cam, <6.5 đỏ)
   - Badge số tín chỉ
   - ProgressBar % hoàn thành
   ```

2. GridLayoutManager(2 cột)
3. Header GPA tổng

**File cập nhật:**
- `SubjectAdapter.kt` (cập nhật)
- `item_subject.xml` (cập nhật)

**Checkpoint:** Danh sách card, 2 cột, màu sắc theo điểm

---

### Buổi 8: Click Item — Chi Tiết Môn Học

**Kiến thức:**
- Click listener trong Adapter
- Intent, data passing
- Parcelable, Serializable

**Bài tập:**
1. Tạo `SubjectDetailActivity`
2. Thiết kế layout: Tên (lớn), Giảng viên, Phòng, Lịch, Điểm thành phần
3. Implement click:
   ```kotlin
   itemView.setOnClickListener {
       val intent = Intent(context, SubjectDetailActivity::class.java)
       intent.putExtra("subject_name", subject.tenMon)
       // ...
       context.startActivity(intent)
   }
   ```
4. SubjectDetailActivity nhận và hiển thị

**File tạo:**
- `SubjectDetailActivity.kt`
- `res/layout/activity_subject_detail.xml`

**Checkpoint:** Click card → detail hiển thị đầy đủ

---

### Buổi 9: CRUD Động — Thêm/Sửa/Xóa

**Kiến thức:**
- MutableList, add(), remove()
- AlertDialog, Dialog
- Snackbar, Toast
- ItemTouchHelper (swipe)

**Bài tập:**
1. Thêm FAB "+" → Dialog thêm môn
2. Long-click → xác nhận xóa
3. Edit icon → sửa thông tin
4. real-time update: `notifyDataSetChanged()`
5. Snackbar "Đã xóa", "Đã lưu"

**File cập nhật:**
- `SubjectListActivity.kt`
- `SubjectAdapter.kt`
- Tạo file dialog layout

**Checkpoint:** Add → danh sách update, delete → confirm + snackbar

---

### Buổi 10: Mini Project — Module To-Do List

**Bài tập:**
1. Data class `CongViec`:
   ```kotlin
   data class CongViec(
       val id: Int,
       val tieuDe: String,
       val moTa: String,
       val monHoc: String,
       val hanNop: String,
       var daHoanThanh: Boolean
   )
   ```

2. `TaskListActivity` + `TaskAdapter`
3. CardView: tiêu đề, môn (tag màu), hạn nộp, checkbox
4. CRUD đầy đủ, filter (Tất cả/Chưa xong/Đã xong)
5. Trang chủ: Button "✅ Công Việc", hiển thị số task chưa xong

**File tạo:**
- `week2/TaskListActivity.kt`
- `week2/model/CongViec.kt`
- `week2/adapter/TaskAdapter.kt`
- Layout files

**Version:** MyStudentLife v2.0 ✅

---

## 📚 TUẦN 3: DATABASE — DỮ LIỆU BỀN VỮNG (Buổi 11–15)

### Buổi 11: SharedPreferences — Cài Đặt

**Kiến thức:**
- SharedPreferences, MODE_PRIVATE
- getSharedPreferences(), edit(), apply()
- Lưu/đọc String, Boolean, Int

**Bài tập:**
1. Tạo `SettingsActivity`:
   - EditText lưu tên SV
   - RadioButton theme (Light/Dark)
   - Spinner cỡ chữ (Nhỏ/Vừa/Lớn)
   - Switch thông báo
   - Checkbox "Đã xem onboarding"

2. `PreferencesManager.kt`:
   ```kotlin
   fun saveName(context: Context, name: String) { ... }
   fun getName(context: Context): String { ... }
   ```

3. Trang chủ: Button ⚙️ → SettingsActivity
4. MainActivity đọc tên từ SharedPreferences

**File tạo:**
- `week3/SettingsActivity.kt`
- `week3/util/PreferencesManager.kt`
- `res/layout/activity_settings.xml`

**Checkpoint:** Lưu tên → đóng app → mở lại vẫn có

---

### Buổi 12: Room Database — Lưu Môn Học

**Kiến thức:**
- Room Entity, DAO, Database
- @Entity, @PrimaryKey, @Query
- @Insert, @Delete, @Update

**Bài tập:**
1. Tạo `SubjectEntity.kt`:
   ```kotlin
   @Entity(tableName = "mon_hoc")
   data class SubjectEntity(
       @PrimaryKey(autoGenerate = true) val id: Int = 0,
       val maMonHoc: String,
       val tenMon: String,
       val soTinChi: Int,
       var diemSo: Double?
   )
   ```

2. `SubjectDao.kt`:
   ```kotlin
   @Insert
   suspend fun insertSubject(subject: SubjectEntity)
   
   @Query("SELECT * FROM mon_hoc")
   suspend fun getAllSubjects(): List<SubjectEntity>
   
   @Delete
   suspend fun deleteSubject(subject: SubjectEntity)
   ```

3. `AppDatabase.kt`:
   ```kotlin
   @Database(entities = [SubjectEntity::class], version = 1)
   abstract class AppDatabase : RoomDatabase() {
       abstract fun subjectDao(): SubjectDao
   }
   ```

4. SubjectListActivity: thay hardcode bằng Room data

**File tạo:**
- `week3/data/local/entity/SubjectEntity.kt`
- `week3/data/local/dao/SubjectDao.kt`
- `week3/data/local/AppDatabase.kt`

**Checkpoint:** Thêm môn → lưu DB → mở lại vẫn có

---

### Buổi 13: CRUD Room + Repository

**Kiến thức:**
- Repository Pattern
- Coroutines, lifecycleScope.launch
- suspend function, async/await

**Bài tập:**
1. `SubjectRepository.kt`:
   ```kotlin
   class SubjectRepository(val dao: SubjectDao) {
       suspend fun insertSubject(subject: SubjectEntity) = dao.insertSubject(subject)
       suspend fun getAllSubjects() = dao.getAllSubjects()
       suspend fun deleteSubject(subject: SubjectEntity) = dao.deleteSubject(subject)
   }
   ```

2. TaskEntity + TaskDao + TaskRepository
3. SubjectListActivity sử dụng Repository:
   ```kotlin
   lifecycleScope.launch {
       val subjects = repository.getAllSubjects()
       // cập nhật adapter
   }
   ```

4. CRUD hoàn chỉnh: thêm/sửa/xóa task

**File tạo:**
- `week3/data/local/entity/TaskEntity.kt`
- `week3/data/local/dao/TaskDao.kt`
- `week3/data/repository/SubjectRepository.kt`
- `week3/data/repository/TaskRepository.kt`

**Checkpoint:** CRUD hoạt động, dữ liệu lưu vĩnh viễn

---

### Buổi 14: Search & Filter

**Kiến thức:**
- @Query nâng cao: LIKE, WHERE, ORDER BY
- LiveData, observe()
- SearchView, Spinner filter

**Bài tập:**
1. SubjectDao thêm:
   ```kotlin
   @Query("SELECT * FROM mon_hoc WHERE ten_mon LIKE '%' || :keyword || '%'")
   suspend fun searchSubjects(keyword: String): List<SubjectEntity>
   
   @Query("SELECT * FROM mon_hoc ORDER BY diem_so DESC")
   fun getAllSubjectsByScore(): LiveData<List<SubjectEntity>>
   ```

2. TaskListActivity:
   - Spinner filter (Tất cả/Chưa xong/Đã xong)
   - SearchView tìm task
   - Sắp xếp theo hạn nộp

3. SubjectListActivity:
   - SearchView tìm môn

**File cập nhật:**
- `SubjectDao.kt`, `TaskDao.kt`
- Activity layouts (thêm SearchView, Spinner)

**Checkpoint:** Tìm kiếm hoạt động, lọc chính xác

---

### Buổi 15: Mini Project — Module Chi Tiêu

**Bài tập:**
1. `ExpenseEntity.kt`:
   ```kotlin
   @Entity(tableName = "chi_tieu")
   data class ExpenseEntity(
       @PrimaryKey(autoGenerate = true) val id: Int = 0,
       val tieuDe: String,
       val soTien: Double,
       val loai: String, // Ăn/Di chuyển/Học/Giải trí/Khác
       val ngay: String,
       val ghiChu: String?
   )
   ```

2. ExpenseDao, ExpenseRepository (CRUD + sum theo loại/tháng)
3. `ExpenseListActivity`:
   - RecyclerView danh sách chi tiêu
   - CardView icon theo loại
   - Header tổng chi tiêu tháng
   - Filter theo loại

4. FAB thêm chi tiêu mới
5. Trang chủ: hiển thị tổng chi tiêu tháng này

**File tạo:**
- `week3/data/local/entity/ExpenseEntity.kt`
- `week3/data/local/dao/ExpenseDao.kt`
- `week3/data/repository/ExpenseRepository.kt`
- `ExpenseListActivity.kt`, `ExpenseAdapter.kt`, layouts

**Version:** MyStudentLife v3.0 ✅

---

## 📚 TUẦN 4: API & NETWORKING (Buổi 16–20)

### Buổi 16: Retrofit — Quotes API

**Kiến thức:**
- Retrofit, OkHttp
- JSON, GSON
- API endpoints, @GET/@POST
- Coroutines + Network calls

**Bài tập:**
1. Add Retrofit + Gson dependency
2. `QuoteApiService.kt`:
   ```kotlin
   interface QuoteApiService {
       @GET("random")
       suspend fun getQuote(): QuoteResponse
   }
   ```

3. `RetrofitInstance.kt`:
   ```kotlin
   object RetrofitInstance {
       private val retrofit = Retrofit.Builder()
           .baseUrl("https://dummyjson.com/quotes/")
           .addConverterFactory(GsonConverterFactory.create())
           .build()
       val api = retrofit.create(QuoteApiService::class.java)
   }
   ```

4. `Quote.kt` data class (JSON parsing)
5. MainActivity: gọi API lấy quote ngẫu nhiên
6. Xử lý lỗi: hiển thị quote mặc định nếu mất internet

**File tạo:**
- `week4/data/remote/api/QuoteApiService.kt`
- `week4/data/remote/RetrofitInstance.kt`
- `week4/data/model/Quote.kt`, `QuoteResponse.kt`

**Checkpoint:** Trang chủ quote từ internet

---

### Buổi 17: Glide — Load Ảnh từ URL

**Kiến thức:**
- Glide library
- load(), placeholder(), error()
- ImageView từ URL
- Caching

**Bài tập:**
1. Add Glide dependency
2. Load ảnh đại diện từ UI Avatars API:
   ```kotlin
   Glide.with(context)
       .load("https://ui-avatars.com/api/?name=Nguyen+Van+A&size=200")
       .placeholder(R.drawable.ic_placeholder)
       .error(R.drawable.ic_error)
       .into(imageView)
   ```

3. ProfileActivity load ảnh
4. SubjectListActivity thêm icon môn học
5. Placeholder khi đang load, error image nếu thất bại

**File cập nhật:**
- `ProfileActivity.kt`
- Layout files (thêm icon ImageView)
- Drawable resources

**Checkpoint:** Ảnh load từ URL, có placeholder

---

### Buổi 18: MVVM — Module Tin Tức

**Kiến thức:**
- MVVM pattern
- ViewModel, LiveData
- Repository với API
- StateFlow/Flow

**Bài tập:**
1. NewsApiService:
   ```kotlin
   @GET("top-headlines")
   suspend fun getNews(
       @Query("country") country: String,
       @Query("apiKey") apiKey: String
   ): NewsResponse
   ```

2. `NewsViewModel.kt`:
   ```kotlin
   class NewsViewModel(val repository: NewsRepository) : ViewModel() {
       val newsList = MutableLiveData<List<Article>>()
       fun fetchNews() { ... }
   }
   ```

3. `NewsRepository.kt`: gọi API, trả về data
4. `NewsActivity`: observe ViewModel, cập nhật UI
5. NewsAdapter + item_news.xml
6. Pull-to-refresh

**File tạo:**
- `week4/data/remote/api/NewsApiService.kt`
- `week4/data/model/Article.kt`, `NewsResponse.kt`
- `week4/data/repository/NewsRepository.kt`
- `week4/viewmodel/NewsViewModel.kt`
- `NewsActivity.kt`, `adapter/NewsAdapter.kt`, layouts

**Checkpoint:** NewsActivity hiển thị tin tức, click → xem URL

---

### Buổi 19: Weather API

**Kiến thức:**
- API keys, environment variables
- @Query params
- Response phức tạp (nested JSON)

**Bài tập:**
1. Đăng ký OpenWeatherMap API key
2. `WeatherApiService.kt`:
   ```kotlin
   @GET("weather")
   suspend fun getWeather(
       @Query("q") city: String,
       @Query("appid") apiKey: String,
       @Query("units") units: String = "metric"
   ): WeatherResponse
   ```

3. Parse response: temp, description, icon
4. MainActivity: card thời tiết nhỏ (Icon + Temp + Mô tả)
5. City từ SharedPreferences (Setting)
6. Glide load icon thời tiết từ URL

**File tạo:**
- `week4/data/remote/api/WeatherApiService.kt`
- `week4/data/model/Weather.kt`, `WeatherResponse.kt`
- `week4/data/repository/WeatherRepository.kt`
- Update MainActivity, layout

**Checkpoint:** Widget thời tiết hiển thị trên Trang chủ

---

### Buổi 20: Mini Project — Tab Discover

**Bài tập:**
Tạo tab/màn hình "Discover" tổng hợp:
1. **Section Tin tức:** 5 bài tin mới nhất (horizontal scroll RecyclerView)
2. **Section Thời tiết:** Card thời tiết 3 ngày (forecast)
3. **Section Quote:** Random quote + Refresh button
4. Pull-to-refresh toàn bộ
5. MVVM Architecture
6. Offline handling: Toast "Không có kết nối"

**File tạo:**
- `DiscoverFragment.kt` hoặc `DiscoverActivity.kt`
- `DiscoverViewModel.kt`
- `DiscoverRepository.kt`
- Layouts, adapters

**Version:** MyStudentLife v4.0 ✅

---

## 📚 TUẦN 5: FIREBASE — XÁC THỰC & CLOUD (Buổi 21–25)

### Buổi 21: Firebase Auth — Đăng Nhập/Đăng Ký

**Kiến thức:**
- Firebase Console setup
- Firebase Auth
- Email/Password authentication
- AuthStateListener

**Bài tập:**
1. Tạo Firebase project, download google-services.json
2. Add Firebase SDK
3. Enable Email/Password Auth
4. `LoginActivity.kt`:
   ```kotlin
   val email = editEmail.text.toString()
   val password = editPassword.text.toString()
   FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
       .addOnSuccessListener {
           startActivity(Intent(this, MainActivity::class.java))
           finish()
       }
   ```

5. `RegisterActivity.kt`: createUserWithEmailAndPassword()
6. Validation: email format, password ≥ 6 ký tự
7. ProgressBar khi xác thực
8. Error handling: sai password, email tồn tại

**File tạo:**
- `week5/auth/LoginActivity.kt`
- `week5/auth/RegisterActivity.kt`
- `week5/auth/AuthManager.kt`
- `res/layout/activity_login.xml`, `activity_register.xml`

**Checkpoint:** Đăng ký → Đăng nhập → MainActivity

---

### Buổi 22: Firestore — Đồng Bộ Cloud

**Kiến thức:**
- Firestore collections/documents
- CRUD operations
- addSnapshotListener (real-time)
- Queries (where, orderBy)

**Bài tập:**
1. Enable Firestore (test mode)
2. Cấu trúc dữ liệu:
   ```
   users/{userId}/subjects/
   users/{userId}/tasks/
   users/{userId}/expenses/
   ```

3. Migrate: mỗi khi add/update/delete → Firestore:
   ```kotlin
   db.collection("users").document(userId)
       .collection("subjects").add(subject)
   ```

4. `CloudSyncManager.kt`: quản lý Firestore operations
5. Real-time sync: addSnapshotListener()
6. Offline support: Firestore tự cache

**File tạo:**
- `week5/firebase/CloudSyncManager.kt`
- Update repositories (thêm Firestore logic)

**Checkpoint:** Thêm môn → sync Firestore, mở device khác vẫn có

---

### Buổi 23: Firebase Storage — Upload Ảnh

**Kiến thức:**
- Firebase Storage
- StorageReference
- Upload file, download URL
- Progress tracking

**Bài tập:**
1. Enable Firebase Storage
2. `StorageManager.kt`:
   ```kotlin
   val ref = storage.reference.child("profile_images/${userId}.jpg")
   ref.putFile(imageUri)
       .addOnSuccessListener {
           ref.downloadUrl.addOnSuccessListener { uri ->
               // Lưu URI vào Firestore
           }
       }
   ```

3. ProfileActivity:
   - ImageView + Button "Chọn ảnh"
   - registerForActivityResult() (Gallery)
   - Upload → ProgressBar
   - Save URL vào Firestore
4. Load ảnh bằng Glide từ download URL

**File tạo/cập nhật:**
- `week5/firebase/StorageManager.kt`
- `ProfileActivity.kt` (cập nhật)

**Checkpoint:** Chọn ảnh → upload → profile load, sync nhiều device

---

### Buổi 24: FCM — Push Notifications

**Kiến thức:**
- Firebase Cloud Messaging
- FirebaseMessagingService
- Notification channels (Android 8+)
- Foreground vs background

**Bài tập:**
1. Add FCM dependency
2. `MyFirebaseMessagingService.kt`:
   ```kotlin
   class MyFirebaseMessagingService : FirebaseMessagingService() {
       override fun onMessageReceived(remoteMessage: RemoteMessage) {
           // Xử lý notification
           showNotification(remoteMessage.notification?.title, ...)
       }
   }
   ```

3. Tạo Notification Channel:
   ```kotlin
   val channel = NotificationChannel("deadline", "Deadline", IMPORTANCE_DEFAULT)
   ```

4. Build notification:
   ```kotlin
   NotificationCompat.Builder(this, "deadline")
       .setSmallIcon(R.drawable.ic_notification)
       .setContentTitle("Nhắc nhở")
       .setContentText("Task sắp deadline")
       .setContentIntent(pendingIntent)
   ```

5. Test từ Firebase Console
6. Logic nhắc nhở: check task hôm nay, gửi notification

**File tạo:**
- `week5/firebase/MessagingService.kt`

**Checkpoint:** Gửi notification từ Console → app hiển thị, click → TaskActivity

---

### Buổi 25: Mini Project — Chat Nhóm Real-time

**Bài tập:**
1. `Message.kt`:
   ```kotlin
   data class Message(
       val id: String = "",
       val senderId: String = "",
       val senderName: String = "",
       val content: String = "",
       val timestamp: Long = 0L
   )
   ```

2. `ChatActivity.kt`:
   - RecyclerView tin nhắn (kiểu WhatsApp)
   - Gửi: phải, xanh
   - Nhận: trái, xám

3. Firestore collection "chat_rooms/{roomId}/messages":
   ```kotlin
   db.collection("chat_rooms").document(roomId)
       .collection("messages").add(message)
   ```

4. Real-time sync: addSnapshotListener()
5. EditText + Button gửi → auto load toàn bộ user
6. Hiển thị tên + thời gian

**File tạo:**
- `week5/ChatActivity.kt`
- `week5/ChatAdapter.kt`
- `week5/firebase/ChatManager.kt`
- `week5/model/Message.kt`
- Layouts

**Version:** MyStudentLife v5.0 ✅

---

## 📚 TUẦN 6: MATERIAL DESIGN & PUBLISHING (Buổi 26–30)

### Buổi 26: Material Design — Redesign UI

**Kiến thức:**
- Material 3 Theme
- Material Components
- Snackbar vs Toast
- Bottom Sheet Dialog

**Bài tập:**
1. Update `res/values/themes.xml`:
   ```xml
   <style name="Theme.MyStudentLife" parent="Theme.Material3.DayNight">
       <item name="colorPrimary">@color/primary</item>
       <item name="colorSecondary">@color/secondary</item>
   </style>
   ```

2. Thay AlertDialog → MaterialAlertDialog
3. Thay Toast → Snackbar (với action "UNDO")
4. Form thêm → Bottom Sheet Dialog
5. Chip filter (Tất cả / Chưa xong / Đã xong)
6. Extended FAB với icon + text
7. TextInputLayout (Outlined Box) cho form

**File cập nhật:**
- `res/values/colors.xml`, `themes.xml`
- Tất cả Activity layouts

**Checkpoint:** App Material 3 theme, snackbar, bottom sheet

---

### Buổi 27: Fragments & Navigation

**Kiến thức:**
- Fragment lifecycle
- Navigation Component
- NavGraph, NavController
- SafeArgs

**Bài tập:**
1. Chuyển Activity → Fragment:
   - `HomeFragment` (Trang chủ)
   - `SubjectFragment` (Môn học)
   - `TaskFragment` (Công việc)
   - `ExpenseFragment` (Chi tiêu)
   - `ProfileFragment` (Hồ sơ)

2. Create `nav_graph.xml`:
   ```xml
   <navigation>
       <fragment android:id="@+id/homeFragment" ...>
           <action android:id="@+id/action_home_to_subject" .../>
       </fragment>
   </navigation>
   ```

3. MainActivity chỉ chứa FragmentContainerView
4. Truyền dữ liệu: SafeArgs
5. Transition animations: slide_in_right, slide_out_left

**File tạo/cập nhật:**
- `week6/ui/fragment/HomeFragment.kt`, etc
- `MainActivity.kt` (đơn giản hóa)
- `nav_graph.xml`
- Fragment layouts

**Checkpoint:** Single-activity app, navigation hoạt động

---

### Buổi 28: Bottom Navigation — Navigation Hoàn Chỉnh

**Kiến thức:**
- BottomNavigationView
- NavigationUI.setupWithNavController()
- Navigation Drawer (tùy chọn)
- ViewPager2 + TabLayout

**Bài tập:**
1. Thêm BottomNavigationView:
   ```xml
   <com.google.android.material.bottomnavigation.BottomNavigationView
       android:id="@+id/bottomNav"
       app:menu="@menu/bottom_menu" />
   ```

2. `res/menu/bottom_menu.xml`: 4 items
   - 🏠 Home
   - 📚 Subject
   - ✅ Task
   - 👤 Profile

3. Setup:
   ```kotlin
   NavigationUI.setupWithNavController(bottomNav, navController)
   ```

4. Fragment "Profile" → Drawer/Menu:
   - Chi tiêu, Settings, Chat, Discover, Logout

5. SubjectDetailFragment: TabLayout + ViewPager2
   - Tab 1: Thông tin
   - Tab 2: Ghi chú

**File tạo/cập nhật:**
- `MainActivity.kt` (thêm BottomNav)
- `activity_main.xml` (BottomNav)
- `res/menu/bottom_menu.xml`
- Fragment layouts

**Checkpoint:** 4 tabs navigation, click icon → fragment đúng

---

### Buổi 29: Animations

**Kiến thức:**
- ValueAnimator, ObjectAnimator
- Transition API
- RecyclerView item animation
- Shared element transition

**Bài tập:**
1. GPA counter animation (0 → giá trị thật):
   ```kotlin
   ValueAnimator.ofFloat(0f, gpa).apply {
       duration = 1000
       addUpdateListener { gpaTextView.text = it.animatedValue.toString() }
       start()
   }
   ```

2. RecyclerView item fade-in:
   ```kotlin
   adapter.setHasStableIds(true)
   itemAnimator = DefaultItemAnimator()
   ```

3. FAB rotate khi click
4. Shared element transition: card → detail (ảnh expand)
5. Swipe-to-delete animation (ItemTouchHelper)
6. Splash screen: logo scale + fade animation

**File tạo/cập nhật:**
- `week6/ui/animation/Animations.kt`
- Activity/Fragment files

**Checkpoint:** App có animations mượt mà

---

### Buổi 30: Build & Publish

**Kiến thức:**
- Build variants, ProGuard/R8
- Signing APK/AAB
- Play Console, versioning

**Bài tập:**
1. Create app icon (Image Asset Studio):
   - Regular icon + adaptive icon
   - Notifications icon

2. `build.gradle.kts`:
   ```kotlin
   android {
       defaultConfig {
           versionCode = 1
           versionName = "1.0.0"
           minSdk = 24
           targetSdk = 34
       }
       buildTypes {
           release {
               isMinifyEnabled = true
           }
       }
   }
   ```

3. Generate signed APK:
   - Build > Generate Signed Bundle/APK
   - Tạo keystore
   - Release config

4. Metadata:
   - App name: "My Student Life"
   - Description tiếng Việt + Anh
   - Screenshots (4 cái)
   - Privacy policy

5. Build ProGuard rules (nếu cần)

**File cập nhật:**
- `build.gradle.kts`
- Drawable resources (icon)

**Version:** MyStudentLife v6.0 ✅

---

## 📚 TUẦN 7–8: DỰ ÁN CÁ NHÂN (Buổi 31–40)

### Buổi 31–32: Lên Ý Tưởng & Thiết Kế

1. Sinh viên brainstorm ý tưởng app
2. Project Brief (1 trang): Tên, mô tả, đối tượng, features
3. Wireframe trên giấy hoặc Figma
4. Giảng viên duyệt
5. Thiết kế data model

### Buổi 33–37: Phát Triển

- Code theo kế hoạch
- Checkpoint hàng buổi
- Feedback 1-1 từ giảng viên
- Yêu cầu: RecyclerView, Room, 1 API, Material, Navigation, MVVM

### Buổi 38–39: Hoàn Thiện

- Fix bugs, polish UI
- Thêm animations
- Test trên nhiều kích thước
- Chuẩn bị bài thuyết trình (5-7 phút)

### Buổi 40: Demo Day

- Trình bày 5–7 phút
- Q&A
- Bình chọn "App ấn tượng nhất"

---

## 🎯 Tiêu Chí Đánh Giá

| Tiêu chí | Tỷ lệ | Chi tiết |
|---------|------|---------|
| Bài tập hàng buổi | 30% | Hoàn thành, code chạy, đúng yêu cầu |
| MyStudentLife v6.0 | 30% | Features hoạt động, UI đẹp, không crash |
| Dự án cá nhân | 30% | Sáng tạo, hoàn thiện, áp dụng kiến thức |
| Demo Day | 10% | Rõ ràng, tự tin, trả lời tốt |

---

**Chúc sinh viên học tập vui vẻ! 🎉**

Tác giả: Lê Tiến Hiếu  
Email: letienhieu@vute.edu.vn

