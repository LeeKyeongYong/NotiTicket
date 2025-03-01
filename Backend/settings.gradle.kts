plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "backend"
include("noti-core")
include("noti-api")
include("noti-common")
