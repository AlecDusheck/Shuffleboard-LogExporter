plugins {
    `java-library`
}

repositories {
    mavenCentral()
    maven {
        name = "WPILib"
        setUrl("https://first.wpi.edu/FRC/roborio/maven/release")
    }
}

dependencies {
    compileOnly(group = "edu.wpi.first.shuffleboard", name = "api", version = "1.3.1")
}