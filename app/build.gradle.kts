plugins {
    alias(libs.plugins.android.application)
    //Обязательно добавить!
    id("com.google.devtools.ksp") version "2.2.10-2.0.2"
    id("androidx.navigation.safeargs.kotlin")version "2.9.6"
}
//Это создается сразу
android {
    namespace = "com.example.stopwatch"// здесь должно быть ваше название
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }


    defaultConfig {
        applicationId = "com.example.stopwatch"// здесь должно быть ваше название
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    //Обязательно добавить
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    //Это должно быть при создании проекта
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    //Это добавить
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.9.8")
    implementation("androidx.navigation:navigation-ui-ktx:2.9.8")
    implementation("androidx.room:room-runtime:2.7.2")
    implementation("androidx.room:room-ktx:2.7.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.cardview:cardview:1.0.0")
}