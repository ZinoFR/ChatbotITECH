plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("com.aallam.openai:openai-client:3.7.2")
    implementation ("com.aallam.openai:openai-client-bom:3.7.2")
    implementation ("com.aallam.openai:openai-client")
    runtimeOnly ("io.ktor:ktor-client-okhttp")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}