# Hướng dẫn tạo project Android mới giống mẫu

## 1. Tạo project Android mới
1. Mở Android Studio → Chọn New Project.
2. Chọn Empty Activity → Next.
3. Đặt tên project, ví dụ: mystudentlife.
4. Chọn Language: Kotlin.
5. Chọn Minimum SDK (ví dụ: API 24 trở lên).
6. Nhấn Finish để tạo project.

## 2. Cấu trúc thư mục cần biết
- app/src/main/java/<tên_package>/: Chứa code Kotlin (MainActivity, SettingsActivity, ...)
- app/src/main/res/layout/: Chứa file layout XML (nếu dùng XML)
- app/src/main/AndroidManifest.xml: Khai báo các Activity, quyền, ...
- app/build.gradle.kts và build.gradle.kts: File cấu hình build (giữ nguyên mặc định).

## 3. Tạo các file code chính
### a. MainActivity.kt
- Vào thư mục: app/src/main/java/com/hltech/mystudentlife/
- Tạo file: MainActivity.kt
- Dán code MainActivity đã chú thích vào file này.

### b. SettingsActivity.kt
- Vào thư mục: app/src/main/java/com/hltech/mystudentlife/
- Tạo file: SettingsActivity.kt
- Dán code SettingsActivity đã chú thích vào file này.

### c. (Nếu dùng layout XML cho Settings)
- Vào thư mục: app/src/main/res/layout/
- Tạo file: activity_settings.xml
- Dán code layout đã chú thích vào file này.

## 4. Khai báo Activity trong AndroidManifest.xml
- Mở file: app/src/main/AndroidManifest.xml
- Thêm dòng sau vào trong thẻ <application>:
```xml
<activity android:name=".SettingsActivity" />
```
(MainActivity đã có sẵn khi tạo project.)

## 5. Thêm theme (nếu có)
- Nếu sử dụng Compose, có thể tạo file MystudentlifeTheme.kt trong thư mục ui/theme/ (Android Studio tạo sẵn khi chọn Compose).

## 6. Build và chạy thử
- Nhấn nút Run (hình tam giác xanh) trên Android Studio để build và chạy ứng dụng trên máy ảo hoặc thiết bị thật.

## 7. Giải thích cách hoạt động
- MainActivity: Quản lý giao diện chính, gọi màn hình cài đặt khi bấm nút bánh răng.
- SettingsActivity: Cho phép thay đổi tên, chủ đề, cỡ chữ, thông báo, lưu vào SharedPreferences.
- OnboardingScreen: Hiện lần đầu khi chưa xem hướng dẫn.
- SharedPreferences: Lưu các cài đặt của người dùng.

## 8. Lưu ý
- Khi tạo file, phải đúng tên và đúng thư mục.
- Nếu dùng Compose, không cần file layout XML cho MainActivity.
- Nếu gặp lỗi, kiểm tra lại package, tên file, và khai báo trong Manifest.

Nếu làm đúng các bước trên, sẽ tạo được project giống mẫu.
