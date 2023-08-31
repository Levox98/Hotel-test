object Dependencies {

    object Kotlin {
        const val kotlin_version = "1.8.10"
        private const val core_version = "1.9.0"
        private const val compat_version = "1.6.1"

        val coreKtx = "androidx.core:core-ktx:$core_version"
        val appCompat = "androidx.appcompat:appcompat:$compat_version"
    }

    object Retrofit {
        private const val version = "2.9.0"

        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }

    object Dagger {
        const val version = "2.48"

        val dagger = "com.google.dagger:dagger:$version"
        val kapt = "com.google.dagger:dagger-compiler:$version"
    }

    object Interface {
        private const val material_version = "1.8.0"
        private const val constraint_layout_version = "2.1.4"

        val material = "com.google.android.material:material:$material_version"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraint_layout_version"
    }

    private const val API_URL = "https://run.mocky.io/v3/35e0d18e-2521-4f1b-a575-f0fe366f66e3"
}