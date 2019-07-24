plugins {
    `java-library`
    id("org.openjfx.javafxplugin") version "0.0.7"
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

javafx {
    version = "12"
    modules("javafx.controls", "javafx.fxml")
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}