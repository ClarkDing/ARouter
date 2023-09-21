plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("com.alibaba:arouter-annotation:1.0.6")

    kapt("com.google.auto.service:auto-service:1.0-rc7")
    compileOnly("com.google.auto.service:auto-service-annotations:1.0-rc7")

    implementation("com.squareup:javapoet:1.13.0")

    implementation("org.apache.commons:commons-lang3:3.5")
    implementation("org.apache.commons:commons-collections4:4.1")

    implementation("com.alibaba:fastjson:1.2.69")
}
