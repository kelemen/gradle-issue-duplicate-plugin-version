plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "com.github.kelemen.${rootProject.name}"
version = "1.1"

publishing {
    publications {
        register<MavenPublication>("main") {
            from(components["java"])
        }
    }
}
