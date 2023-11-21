////no java
//tasks.named("classes") {
//    enabled = false
//}
//tasks.named("testClasses") {
//    enabled = false
//}

plugins {
    kotlin("jvm") version "2.0.0-Beta1"
    `maven-publish`
}

group = "com.lazyengineer"
version = "0.1.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.microsoft.playwright:playwright:1.40.0")

    implementation(kotlin("reflect"))

    // https://mvnrepository.com/artifact/com.squareup/kotlinpoet
    implementation("com.squareup:kotlinpoet:1.14.2")
    implementation("com.squareup:kotlinpoet-metadata:1.14.2")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.7.0")
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
//    useCompilerVersion("2.0.0-dev-5387")
//    jvmToolchain(17)
//    sourceSets.all {
//        languageSettings {
//            languageVersion = "2.0"
//        }
//    }
}

tasks.register<JavaExec>("playwrightInstall") {
    description = "Run playwright CLI install, which downloads browsers"
    group = ApplicationPlugin.APPLICATION_GROUP
    classpath = sourceSets["main"].runtimeClasspath
    args("install")
    mainClass.set("com.microsoft.playwright.CLI")
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

