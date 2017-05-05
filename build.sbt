name := "tasky"
version := "1.0.1"
scalaVersion := "2.11.0"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"

val gitCommitCountTask = taskKey[String]("Prints commit count of the current branch")

gitCommitCountTask := {
  println("37")
  "37"
}

