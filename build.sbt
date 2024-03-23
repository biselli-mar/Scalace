val scala3Version = "3.3.1"

val scalactic = "org.scalactic" %% "scalactic" % "3.2.18"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.18" % "test"
val commonDependencies = Seq(
    scalactic,
    scalatest
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalace",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= commonDependencies
  )
