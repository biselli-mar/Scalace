import Dependencies._

ThisBuild / scalaVersion     := scala3Version
ThisBuild / version          := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "Scalace",
    libraryDependencies += commonDependencies
  )
