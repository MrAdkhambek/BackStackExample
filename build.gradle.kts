// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    val kotlin_version by extra("1.5.21")
    repositories {
        google()
        jcenter()
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.5.10"))
        classpath(kotlin("serialization", version = "1.5.10"))

        classpath("com.android.tools.build", "gradle", "4.2.2")
        classpath("com.google.dagger", "hilt-android-gradle-plugin", "2.37")
        classpath("androidx.navigation","navigation-safe-args-gradle-plugin","2.3.5")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}