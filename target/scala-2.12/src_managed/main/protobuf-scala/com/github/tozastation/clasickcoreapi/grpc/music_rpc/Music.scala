// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.music_rpc

@SerialVersionUID(0L)
final case class Music(
    id: _root_.scala.Int = 0,
    name: _root_.scala.Predef.String = "",
    description: _root_.scala.Predef.String = "",
    m3U8Path: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Music] with scalapb.lenses.Updatable[Music] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = id
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, __value)
        }
      };
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = m3U8Path
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
        val __v = id
        if (__v != 0) {
          _output__.writeUInt32(1, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = description
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = m3U8Path
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music = {
      var __id = this.id
      var __name = this.name
      var __description = this.description
      var __m3U8Path = this.m3U8Path
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __id = _input__.readUInt32()
          case 18 =>
            __name = _input__.readString()
          case 26 =>
            __description = _input__.readString()
          case 34 =>
            __m3U8Path = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
          id = __id,
          name = __name,
          description = __description,
          m3U8Path = __m3U8Path
      )
    }
    def withId(__v: _root_.scala.Int): Music = copy(id = __v)
    def withName(__v: _root_.scala.Predef.String): Music = copy(name = __v)
    def withDescription(__v: _root_.scala.Predef.String): Music = copy(description = __v)
    def withM3U8Path(__v: _root_.scala.Predef.String): Music = copy(m3U8Path = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = m3U8Path
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(id)
        case 2 => _root_.scalapb.descriptors.PString(name)
        case 3 => _root_.scalapb.descriptors.PString(description)
        case 4 => _root_.scalapb.descriptors.PString(m3U8Path)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music
}

object Music extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music, com.github.tozastation.clasickcoreapi.grpc.Music] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music, com.github.tozastation.clasickcoreapi.grpc.Music] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music): com.github.tozastation.clasickcoreapi.grpc.Music = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.Music.newBuilder
    javaPbOut.setId(scalaPbSource.id)
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.setDescription(scalaPbSource.description)
    javaPbOut.setM3U8Path(scalaPbSource.m3U8Path)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.Music): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
    id = javaPbSource.getId.intValue,
    name = javaPbSource.getName,
    description = javaPbSource.getDescription,
    m3U8Path = javaPbSource.getM3U8Path
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MusicRpcProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MusicRpcProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
  )
  implicit class MusicLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def m3U8Path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.m3U8Path)((c_, f_) => c_.copy(m3U8Path = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val DESCRIPTION_FIELD_NUMBER = 3
  final val M3U8_PATH_FIELD_NUMBER = 4
  def of(
    id: _root_.scala.Int,
    name: _root_.scala.Predef.String,
    description: _root_.scala.Predef.String,
    m3U8Path: _root_.scala.Predef.String
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music = _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music(
    id,
    name,
    description,
    m3U8Path
  )
}
