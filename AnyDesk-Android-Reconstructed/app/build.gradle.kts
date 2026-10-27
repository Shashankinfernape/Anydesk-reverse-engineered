plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.anydesk.anydeskandroid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.anydesk.anydeskandroid"
        minSdk = 21
        targetSdk = 34
        versionCode = 90902
        versionName = "9.9.1-handesk"

        ndk {
            abiFilters.addAll(listOf("arm64-v8a"))
        }

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    sourceSets {
        getByName("main") {
            jniLibs.srcDirs("src/main/jniLibs")
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
}

tasks.withType<JavaCompile>().configureEach {
    enabled = false
}

afterEvaluate {
    fun syncApk() {
        val rootDir = rootProject.projectDir
        project.exec {
            workingDir = rootDir
            commandLine("cmd", "/c", "${rootDir}\\build_apk.bat")
        }
        val releaseApk = file("${rootDir}/release/AnyHandesk.apk")
        val buildDir = layout.buildDirectory.asFile.get()
        val interApk = file("${buildDir}/intermediates/apk/debug/app-debug.apk")
        val outApk = file("${buildDir}/outputs/apk/debug/app-debug.apk")
        interApk.parentFile.mkdirs()
        outApk.parentFile.mkdirs()
        if (releaseApk.exists()) {
            releaseApk.copyTo(interApk, overwrite = true)
            releaseApk.copyTo(outApk, overwrite = true)
            val idsig = file("${rootDir}/release/AnyHandesk.apk.idsig")
            if (idsig.exists()) {
                val interIdsig = file("${buildDir}/intermediates/apk/debug/app-debug.apk.idsig")
                val outIdsig = file("${buildDir}/outputs/apk/debug/app-debug.apk.idsig")
                idsig.copyTo(interIdsig, overwrite = true)
                idsig.copyTo(outIdsig, overwrite = true)
            }
        }
    }

    tasks.findByName("packageDebug")?.doLast { syncApk() }
    tasks.findByName("assembleDebug")?.doLast { syncApk() }
}
