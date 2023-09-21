plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
}

kapt {
    arguments {
        arg("AROUTER_MODULE_NAME", project.name)
    }
}

android {

    namespace = "com.alibaba.android.arouter"
    compileSdk = rootProject.extra["compile_api"] as Int

    defaultConfig {

        minSdk = rootProject.extra["min_api"] as Int

        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:${rootProject.extra["ktx_ver"]}")
    implementation("androidx.appcompat:appcompat:${rootProject.extra["compat_ver"]}")
    implementation("com.google.android.material:material:${rootProject.extra["mater_ver"]}")

    api(project(":arouter-annotation"))
    kapt(project(":arouter-compiler"))
}