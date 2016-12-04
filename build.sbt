name := """Mimir"""
organization := "com.white-kit"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += "org.webjars.bower" % "bootstrap" % "3.3.7"
libraryDependencies += "org.webjars.bower" % "font-awesome" % "4.7.0"
