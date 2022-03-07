plugins {
    id("dev.clojurephant.clojure") version "0.6.0"
}

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://repo.clojars.org")
}

dependencies {
    implementation("org.clojure:clojure:1.10.3")
    testRuntimeOnly("org.ajoberstar:jovial:0.4.0-beta.0.1+1d3e723")
}

tasks.withType<Test>() {
    useJUnitPlatform()
}
