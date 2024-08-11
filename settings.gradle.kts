pluginManagement {
    repositories {
        maven {
            url = uri("https://inexus.samentic.com/repository/samentic-android/")
            credentials {
                username = "vira"
                password = "w-!Mze&LY8MVEMG"
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://inexus.samentic.com/repository/samentic-android/")
            credentials {
                username = "vira"
                password = "w-!Mze&LY8MVEMG"
            }
        }
    }
}

rootProject.name = "CodeAdvancePractice"
include(":app")
 