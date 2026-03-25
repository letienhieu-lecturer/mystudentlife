# My Student Life - Ứng Dụng Quản Lý Cuộc Sống Sinh Viên

> **Ứng dụng Android hoàn chỉnh được xây dựng qua 30 buổi học (Tuần 1–6), bao gồm Kotlin, Android Studio, RecyclerView, Room Database, API/Retrofit, Firebase, Material Design, và Publishing lên Play Store.**

Ứng dụng di động được xây dựng bằng **Kotlin** để quản lý thông tin và các chức năng hỗ trợ sinh viên trong cuộc sống hàng ngày.

## 📋 Thông Tin Dự Án

- **Tên ứng dụng:** My Student Life (MyStudentLife)
- **Nền tảng:** Android
- **Ngôn ngữ:** Kotlin
- **Kiến trúc:** MVVM + Repository Pattern + Clean Architecture
- **Database:** Room Database + Firestore
- **API:** Retrofit, Firebase Cloud Messaging, APIs (News, Weather, Quotes)
- **UI Framework:** Material Design 3 + Jetpack Compose (Tuần 6+)

## 👨‍🏫 Tác Giả và Địa Chỉ

**Tác giả:** Lê Tiến Hiếu

**Vị trí:** Giảng viên, Trường Đại Học Sư Phạm Kỹ Thuật Vinh

**Email:** letienhieu@vute.edu.vn

**Trường học:** Trường Đại Học Sư Phạm Kỹ Thuật Vinh

## 📚 Mục Đích Sử Dụng

Repo này được tạo ra với mục đích **giáo dục** và **tham khảo học tập** cho các sinh viên theo học môn:

- **Lập Trình Ứng Dụng Di Động (Mobile Application Development)**
- **Android Development**
- **Khóa học intensive: 30 buổi × 4 giờ = 160 giờ học lập trình Android**

Sinh viên có thể sử dụng dự án này để:
- Tham khảo từng bước xây dựng một ứng dụng thực tế hoàn chỉnh
- Học tập về Kotlin, Android Studio, và best practices
- Hiểu rõ hơn về quản lý dữ liệu (SharedPreferences, Room Database, Firestore)
- Tìm hiểu về networking (Retrofit, API), Firebase, và notifications
- Nắm vững Material Design, Navigation Component, Fragments, RecyclerView
- Chuẩn bị publish ứng dụng lên Google Play Store

## 🎯 Tính Năng Hoàn Chỉnh (Tuần 1-6)

MyStudentLife sẽ bao gồm:
- ✅ Quản lý hồ sơ cá nhân sinh viên (Tuần 1)
- ✅ Quản lý môn học và điểm số (Tuần 2)
- ✅ Danh sách công việc (To-Do) theo môn (Tuần 2)
- ✅ Theo dõi chi tiêu cá nhân (Tuần 3)
- ✅ Cài đặt ứng dụng (Tuần 3)
- ✅ Tin tức và thời tiết từ API thực (Tuần 4)
- ✅ Đăng nhập/Đăng ký tài khoản (Firebase Authentication) (Tuần 5)
- ✅ Đồng bộ dữ liệu lên Cloud (Firestore) (Tuần 5)
- ✅ Upload ảnh đại diện (Firebase Storage) (Tuần 5)
- ✅ Push Notifications nhắc deadline (Firebase Cloud Messaging) (Tuần 5)
- ✅ Chat nhóm học tập real-time (Tuần 5)
- ✅ Giao diện Material Design hoàn chỉnh với Bottom Navigation (Tuần 6)
- ✅ Animations mượt mà (Tuần 6)
- ✅ Sẵn sàng publish lên Play Store (Tuần 6)

## 📖 Lộ Trình Phát Triển Theo Tuần

### **TUẦN 1: NỀN TẢNG KOTLIN & ANDROID — KHUNG XƯƠNG APP (Buổi 1–5)**

**Mục tiêu:** Xây dựng khung xương ứng dụng với 3 màn hình cơ bản

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 1 | Kotlin Cơ Bản — Data Model | Data classes (SinhVien, MonHoc) | - |
| 2 | Android Studio — Trang Chủ | Trang chủ + thông tin SV + lời chào | - |
| 3 | Button & Sự Kiện | Bộ đếm giờ, mục tiêu ngày, quote | - |
| 4 | Intent — Màn Hình Hồ Sơ | Profile + Edit Profile Activity | - |
| 5 | Tổng Kết & Tích Hợp | Hoàn thiện v1.0 | **v1.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week1/`

---

### **TUẦN 2: RECYCLERVIEW — QUẢN LÝ MÔN HỌC & CÔNG VIỆC (Buổi 6–10)**

**Mục tiêu:** Tích hợp RecyclerView, CRUD môn học và công việc

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 6 | RecyclerView Cơ Bản | Danh sách môn học hardcode | - |
| 7 | CardView — Giao Diện Đẹp | Nâng cấp UI, Grid Layout | - |
| 8 | Click Item — Chi Tiết | SubjectDetailActivity | - |
| 9 | CRUD Động | Thêm/Sửa/Xóa môn học | - |
| 10 | Mini Project — To-Do List | Module công việc hoàn chỉnh | **v2.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week2/`

---

### **TUẦN 3: DATABASE — DỮ LIỆU BỀN VỮNG (Buổi 11–15)**

**Mục tiêu:** Sử dụng SharedPreferences + Room Database, triển khai Repository Pattern

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 11 | SharedPreferences | Cài đặt ứng dụng | - |
| 12 | Room Database | Lưu môn học vĩnh viễn | - |
| 13 | CRUD Room + Repository | CRUD hoàn chỉnh, Repository Pattern | - |
| 14 | Search & Filter | Tìm kiếm + lọc dữ liệu | - |
| 15 | Mini Project — Expenses | Module chi tiêu | **v3.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week3/`

---

### **TUẦN 4: API & NETWORKING — DỮ LIỆU THỰC (Buổi 16–20)**

**Mục tiêu:** Kết nối API thực tế, triển khai MVVM Architecture

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 16 | Retrofit — Quotes API | Quotes thực từ API | - |
| 17 | Glide & JSON | Ảnh đại diện từ URL | - |
| 18 | MVVM + News Module | Kiến trúc MVVM, tin tức | - |
| 19 | API Keys — Weather | Widget thời tiết real-time | - |
| 20 | Mini Project — Discover | Tab khám phá tổng hợp | **v4.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week4/`

---

### **TUẦN 5: FIREBASE — XÁC THỰC & CLOUD (Buổi 21–25)**

**Mục tiêu:** Tích hợp Firebase Auth, Firestore, Storage, Cloud Messaging, Chat real-time

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 21 | Firebase Auth | Đăng nhập/Đăng ký | - |
| 22 | Firestore Database | Đồng bộ dữ liệu cloud | - |
| 23 | Firebase Storage | Upload ảnh đại diện | - |
| 24 | FCM Notifications | Push nhắc deadline | - |
| 25 | Mini Project — Chat | Chat nhóm real-time | **v5.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week5/`

---

### **TUẦN 6: MATERIAL DESIGN & PUBLISHING (Buổi 26–30)**

**Mục tiêu:** Nâng cấp UI Material Design 3, chuyển sang Single-Activity + Navigation, thêm animations, publish

| Buổi | Nội dung | Bài tập | Phiên bản |
|------|---------|--------|----------|
| 26 | Material Design Redesign | Thiết kế lại toàn bộ UI | - |
| 27 | Fragments & Navigation | Chuyển sang Single-Activity | - |
| 28 | Bottom Navigation | 4-tab navigation hoàn chỉnh | - |
| 29 | Animations | Hiệu ứng mượt mà | - |
| 30 | Build & Publish | Signed APK, Play Store | **v6.0** |

**📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/week6/`

---

### **TUẦN 7–8: DỰ ÁN CÁ NHÂN (Buổi 31–40)**

**Mục tiêu:** Sinh viên tự thiết kế và xây dựng app theo ý tưởng riêng

📁 Code Path:** `app/src/main/java/com/hltech/mystudentlife/personal_project/`

**Yêu cầu tối thiểu:**
- RecyclerView hiển thị danh sách
- Room Database lưu trữ
- 1 API từ internet
- Material Design
- Navigation Component + Fragments
- Kiến trúc MVVM hoặc Repository Pattern
- Xử lý lỗi (network, empty state, loading)

## 📄 Bản Quyền và Giấy Phép

### Bản Quyền (Copyright)

```
© 2026 Lê Tiến Hiếu
Trường Đại Học Sư Phạm Kỹ Thuật Vinh
```

Tất cả các nội dung, mã nguồn, và tài liệu trong repo này đều thuộc quyền sở hữu của tác giả.

### Điều Khoản Sử Dụng

**Cho phép:**
- ✅ Xem, học tập và tham khảo mã nguồn
- ✅ Fork repo cho mục đích học tập cá nhân
- ✅ Sử dụng làm nền tảng cho các bài tập, đồ án môn học
- ✅ Sửa đổi code phục vụ cho quá trình học tập

**Không cho phép:**
- ❌ Sử dụng cho mục đích thương mại mà không có sự cho phép
- ❌ Loại bỏ thông tin bản quyền gốc
- ❌ Phân phối hoặc bán lại mã nguồn này
- ❌ Tuyên bố mình là tác giả gốc của dự án

## 🎓 Hướng Dẫn Sử Dụng Cho Sinh Viên

### Yêu Cầu Hệ Thống:
- Android Studio 2022.1 hoặc mới hơn
- JDK 11 hoặc mới hơn
- Android SDK 21 hoặc mới hơn
- Gradle 7.0+

### Cách Clone và Chạy:

```bash
# Clone repository
git clone https://github.com/letienhieu-lecturer/buoi11-mystudentlife.git

# Mở với Android Studio
# File > Open > Chọn thư mục đã clone

# Build và chạy
# Click "Run" hoặc Shift + F10 (Windows) / Control + R (Mac)
```

## 📂 Cấu Trúc Dự Án

```
mystudentlife/
├── app/
│   ├── src/main/java/com/hltech/mystudentlife/
│   │   ├── week1/                          # TUẦN 1: Nền tảng Kotlin & Android
│   │   │   ├── model/
│   │   │   │   ├── SinhVien.kt
│   │   │   │   ├── MonHoc.kt
│   │   │   │   └── Constants.kt
│   │   │   ├── MainActivity.kt             # Trang chủ + lời chào
│   │   │   ├── ProfileActivity.kt          # Hồ sơ sinh viên
│   │   │   ├── EditProfileActivity.kt      # Chỉnh sửa hồ sơ
│   │   │   └── utils/
│   │   │       └── DateTimeUtils.kt
│   │   │
│   │   ├── week2/                          # TUẦN 2: RecyclerView & CRUD
│   │   │   ├── model/
│   │   │   │   ├── MonHoc.kt (updated)
│   │   │   │   └── CongViec.kt
│   │   │   ├── adapter/
│   │   │   │   ├── SubjectAdapter.kt
│   │   │   │   └── TaskAdapter.kt
│   │   │   ├── SubjectListActivity.kt      # Danh sách môn học
│   │   │   ├── SubjectDetailActivity.kt    # Chi tiết môn học
│   │   │   ├── TaskListActivity.kt         # Danh sách công việc
│   │   │   └── ui/
│   │   │       └── SubjectCardViewHolder.kt
│   │   │
│   │   ├── week3/                          # TUẦN 3: Database & Repository
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   │   ├── AppDatabase.kt
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── SubjectDao.kt
│   │   │   │   │   │   ├── TaskDao.kt
│   │   │   │   │   │   └── ExpenseDao.kt
│   │   │   │   │   └── entity/
│   │   │   │   │       ├── SubjectEntity.kt
│   │   │   │   │       ├── TaskEntity.kt
│   │   │   │   │       └── ExpenseEntity.kt
│   │   │   │   └── repository/
│   │   │   │       ├── SubjectRepository.kt
│   │   │   │       ├── TaskRepository.kt
│   │   │   │       └── ExpenseRepository.kt
│   │   │   ├── SettingsActivity.kt         # Cài đặt (SharedPreferences)
│   │   │   ├── ExpenseListActivity.kt      # Quản lý chi tiêu
│   │   │   └── utils/
│   │   │       └── PreferencesManager.kt
│   │   │
│   │   ├── week4/                          # TUẦN 4: API & MVVM
│   │   │   ├── data/
│   │   │   │   ├── remote/
│   │   │   │   │   ├── api/
│   │   │   │   │   │   ├── QuoteApiService.kt
│   │   │   │   │   │   ├── NewsApiService.kt
│   │   │   │   │   │   └── WeatherApiService.kt
│   │   │   │   │   └── RetrofitInstance.kt
│   │   │   │   └── model/
│   │   │   │       ├── Quote.kt
│   │   │   │       ├── Article.kt
│   │   │   │       └── Weather.kt
│   │   │   ├── viewmodel/
│   │   │   │   ├── QuoteViewModel.kt
│   │   │   │   ├── NewsViewModel.kt
│   │   │   │   └── WeatherViewModel.kt
│   │   │   ├── repository/
│   │   │   │   ├── QuoteRepository.kt
│   │   │   │   ├── NewsRepository.kt
│   │   │   │   └── WeatherRepository.kt
│   │   │   ├── NewsActivity.kt             # Tin tức
│   │   │   ├── DiscoverFragment.kt         # Tab khám phá
│   │   │   └── adapter/
│   │   │       ├── NewsAdapter.kt
│   │   │       └── NewsViewHolder.kt
│   │   │
│   │   ├── week5/                          # TUẦN 5: Firebase
│   │   │   ├── auth/
│   │   │   │   ├── LoginActivity.kt
│   │   │   │   ├── RegisterActivity.kt
│   │   │   │   └── AuthManager.kt
│   │   │   ├── firebase/
│   │   │   │   ├── CloudSyncManager.kt     # Firestore sync
│   │   │   │   ├── StorageManager.kt       # Firebase Storage
│   │   │   │   ├── MessagingService.kt     # FCM
│   │   │   │   └── ChatManager.kt          # Real-time chat
│   │   │   ├── ChatActivity.kt
│   │   │   ├── ChatAdapter.kt
│   │   │   └── model/
│   │   │       └── Message.kt
│   │   │
│   │   ├── week6/                          # TUẦN 6: Material Design & Navigation
│   │   │   ├── ui/
│   │   │   │   ├── fragment/
│   │   │   │   │   ├── HomeFragment.kt     # Trang chủ (Fragment)
│   │   │   │   │   ├── SubjectFragment.kt  # Môn học (Fragment)
│   │   │   │   │   ├── TaskFragment.kt     # Công việc (Fragment)
│   │   │   │   │   ├── ProfileFragment.kt  # Hồ sơ (Fragment)
│   │   │   │   │   └── SettingsFragment.kt # Cài đặt (Fragment)
│   │   │   │   ├── theme/
│   │   │   │   │   ├── Color.kt
│   │   │   │   │   ├── Type.kt
│   │   │   │   │   └── Theme.kt
│   │   │   │   └── animation/
│   │   │   │       └── Animations.kt
│   │   │   ├── MainActivity.kt             # Single Activity (Fragment container)
│   │   │   └── nav_graph.xml               # Navigation graph
│   │   │
│   │   ├── personal_project/               # TUẦN 7-8: Dự án cá nhân
│   │   │   └── (Tương tự cấu trúc trên)
│   │   │
│   │   ├── common/                         # Code dùng chung
│   │   │   ├── base/
│   │   │   │   ├── BaseActivity.kt
│   │   │   │   ├── BaseFragment.kt
│   │   │   │   └── BaseViewModel.kt
│   │   │   ├── util/
│   │   │   │   ├── Constants.kt
│   │   │   │   ├── Extensions.kt
│   │   │   │   └── ValidationUtils.kt
│   │   │   └── view/
│   │   │       └── CustomViews.kt
│   │   │
│   │   ├── AndroidManifest.xml
│   │   └── res/
│   │       ├── layout/
│   │       ├── values/
│   │       │   ├── colors.xml
│   │       │   ├── strings.xml
│   │       │   ├── themes.xml
│   │       │   └── dimens.xml
│   │       └── drawable/
│   │
│   └── build.gradle.kts
│
├── build.gradle.kts
├── settings.gradle.kts
├── README.md
├── CURRICULUM.md                  # Tài liệu chi tiết cho mỗi buổi
└── TROUBLESHOOTING.md             # Gợi ý debug
```

### Quy Ước Đặt Tên File
- **Activity:** `[Feature]Activity.kt` (VD: `MainActvity.kt`, `ProfileActivity.kt`)
- **Fragment:** `[Feature]Fragment.kt` (VD: `HomeFragment.kt`, `SettingsFragment.kt`)
- **Adapter:** `[ItemType]Adapter.kt` (VD: `SubjectAdapter.kt`, `NewsAdapter.kt`)
- **ViewModel:** `[Feature]ViewModel.kt` (VD: `SubjectViewModel.kt`)
- **Repository:** `[Feature]Repository.kt` (VD: `SubjectRepository.kt`)
- **Layout:** `activity_[name].xml`, `fragment_[name].xml`, `item_[name].xml`
- **Entity/Model:** `[Model]Entity.kt`, `[Model].kt`

## 🎓 Hướng Dẫn Học Tập Chi Tiết

### 📍 Bắt Đầu - Tuần 1 (Buổi 1-5)

**Buổi 1: Kotlin Cơ Bản**
- 📚 Học: Kotlin data class, null safety, hàm
- 🎯 Bài tập: Tạo `week1/model/SinhVien.kt` và `MonHoc.kt`
- ✅ Kiểm tra: Code chạy đúng trên Kotlin Playground

**Buổi 2: Android Studio & Layout**
- 📚 Học: Project structure, XML layout, TextView, LinearLayout
- 🎯 Bài tập: Tạo `MainActivity.kt`, `activity_main.xml` với thông tin SV
- ✅ Kiểm tra: App hiển thị tiêu đề, thông tin SV, GPA, lời chào thông minh

**Buổi 3: Button & Sự Kiện**
- 📚 Học: Button, setOnClickListener, Toast, EditText, cập nhật UI
- 🎯 Bài tập: Thêm bộ đếm giờ, mục tiêu ngày, quote ngẫu nhiên
- ✅ Kiểm tra: Click button → đếm giờ, lưu mục tiêu, hiển thị quote

**Buổi 4: Intent & Navigation**
- 📚 Học: Intent explicit, putExtra, getExtra, múltiple Activity
- 🎯 Bài tập: Tạo `ProfileActivity.kt`, `EditProfileActivity.kt`
- ✅ Kiểm tra: Click "Xem Hồ Sơ" → mở profile, chỉnh sửa → lưu

**Buổi 5: Tích Hợp v1.0**
- 📚 Học: Review, tối ưu, polish UI
- 🎯 Bài tập: Hoàn thiện 3 màn hình, navigation mượt
- ✅ Kiểm tra: **MyStudentLife v1.0** chạy không crash, 3 màn hình hoạt động

---

### 📍 Tuần 2: RecyclerView (Buổi 6-10)

**Buổi 6: RecyclerView Cơ Bản**
- 📚 Học: RecyclerView, Adapter, ViewHolder, LayoutManager
- 🎯 Bài tập: Tạo `week2/SubjectListActivity.kt`, `adapter/SubjectAdapter.kt`
- ✅ Kiểm tra: Danh sách 8-10 môn học scrollable

**Buổi 7: CardView & Material Design**
- 📚 Học: CardView, GridLayoutManager, icon, badge, progress bar
- 🎯 Bài tập: Nâng cấp `item_subject.xml` thành CardView đẹp
- ✅ Kiểm tra: Danh sách dạng card 2 cột, điểm có màu sắc

**Buổi 8: Click & Details**
- 📚 Học: Click listener trong adapter, Intent, data passing
- 🎯 Bài tập: Tạo `SubjectDetailActivity.kt`
- ✅ Kiểm tra: Click card → detail screen hiển thị đầy đủ

**Buổi 9: CRUD Động**
- 📚 Học: MutableList, notifyDataSetChanged, AlertDialog, Snackbar
- 🎯 Bài tập: Thêm FAB, Dialog thêm/sửa/xóa, real-time update
- ✅ Kiểm tra: Thêm → danh sách update, xóa → confirm, snackbar

**Buổi 10: Mini Project - To-Do**
- 📚 Học: Module riêng biệt, CRUD từ đầu
- 🎯 Bài tập: Tạo `TaskListActivity.kt`, task filter
- ✅ Kiểm tra: **MyStudentLife v2.0** có môn học + công việc

---

### 📍 Tuần 3: Database (Buổi 11-15)

**Buổi 11: SharedPreferences**
- 📚 Học: SharedPreferences, MODE_PRIVATE, apply/commit
- 🎯 Bài tập: Tạo `SettingsActivity.kt`, `util/PreferencesManager.kt`
- ✅ Kiểm tra: Lưu thông tin → restart app vẫn có

**Buổi 12: Room Cơ Bản**
- 📚 Học: Room Entity, DAO, @Insert/@Query, Database class
- 🎯 Bài tập: Tạo `data/local/entity/SubjectEntity.kt`, DAO, AppDatabase
- ✅ Kiểm tra: Thêm môn → lưu DB → restart app vẫn có

**Buổi 13: CRUD Room + Repository**
- 📚 Học: @Update/@Delete, Repository Pattern, Coroutines cơ bản
- 🎯 Bài tập: Tạo `SubjectRepository.kt`, `TaskRepository.kt`
- ✅ Kiểm tra: CRUD môn học và công việc với DB

**Buổi 14: Search & Filter**
- 📚 Học: @Query nâng cao (LIKE, ORDER BY), LiveData
- 🎯 Bài tập: SearchView, filter task theo trạng thái
- ✅ Kiểm tra: Tìm kiếm hoạt động, lọc chính xác

**Buổi 15: Mini Project - Expense**
- 📚 Học: Tạo module quản lý chi tiêu từ đầu
- 🎯 Bài tập: Entity, DAO, Repository, Activity, filter
- ✅ Kiểm tra: **MyStudentLife v3.0** có 4 module với DB hoàn chỉnh

---

### 📍 Tuần 4: API & MVVM (Buổi 16-20)

**Buổi 16: Retrofit & Quotes API**
- 📚 Học: Retrofit, JSON parsing, API calls, Coroutines
- 🎯 Bài tập: Tạo `data/remote/api/QuoteApiService.kt`, retrofit setup
- ✅ Kiểm tra: Trang chủ quote từ internet

**Buổi 17: Glide & JSON**
- 📚 Học: Glide load image, placeholder, error handling
- 🎯 Bài tập: Load ảnh đại diện từ URL, card icon
- ✅ Kiểm tra: Profile, card môn học hiển thị ảnh từ URL

**Buổi 18: MVVM Architecture**
- 📚 Học: MVVM, ViewModel, LiveData, Repository
- 🎯 Bài tập: Tạo News module (ViewModel, Repository, API Service)
- ✅ Kiểm tra: NewsActivity hiển thị tin tức qua ViewModel

**Buổi 19: Weather API**
- 📚 Học: API keys, @Query params, response phức tạp
- 🎯 Bài tập: OpenWeatherMap API, weather widget trên trang chủ
- ✅ Kiểm tra: Widget thời tiết temp + icon từ API

**Buổi 20: Mini Project - Discover**
- 📚 Học: Tổng hợp multiple APIs vào tab
- 🎯 Bài tập: Discover tab (tin tức + thời tiết + quote)
- ✅ Kiểm tra: **MyStudentLife v4.0** API hoàn chỉnh

---

### 📍 Tuần 5: Firebase (Buổi 21-25)

**Buổi 21: Firebase Auth**
- 📚 Học: Firebase setup, Auth, Email/Password, AuthStateListener
- 🎯 Bài tập: `LoginActivity.kt`, `RegisterActivity.kt`
- ✅ Kiểm tra: Đăng ký → Đăng nhập → Trang chủ

**Buổi 22: Firestore Database**
- 📚 Học: Firestore collections, CRUD, addSnapshotListener
- 🎯 Bài tập: Migrate data → Firestore, real-time sync
- ✅ Kiểm tra: Thêm môn → cloud sync, multiple devices

**Buổi 23: Firebase Storage**
- 📚 Học: Firebase Storage, upload/download, StorageReference
- 🎯 Bài tập: Upload ảnh đại diện, load từ Storage
- ✅ Kiểm tra: Chọn ảnh → upload → profile load

**Buổi 24: FCM Notifications**
- 📚 Học: Firebase Cloud Messaging, Notification channels
- 🎯 Bài tập: `MessagingService.kt`, test notification
- ✅ Kiểm tra: App nhận notification, click → mở app

**Buổi 25: Mini Project - Chat**
- 📚 Học: Real-time Firestore, chat UI pattern
- 🎯 Bài tập: `ChatActivity.kt`, real-time message sync
- ✅ Kiểm para: **MyStudentLife v5.0** Firebase hoàn chỉnh

---

### 📍 Tuần 6: Material Design & Publishing (Buổi 26-30)

**Buổi 26: Material Design**
- 📚 Học: Material 3 Theme, Components, Bottom Sheet, Chip
- 🎯 Bài tập: Redesign UI với Material Components
- ✅ Kiểm tra: App có Material theme, snackbar, bottom sheet

**Buổi 27: Fragments & Navigation**
- 📚 Học: Fragment, Navigation Component, NavGraph
- 🎯 Bài tập: Chuyển Activity → Fragment, tạo nav_graph
- ✅ Kiểm tra: Single-activity app, navigation hoạt động

**Buổi 28: Bottom Navigation**
- 📚 Học: BottomNavigationView, NavigationUI, TabLayout
- 🎯 Bài tập: Thêm bottom nav, 4 tabs, setup NavController
- ✅ Kiểm tra: 4 tabs hoạt động, click icon đúng fragment

**Buổi 29: Animations**
- 📚 Học: ValueAnimator, Transition API, shared element
- 🎯 Bài tập: GPA animation, item fade-in, transition
- ✅ Kiểm tra: App có animations mượt mà

**Buổi 30: Build & Publish**
- 📚 Học: Build variants, ProGuard, signing, Play Console
- 🎯 Bài tập: Signed APK/AAB, metadata (icon, description)
- ✅ Kiểm para: **MyStudentLife v6.0** sẵn sàng publish

---

## 🚀 Cách Sử Dụng Repository

### ❓ Tôi bắt đầu từ đâu?

1. **Clone repo:**
   ```bash
   git clone https://github.com/letienhieu-lecturer/buoi11-mystudentlife.git
   cd mystudentlife
   ```

2. **Mở Android Studio:**
   - File > Open > Chọn thư mục mystudentlife
   - Đợi Gradle sync xong

3. **Tuần 1 - Bắt đầu code:**
   - Tạo folder `week1` trong `app/src/main/java/com/hltech/mystudentlife/`
   - Tạo file `SinhVien.kt`, `MonHoc.kt`
   - Tạo file `MainActivity.kt`
   - Follow các bước trong "Hướng Dẫn Học Tập Chi Tiết" bên trên

4. **Tuần 2-6:**
   - Tương tự, follow folder tuần tương ứng
   - Code file trong folder đó
   - Test khi hoàn thành buổi

### ❓ Tôi gặp lỗi, xem ở đâu?

**Compile Error:**
- Kiểm tra import statement
- Run `Build > Clean Project`
- Run `Build > Rebuild Project`
- Gradle sync

**Runtime Error:**
- Mở Logcat (Android Studio > bottom > Logcat)
- Tìm exception message
- So sánh code với solution ở folder tuần

**Logic Error:**
- Debug mode: Click dòng code → F9, Run > Debug
- Step through code bằng F10/F11
- Xem biến value ở Debugger window

**File Not Found:**
- Kiểm tra path, layout file names
- Run `File > Invalidate Caches > Invalidate and Restart`

### ❓ Tôi muốn xem solution?

Files trong folder tuần là **completed version** cho buổi đó.

Xem chi tiết từng buổi:
```bash
# Xem tất cả file Kotlin trong week1
ls -la app/src/main/java/com/hltech/mystudentlife/week1/

# So sánh file (nếu dùng git)
git diff week1/MainActivity.kt week2/MainActivity.kt

# Xem git history
git log --oneline -- "app/src/main/java/com/hltech/mystudentlife/week1/*"
```

### ❓ Tôi muốn thêm/chỉnh sửa layout?

Tất cả file XML layout trong:
```
app/src/main/res/layout/
```

Ví dụ:
- `activity_main.xml` → MainActivity
- `item_subject.xml` → RecyclerView item cho môn học
- `activity_subject_detail.xml` → SubjectDetailActivity

Resources khác:
```
app/src/main/res/
├── values/
│   ├── colors.xml        # App colors
│   ├── strings.xml       # Text constants
│   ├── themes.xml        # Theme definitions
│   └── dimens.xml        # Padding, margin sizes
├── drawable/             # Icons, drawables
└── layout/               # All XML layout files
```

### ❓ Làm sao để test app?

**Emulator:**
- Tools > Device Manager
- Tạo virtual device (Nexus 5 API 30+)
- Run app

**Real Device:**
- USB debugging ON
- Connect device
- Choose device in Run dialog
- Run app

**Test Checklist:**
- ✅ Không crash
- ✅ Data lưu/load đúng
- ✅ Click button → đúng action
- ✅ Navigation mượt
- ✅ Layout đẹp trên multiple screen sizes

---

## 🎯 Dự Án Cá Nhân (Tuần 7-8)

**Yêu cầu bắt buộc:**
1. ✅ **RecyclerView** - Hiển thị danh sách data chính
2. ✅ **Room Database** - Lưu trữ bền vững
3. ✅ **1 API từ Internet** - Retrofit + JSON parsing
4. ✅ **Material Design** - Material theme + components
5. ✅ **Navigation** - Fragments + NavGraph
6. ✅ **MVVM/Repository** - Clean architecture
7. ✅ **Error Handling** - Network, empty, loading states

**Gợi ý ý tưởng:**
| App | API | Tính năng |
|-----|-----|---------|
| 🍽️ Nấu Ăn | TheMealDB | Công thức, nguyên liệu, search |
| 📚 Đọc Sách | Open Library | Danh sách sách, review, ratings |
| 🎬 Phim | TMDB | Phim phổ biến, chi tiết, trending |
| 🏋️ Fitness | (Local) | Tracking bài tập, calories, chart |
| ✈️ Du Lịch | Google Maps | Địa điểm, review, lịch trình |
| 🎵 Nhạc | Spotify/YouTube | Playlist, trending, favorites |

**Folder:** `app/src/main/java/com/hltech/mystudentlife/personal_project/`

**Deadline:** Buổi 40 - Demo Day

---

## 🤝 Đóng Góp và Phản Hồi

Sinh viên có thể:
- Báo cáo lỗi (Issues) qua GitHub
- Tạo Pull Request với các cải tiến hoặc sửa lỗi
- Gửi phản hồi hay đề xuất cho tác giả

## 📞 Liên Hệ

Để liên hệ với tác giả hoặc có thắc mắc về dự án:
- **Qua trường:** Trường Đại Học Sư Phạm Kỹ Thuật Vinh
- **GitHub:** [@letienhieu-lecturer](https://github.com/letienhieu-lecturer)

## 📝 Ghi Chú Phiên Bản

- **v1.0.0** (2026-03-25): Phiên bản đầu tiên với các chức năng cơ bản
  - Onboarding Screen
  - Main Screen với Settings
  - Theme Support (Light/Dark)
  - SharedPreferences

## ⚠️ Tuyên Bố Miễn Trừ Trách Nhiệm

Dự án này được cung cấp cho mục đích **giáo dục** không có bảo đảm gì về tính sử dụng được. Tác giả không chịu trách nhiệm về bất kỳ thiệt hại nào phát sinh từ việc sử dụng dự án này.

---

**Lần cập nhật cuối:** 25/03/2026

**Tác giả:** Lê Tiến Hiếu - Trường Đại Học Sư Phạm Kỹ Thuật Vinh

