plugins {
    id("java")
}

group = "org.teleight"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("org.teleight:TeleightBots:1.0")
    annotationProcessor("org.teleight:TeleightBots:1.0")
}

tasks {
    jar {
        archiveFileName.set("TestExtension.jar")
    }
}
