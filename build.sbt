ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.3"

lazy val root = (project in file("."))
  .settings(
    name := "locksmith-core",
    organization := "com.raunakjodhawat"
  )

// to load and override configuration from application.conf
libraryDependencies += "com.github.pureconfig" %% "pureconfig-core" % "0.17.8"
