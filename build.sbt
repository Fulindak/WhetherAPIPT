import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "danila.mts.sre",
        scalaVersion := "2.13.8",
        version      := "0.1.0",
      ),
    ),
    name := "weatherapi",
    libraryDependencies ++= gatling,
    libraryDependencies ++= gelf,
    libraryDependencies ++= gatlingPicatinny,
    libraryDependencies ++= janino,
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-Xfatal-warnings",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps",
    ),
  )
