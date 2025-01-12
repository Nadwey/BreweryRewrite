plugins {
    `java-library`
}

group = "dev.breweryteam.brewery"
version = "0.0.1-SNAPSHOT"

tasks.withType<JavaCompile> {
    options.compilerArgs = listOf("-Xlint:deprecation", "-parameters")
    options.encoding = "UTF-8"
}
