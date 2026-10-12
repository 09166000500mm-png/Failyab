plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "ir.mirasmelk.failyab"
    compileSdk = 35
    defaultConfig {
        applicationId = "ir.mirasmelk.failyab"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0.0"
    }
}
