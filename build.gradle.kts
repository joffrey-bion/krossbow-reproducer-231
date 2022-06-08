plugins {
    kotlin("multiplatform") version "1.6.21"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    iosArm64 {
        binaries {
            framework {
                baseName = "app"
            }
        }
    }
    iosX64 {
        binaries {
            framework {
                baseName = "app"
            }
        }
    }
    sourceSets {
        val iosArm64Main by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
                implementation("org.hildan.krossbow:krossbow-stomp-kxserialization:3.6.0")
                implementation("org.hildan.krossbow:krossbow-websocket-ktor:3.6.0")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
            }
        }
        val iosX64Main by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
                implementation("org.hildan.krossbow:krossbow-stomp-kxserialization:3.6.0")
                implementation("org.hildan.krossbow:krossbow-websocket-ktor:3.6.0")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
            }
        }
        val iosX64Test by getting
    }
}
