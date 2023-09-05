plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish") // publishing locally
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    publishing {
        publications {
            create<MavenPublication>("maven"){
                artifactId = "degrees"
            }
        }
    }

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishLibraryVariants("release", "debug")
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.example.degrees"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
group = "com.example.library"
version = "1.0.0"