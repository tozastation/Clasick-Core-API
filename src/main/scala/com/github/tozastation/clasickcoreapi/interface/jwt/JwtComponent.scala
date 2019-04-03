package com.github.tozastation.clasickcoreapi.interface.jwt

import pdi.jwt.{Jwt, JwtAlgorithm, JwtClaim}

import scala.io.Source
import scala.util.Try

object JwtComponent {
  def createJwt(sub: String): String = {
    val claim = JwtClaim.apply(
      content = "clasick",
      issuer = Option("tozastation"),
      subject = Option(sub),
      audience = Option(Set("clasick-user")),
    ).toString
    val key = Source.fromFile("./secret.key").getLines.mkString
    Jwt.encode(claim, key, JwtAlgorithm.HS256)
  }

  def decodeJwt(token: String): Try[String] = {
    val key = Source.fromFile("./secret.key").getLines.mkString
    Jwt.decodeRaw(token, key, Seq(JwtAlgorithm.HS256))
  }
}
