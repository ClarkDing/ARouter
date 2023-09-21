plugins {
    id("com.android.application")
    id("com.alibaba.arouter")
}

android {

    namespace = "com.alibaba.android.arouter.demo"
    compileSdk = rootProject.extra["compile_api"] as Int

    defaultConfig {

        applicationId = "com.alibaba.android.arouter.demo"

        minSdk = rootProject.extra["min_api"] as Int
        targetSdk = rootProject.extra["compile_api"] as Int

        versionCode = 1
        versionName = "1.0.1"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":arouter-api"))

    implementation("androidx.appcompat:appcompat:${rootProject.extra["compat_ver"]}")
    implementation("com.google.android.material:material:${rootProject.extra["mater_ver"]}")
}