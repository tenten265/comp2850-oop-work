plugins {
    kotlin("jvm") version "1.5.31"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5:5.0.0")
    testImplementation("io.kotest:kotest-assertions-core:5.0.0")
}

tasks.test {
    useJUnitPlatform()
}