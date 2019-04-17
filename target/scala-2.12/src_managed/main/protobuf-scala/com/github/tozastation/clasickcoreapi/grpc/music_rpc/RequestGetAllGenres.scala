// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.music_rpc

/** *
  * rpc : GetAllGenres
  */
@SerialVersionUID(0L)
final case class RequestGetAllGenres(
    empty: _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[RequestGetAllGenres] with scalapb.lenses.Updatable[RequestGetAllGenres] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (empty.isDefined) {
        val __value = empty.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      empty.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres = {
      var __empty = this.empty
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __empty = Option(_root_.scalapb.LiteParser.readMessage(_input__, __empty.getOrElse(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
          empty = __empty
      )
    }
    def getEmpty: com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty = empty.getOrElse(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty.defaultInstance)
    def clearEmpty: RequestGetAllGenres = copy(empty = _root_.scala.None)
    def withEmpty(__v: com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty): RequestGetAllGenres = copy(empty = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => empty.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => empty.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres
}

object RequestGetAllGenres extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres, com.github.tozastation.clasickcoreapi.grpc.RequestGetAllGenres] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres, com.github.tozastation.clasickcoreapi.grpc.RequestGetAllGenres] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres): com.github.tozastation.clasickcoreapi.grpc.RequestGetAllGenres = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.RequestGetAllGenres.newBuilder
    scalaPbSource.empty.map(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty.toJavaProto).foreach(javaPbOut.setEmpty)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.RequestGetAllGenres): com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres = com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
    empty = if (javaPbSource.hasEmpty) Some(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty.fromJavaProto(javaPbSource.getEmpty)) else _root_.scala.None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MusicRpcProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MusicRpcProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
  )
  implicit class RequestGetAllGenresLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres](_l) {
    def empty: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty] = field(_.getEmpty)((c_, f_) => c_.copy(empty = Option(f_)))
    def optionalEmpty: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty]] = field(_.empty)((c_, f_) => c_.copy(empty = f_))
  }
  final val EMPTY_FIELD_NUMBER = 1
  def of(
    empty: _root_.scala.Option[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty]
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres = _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres(
    empty
  )
}