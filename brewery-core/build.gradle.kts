plugins {
    java

    `brewery-project`
    `brewery-repositories`
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")

    compileOnly("org.jetbrains:annotations:26.0.1")
}
