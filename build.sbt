name := "KafkaOffsetMonitor"
version := "0.4.6-SNAPSHOT"
scalaVersion := "2.11.0"
organization := "com.quantifind"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-optimize", "-feature")

mainClass in Compile := Some("com.quantifind.kafka.offsetapp.OffsetGetterWeb")

libraryDependencies ++= Seq(
	"log4j" % "log4j" % "1.2.17",
	"net.databinder" %% "unfiltered-filter" % "0.8.4",
	"net.databinder" %% "unfiltered-jetty" % "0.8.4",
	"net.databinder" %% "unfiltered-json4s" % "0.8.4",
	"com.quantifind" %% "sumac" % "0.4.2",
	"org.apache.kafka" %% "kafka" % "1.1.1",
	"org.reflections" % "reflections" % "0.10.1",
	"com.twitter" %% "util-core" % "21.2.0",
	"com.typesafe.slick" %% "slick" % "3.3.3",
	"org.xerial" % "sqlite-jdbc" % "3.36.0",
	"com.google.code.gson" % "gson" % "2.8.8",
	"com.google.guava" % "guava" % "31.0.1-jre",
	"javax.ws.rs" % "javax.ws.rs-api" % "2.0-m16",
	"org.glassfish.jersey.core" % "jersey-client" % "3.0.3",
	"org.mockito" % "mockito-all" % "1.10.19" % "test",
	"org.scalatest" %% "scalatest" % "3.2.10" % "test"
)

assemblyMergeStrategy in assembly := {
  case "about.html" => MergeStrategy.discard
  case x =>
		val oldStrategy = (assemblyMergeStrategy in assembly).value
		oldStrategy(x)
}
