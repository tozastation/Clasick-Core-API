// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.user_rpc

@SerialVersionUID(0L)
final case class ResponseGetSingleUser(
    user: _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser] = _root_.scala.None,
    result: com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result = com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.SUCCESS
    ) extends scalapb.GeneratedMessage with scalapb.Message[ResponseGetSingleUser] with scalapb.lenses.Updatable[ResponseGetSingleUser] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (user.isDefined) {
        val __value = user.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = result
        if (__value != com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.SUCCESS) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value.value)
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
      user.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = result
        if (__v != com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.SUCCESS) {
          _output__.writeEnum(2, __v.value)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser = {
      var __user = this.user
      var __result = this.result
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __user = Option(_root_.scalapb.LiteParser.readMessage(_input__, __user.getOrElse(com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser.defaultInstance)))
          case 16 =>
            __result = com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.fromValue(_input__.readEnum())
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
          user = __user,
          result = __result
      )
    }
    def getUser: com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser = user.getOrElse(com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser.defaultInstance)
    def clearUser: ResponseGetSingleUser = copy(user = _root_.scala.None)
    def withUser(__v: com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser): ResponseGetSingleUser = copy(user = Option(__v))
    def withResult(__v: com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result): ResponseGetSingleUser = copy(result = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => user.orNull
        case 2 => {
          val __t = result.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => user.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PEnum(result.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser
}

object ResponseGetSingleUser extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser, com.github.tozastation.clasickcoreapi.grpc.ResponseGetSingleUser] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser, com.github.tozastation.clasickcoreapi.grpc.ResponseGetSingleUser] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser): com.github.tozastation.clasickcoreapi.grpc.ResponseGetSingleUser = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.ResponseGetSingleUser.newBuilder
    scalaPbSource.user.map(com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser.toJavaProto).foreach(javaPbOut.setUser)
    javaPbOut.setResultValue(scalaPbSource.result.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.ResponseGetSingleUser): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
    user = if (javaPbSource.hasUser) Some(com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser.fromJavaProto(javaPbSource.getUser)) else _root_.scala.None,
    result = com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.fromValue(javaPbSource.getResultValue.intValue)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser]],
      com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.fromValue(__fieldsMap.getOrElse(__fields.get(1), com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.SUCCESS.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser]]),
        com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result.SUCCESS.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = UserRpcProto.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = UserRpcProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result
    }
  }
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
  )
  implicit class ResponseGetSingleUserLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser](_l) {
    def user: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser] = field(_.getUser)((c_, f_) => c_.copy(user = Option(f_)))
    def optionalUser: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser]] = field(_.user)((c_, f_) => c_.copy(user = f_))
    def result: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result] = field(_.result)((c_, f_) => c_.copy(result = f_))
  }
  final val USER_FIELD_NUMBER = 1
  final val RESULT_FIELD_NUMBER = 2
  def of(
    user: _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseUser],
    result: com.github.tozastation.clasickcoreapi.grpc.user_rpc.Result
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser = _root_.com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser(
    user,
    result
  )
}
