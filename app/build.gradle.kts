import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.3.3/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven("https://github-package-registry-mirror.gc.nav.no/cached/maven-release")
}

dependencies {
    implementation("io.ktor:ktor-server-core:1.6.7")
    implementation("io.ktor:ktor-server-netty:1.6.7")
    implementation("io.ktor:ktor-client-jackson:1.6.7")

    implementation("io.ktor:ktor-client-core:1.6.7")
    implementation("io.ktor:ktor-client-cio:1.6.7")

    implementation("io.ktor:ktor-auth:1.6.7")
    implementation("io.ktor:ktor-client-auth:1.6.7")

    implementation("io.ktor:ktor-metrics-micrometer:1.6.7")
    implementation("io.micrometer:micrometer-registry-prometheus:1.8.2")

    implementation("no.nav.security:token-validation-ktor:1.3.10")
    implementation("no.nav.security:token-client-core:1.3.10")

    implementation("com.sksamuel.hoplite:hoplite-yaml:1.4.16")

    // serialiserig til/fra json på kafka
    implementation("io.ktor:ktor-serialization:1.6.7")

    implementation("ch.qos.logback:logback-classic:1.2.10")
    implementation("io.ktor:ktor-jackson:1.6.7")
    runtimeOnly("net.logstash.logback:logstash-logback-encoder:7.0.1")

    implementation("org.apache.kafka:kafka-clients:3.1.0")
    // JsonSerializer java 8 LocalDate
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.1")

    testImplementation(kotlin("test"))
    testImplementation("io.ktor:ktor-server-test-host:1.6.7")
    testImplementation("no.nav.security:mock-oauth2-server:0.4.2")
    // used to override env var runtime
    testImplementation("uk.org.webcompere:system-stubs-jupiter:2.0.0")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    withType<Test> {
        useJUnitPlatform()
    }
}

application {
    // Define the main class for the application.
    mainClass.set("no.nav.aap.AppKt")
}
