import org.springframework.boot.gradle.tasks.bundling.BootJar

tasks.withType<BootJar> {
    enabled = false
}

tasks.withType<Jar> {
    enabled = true
}

dependencies {
    implementation(project(":noti-core"))
    implementation(project(":noti-common"))
    testImplementation(testFixtures(project(":noti-core")))
    testImplementation(testFixtures(project(":noti-common")))

    implementation("org.springframework.boot:spring-boot-starter-web")

    // Swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.4")
}
