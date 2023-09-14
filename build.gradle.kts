//no java
tasks.named("classes") {
    enabled = false
}
tasks.named("testClasses") {
    enabled = false
}

plugins {
    kotlin("jvm") version "1.9.20-Beta"
    `maven-publish`
}

group = "com.lazyengineer"
version = "0.1.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.microsoft.playwright:playwright:1.37.0")
    compileOnly("org.junit.jupiter:junit-jupiter-api:5.9.3")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.platform:junit-platform-launcher:1.9.3")
    testImplementation("io.kotest:kotest-assertions-core:5.6.2")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
//    jvmToolchain(19)
//    sourceSets.all {
//        languageSettings {
//            languageVersion = "2.0"
//        }
//    }
}



// isn't faster yet:
//tasks.named("compileKotlin", org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask::class.java) {
//    compilerOptions {
//        freeCompilerArgs.add("-Xuse-fast-jar-file-system")
//    }
//}
//tasks.named("compileTestKotlin", org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask::class.java) {
//    compilerOptions {
//        freeCompilerArgs.add("-Xuse-fast-jar-file-system")
//    }
//}

if (hasProperty("buildScan")) {
    extensions.findByName("buildScan")?.withGroovyBuilder {
        setProperty("termsOfServiceUrl", "https://gradle.com/terms-of-service")
        setProperty("termsOfServiceAgree", "yes")
    }
}

