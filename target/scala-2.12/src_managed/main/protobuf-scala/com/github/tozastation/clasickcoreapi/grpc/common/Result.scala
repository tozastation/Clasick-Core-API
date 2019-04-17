// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.common

/** Result: レスポンスの結果
  */
sealed trait Result extends _root_.scalapb.GeneratedEnum {
  type EnumType = Result
  def isSuccess: _root_.scala.Boolean = false
  def isFailed: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Result] = com.github.tozastation.clasickcoreapi.grpc.common.Result
}

object Result extends _root_.scalapb.GeneratedEnumCompanion[Result] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Result] = this
  @SerialVersionUID(0L)
  case object SUCCESS extends Result {
    val value = 0
    val index = 0
    val name = "SUCCESS"
    override def isSuccess: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object FAILED extends Result {
    val value = 1
    val index = 1
    val name = "FAILED"
    override def isFailed: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends Result with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(SUCCESS, FAILED)
  def fromValue(value: _root_.scala.Int): Result = value match {
    case 0 => SUCCESS
    case 1 => FAILED
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = CommonProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = CommonProto.scalaDescriptor.enums(0)
  def fromJavaValue(pbJavaSource: com.github.tozastation.clasickcoreapi.grpc.Common.Result): Result = fromValue(pbJavaSource.getNumber)
  def toJavaValue(pbScalaSource: Result): com.github.tozastation.clasickcoreapi.grpc.Common.Result = {
    _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
    com.github.tozastation.clasickcoreapi.grpc.Common.Result.forNumber(pbScalaSource.value)
  }
}