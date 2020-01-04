lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.1"
    )),
    name := "leetcode-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
