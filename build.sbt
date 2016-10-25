name := "spark-start"

version := "0.0.1"

scalaVersion := "2.11.8"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.1", // THAT PROJECT IS FOR USE IN IDE AND LEARINGN PURPOSES% "provided",
  "org.apache.spark" %% "spark-sql" % "2.0.1",
  "org.apache.spark" %% "spark-mllib" % "2.0.1"
)
