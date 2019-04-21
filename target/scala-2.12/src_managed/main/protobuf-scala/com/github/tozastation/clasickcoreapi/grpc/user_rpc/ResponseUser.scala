// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.user_rpc

@SerialVersionUID(0L)
final case class ResponseUser(
    userId: _root_.scala.Int = 0,
    userName: _root_.scala.Predef.String = "",
    iconPath: _root_.scala.Predef.String = "",
    introduction: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[ResponseUser] with scalapb.lenses.Updatable[ResponseUser] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = userId
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = userName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = iconPath
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = introduction
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = userId
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = userName
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = iconPath
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = introduction
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser = {
      var __userId = this.userId
      var __userName = this.userName
      var __iconPath = this.iconPath
      var __introduction = this.introduction
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __userId = _input__.readInt32()
          case 18 =>
            __userName = _input__.readString()
          case 26 =>
            __iconPath = _input__.readString()
          case 34 =>
            __introduction = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
          userId = __userId,
          userName = __userName,
          iconPath = __iconPath,
          introduction = __introduction
      )
    }
    def withUserId(__v: _root_.scala.Int): ResponseUser = copy(userId = __v)
    def withUserName(__v: _root_.scala.Predef.String): ResponseUser = copy(userName = __v)
    def withIconPath(__v: _root_.scala.Predef.String): ResponseUser = copy(iconPath = __v)
    def withIntroduction(__v: _root_.scala.Predef.String): ResponseUser = copy(introduction = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = userId
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = userName
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = iconPath
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = introduction
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(userId)
        case 2 => _root_.scalapb.descriptors.PString(userName)
        case 3 => _root_.scalapb.descriptors.PString(iconPath)
        case 4 => _root_.scalapb.descriptors.PString(introduction)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser
}

object ResponseUser extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser, com.github.tozastation.clasickcoreapi.grpc.ResponseUser] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser, com.github.tozastation.clasickcoreapi.grpc.ResponseUser] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser): com.github.tozastation.clasickcoreapi.grpc.ResponseUser = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.ResponseUser.newBuilder
    javaPbOut.setUserId(scalaPbSource.userId)
    javaPbOut.setUserName(scalaPbSource.userName)
    javaPbOut.setIconPath(scalaPbSource.iconPath)
    javaPbOut.setIntroduction(scalaPbSource.introduction)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.ResponseUser): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
    userId = javaPbSource.getUserId.intValue,
    userName = javaPbSource.getUserName,
    iconPath = javaPbSource.getIconPath,
    introduction = javaPbSource.getIntroduction
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = UserRpcProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = UserRpcProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
  )
  implicit class ResponseUserLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser](_l) {
    def userId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.userId)((c_, f_) => c_.copy(userId = f_))
    def userName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.userName)((c_, f_) => c_.copy(userName = f_))
    def iconPath: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.iconPath)((c_, f_) => c_.copy(iconPath = f_))
    def introduction: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.introduction)((c_, f_) => c_.copy(introduction = f_))
  }
  final val USER_ID_FIELD_NUMBER = 1
  final val USER_NAME_FIELD_NUMBER = 2
  final val ICON_PATH_FIELD_NUMBER = 3
  final val INTRODUCTION_FIELD_NUMBER = 4
  def of(
    userId: _root_.scala.Int,
    userName: _root_.scala.Predef.String,
    iconPath: _root_.scala.Predef.String,
    introduction: _root_.scala.Predef.String
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser = _root_.com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser(
    userId,
    userName,
    iconPath,
    introduction
  )
}
