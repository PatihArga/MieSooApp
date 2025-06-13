plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.miesooapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.miesooapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Perbaikan: Gunakan tanda kutip ganda dan hilangkan spasi ekstra
    // Saran: Sebaiknya definisikan versi ini di libs.versions.toml
    implementation(libs.androidx.cardview) // VERSU KADALUARSA
    // Anda sudah punya libs.androidx.constraintlayout di atas, ini duplikat
    // implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Duplikat & versi mungkin tidak konsisten dengan libs.androidx.constraintlayout
}