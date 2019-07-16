import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.41"
}

group = "ru.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("org.jetbrains.kotlin:kotlin-script-runtime:1.3.41")

    compile("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.3.41")
    compile("org.jetbrains.kotlin:kotlin-script-util:1.3.41")
    runtime("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:1.3.41")
    testCompile("org.jetbrains.kotlin:kotlin-test-junit:1.3.41")
    testCompile("junit:junit:4.12")
    testRuntime("org.jetbrains.kotlin:kotlin-reflect:1.3.41")
    //compileOnly("compiler:cli-common") // TODO: fix import (workaround for jps build)
    //testCompileOnly("core:util.runtime") // TODO: fix import (workaround for jps build)
    //testCompileOnly("daemon-common:1.3.41") // TODO: fix import (workaround for jps build)
    testRuntime("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:1.3.41")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}