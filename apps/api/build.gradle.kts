plugins {
    id("platform.spring-boot-app")
}

dependencies {
    implementation(project(":libs:domain"))
    implementation(libs.platform.http.starter)
    implementation("org.apache.commons:commons-lang3")

    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
}
