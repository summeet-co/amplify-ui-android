pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "amplify-ui-android"
include(":liveness")
include(":authenticator")
include(":testing")

// Typesafe-акцессоры включались бы на всю сборку и при подключении форка в TWA
// ломали бы генерацию акцессора для android-browser-helper (дефисы в имени).
// Вместо них обычный project(":testing") в двух модулях.
