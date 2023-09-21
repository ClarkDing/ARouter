plugins {
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.jvm")
    id("groovy")
}

dependencies {

    implementation(localGroovy()) //groovy sdk
    implementation(gradleApi())

//    // Importance: 如果使用了buildSrc，必须添加这两个，否则module中的DataBinding无法使用
    implementation("com.android.tools.build:gradle:7.3.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")

    // javassist
    implementation("org.javassist:javassist:3.20.0-GA")

    // asm
    implementation("org.ow2.asm:asm:9.3")
    implementation("org.ow2.asm:asm-commons:9.3")

    implementation("commons-codec:commons-codec:1.11")
    implementation("commons-io:commons-io:2.4")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


