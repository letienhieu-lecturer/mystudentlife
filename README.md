# My Student Life - Ứng Dụng Quản Lý Sinh Viên

Ứng dụng di động được xây dựng bằng **Kotlin** và **Jetpack Compose** để quản lý thông tin và các chức năng hỗ trợ sinh viên.

## 📋 Thông Tin Dự Án

- **Tên ứng dụng:** My Student Life
- **Nền tảng:** Android
- **Ngôn ngữ:** Kotlin
- **Framework UI:** Jetpack Compose

## 👨‍🏫 Tác Giả và Địa Chỉ

**Tác giả:** Lê Tiến Hiếu

**Vị trí:** Giảng viên, Trường Đại Học Sư Phạm Kỹ Thuật Vinh

**Email:** letienhieu@vute.edu.vn

**Trường học:** Trường Đại Học Sư Phạm Kỹ Thuật Vinh

## 📚 Mục Đích Sử Dụng

Repo này được tạo ra với mục đích **giáo dục** và **tham khảo học tập** cho các sinh viên theo học môn:

- **Lập Trình Ứng Dụng Di Động (Mobile Application Development)**
- **Android Development**

Sinh viên có thể sử dụng dự án này để:
- Tham khảo các best practices trong phát triển ứng dụng Android
- Học tập về Kotlin và Jetpack Compose
- Hiểu rõ hơn về quản lý trạng thái (State Management) trong ứng dụng
- Tìm hiểu về SharedPreferences và lưu trữ dữ liệu cấp độ ứng dụng

## 📖 Nội Dung Chính

### Các Tính Năng Chính:
- **Onboarding Screen:** Màn hình hướng dẫn lần đầu sử dụng
- **Main Screen:** Giao diện chính hiển thị thông tin cá nhân
- **Settings Screen:** Cài đặt ứng dụng (chủ đề, cỡ chữ, thông báo)
- **Theme Support:** Hỗ trợ chế độ sáng (Light) và tối (Dark)
- **Responsive UI:** Giao diện thích ứng với các kích thước màn hình khác nhau

### Công Nghệ Sử Dụng:
- Kotlin
- Jetpack Compose
- Material Design 3
- SharedPreferences
- Activity Result API

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

### Cấu Trúc Dự Án:

```
mystudentlife/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/hltech/mystudentlife/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── SettingsActivity.kt
│   │   │   │   └── ui/theme/
│   │   │   └── AndroidManifest.xml
│   │   ├── test/
│   │   └── androidTest/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

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

