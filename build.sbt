name := "clasick_core_api"

version := "0.1"

scalaVersion := "2.12.8"

import scalapb.compiler.Version.protobufVersion

PB.targets in Compile := Seq(
  PB.gens.java(protobufVersion) -> ((sourceManaged in Compile).value / "protobuf-java"),
  scalapb.gen(javaConversions=true) -> ((sourceManaged in Compile).value / "protobuf-scala")
)

libraryDependencies ++= Seq(
    "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
    "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
    "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
    "io.grpc" % "grpc-all" % scalapb.compiler.Version.grpcJavaVersion,
    "com.typesafe.slick" %% "slick" % "3.3.0",
    "mysql" % "mysql-connector-java" % "8.0.15",
    "org.springframework.security" % "spring-security-web" % "5.1.4.RELEASE",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.pauldijou" %% "jwt-core" % "2.1.0"
)