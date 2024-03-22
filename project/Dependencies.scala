import sbt._
import Keys._


object Dependencies {
    val scala3Version = "3.4.0"

    val scalactic = "org.scalactic" %% "scalactic" % "3.2.10"
    val scalatest = "org.scalatest" %% "scalatest" % "3.2.10" % "test"

    val commonDependencies = Seq(
        scalactic,
        scalatest
    )
}