rootProject.name = "gradle-issue-duplicate-plugin-version"

include("child-project")
includeBuild(rootDir.resolve("other-build"))

dependencyResolutionManagement {
    versionCatalogs {
        register("libs") {
            plugin("otherBuildPlugin", "com.github.kelemen.other-build-plugin")
                .version("1.0") // If we set this to "1.1", then all is fine
        }
    }
}
