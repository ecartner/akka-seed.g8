name := "$name$"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.1"


lazy val akkaVersion = "$akka_version$"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

javacOptions += "-Xlint:deprecation"

scalacOptions += "-deprecation"

