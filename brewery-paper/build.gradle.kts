plugins {
    java

    `brewery-project`
    `brewery-repositories`

    id("com.gradleup.shadow") version "9.0.0-beta4"
    id("net.minecrell.plugin-yml.paper") version "0.6.0"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation(project(":brewery-core"))

    // paper api
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")

    // libraries
    implementation("org.yaml:snakeyaml:2.3")
    implementation("org.flywaydb:flyway-core:11.1.1")
    implementation("com.j256.ormlite:ormlite-jdbc:6.1")
    implementation("com.jeff-media:custom-block-data:2.2.3")

    // dev experience
    compileOnly("org.jetbrains:annotations:26.0.1")

    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    runServer {
        minecraftVersion("1.21.4")
    }
}

paper {
    name = "Brewery"
    version = project.version as String
    main = "dev.breweryteam.brewery.paper.BreweryPaperPlugin"
    description = "Rewrite"
    apiVersion = "1.21.4"
}
