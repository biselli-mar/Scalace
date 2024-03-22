import Dependencies._

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalace",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += commonDependencies
  )
