// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    extra.apply {
        set("compile_api", 33)
        set("min_api", 23)

        set("ktx_ver", "1.9.0")
        set("compat_ver", "1.6.1")
        set("mater_ver", "1.8.0")
        set("room_ver", "2.5.1")
        set("json_ver", "2.9.0")
        set("coil_core_ver", "1.1.1")
        set("coil_ver", "1.3.2")
        set("ktx_act", "1.7.0")
        set("ktx_frag", "1.6.1")
    }

    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://artifacts.applovin.com/android")
        maven("https://artifact.bytedance.com/repository/pangle")
        maven("https://dl-maven-android.mintegral.com/repository/mbridge_android_sdk_oversea")
    }

    dependencies {
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.5")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}