plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "server"

include("Estate-Batch-Module")
include("Commercial-Analysis-Module")
include("Dispatcher-Module")
