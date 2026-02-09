plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.yad.godotservicedemo"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.yad.godotservicedemo"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        // 关键：让 gradle 不忽略 Godot 的隐藏目录
        aaptOptions {
            ignoreAssetsPattern = "!.svn:!.git:!.gitignore:!.ds_store:!*.scc:<dir>_*:!CVS:!thumbs.db:!picasa.ini:!*~"
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("org.godotengine:godot:4.6.0.stable")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}