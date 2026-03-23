# Cấu trúc thư mục project Android (mystudentlife)

```
mystudentlife/
├── build.gradle.kts                # File cấu hình build cho toàn project
├── gradle.properties               # Các thuộc tính cấu hình cho Gradle
├── gradlew, gradlew.bat            # Script để build project trên các hệ điều hành
├── local.properties                # Thông tin cấu hình máy local (không commit lên git)
├── settings.gradle.kts              # File cấu hình các module cho project
├── app/                            # Thư mục chính của ứng dụng
│   ├── build.gradle.kts            # File cấu hình build cho module app
│   ├── proguard-rules.pro          # Quy tắc nén và bảo vệ mã nguồn
│   ├── src/                        # Mã nguồn ứng dụng
│   │   ├── main/                   # Mã nguồn chính
│   │   │   ├── AndroidManifest.xml # Khai báo các activity, quyền, ...
│   │   │   ├── java/               # Thư mục chứa code Kotlin/Java
│   │   │   │   └── com/hltech/mystudentlife/
│   │   │   │       ├── MainActivity.kt
│   │   │   │       └── SettingsActivity.kt
│   │   │   └── res/                # Thư mục chứa tài nguyên (layout, drawable, values...)
│   │   │       └── layout/
│   │   │           └── activity_settings.xml
│   │   ├── test/                   # Thư mục cho unit test
│   │   └── androidTest/            # Thư mục cho UI test
│   └── build/                      # Thư mục build tự động sinh ra (có thể bỏ qua)
├── gradle/                         # Thư mục chứa các file wrapper cho Gradle
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
```

## Giải thích:
- **mystudentlife/**: Thư mục gốc của project.
- **app/**: Module chính của ứng dụng Android.
- **src/main/java/**: Chứa code nguồn Kotlin/Java.
- **src/main/res/**: Chứa tài nguyên như layout, icon, string, ...
- **src/main/AndroidManifest.xml**: Khai báo các thành phần của app.
- **build.gradle.kts**: File cấu hình build cho project/module.

Sinh viên chỉ cần quan tâm chủ yếu đến thư mục `app/src/main/java/` (code), `app/src/main/res/` (giao diện, tài nguyên), và `app/src/main/AndroidManifest.xml` (khai báo app).
