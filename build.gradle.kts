plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.8.0"
    id("com.apollographql.apollo3") version "3.7.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3:apollo-runtime:3.7.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

apollo {
    service("service") {
        packageName.set("com.example")
    }
}
