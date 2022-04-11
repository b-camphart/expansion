plugins {
    kotlin("multiplatform") version "1.6.20"
}

group = "io.github.bcamphart"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting
        val jvmTest by getting {

            dependencies {
                implementation(kotlin("test-junit"))

                implementation("io.cucumber:cucumber-java8:6.1.1")
                implementation("io.cucumber:cucumber-junit:6.1.1")
            }
        }

        val cucumberRuntime by configurations.creating {
            extendsFrom(configurations.getByName("jvmTestImplementation"))
        }

        tasks.create("cucumber") {
            group = "verification"
            dependsOn("assemble", "jvmTestClasses")
            tasks.check.get().dependsOn(this)

            doLast {
                javaexec {
                    mainClass.set("io.cucumber.core.cli.Main")

                    classpath = cucumberRuntime + files("build/classes/kotlin/jvm/test")
                    args = listOf(
                        "--plugin", "pretty",
                        "--plugin", "html:target/cucumber-report.html",
                        "--glue", "expansion",
                        "src/jvmTest/resources")
                }
            }
        }
    }
}