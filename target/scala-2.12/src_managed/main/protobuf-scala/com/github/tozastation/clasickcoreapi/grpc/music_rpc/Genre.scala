// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.music_rpc

@SerialVersionUID(0L)
final case class Genre(
    id: _root_.scala.Int = 0,
    name: _root_.scala.Predef.String = "",
    iconPath: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Genre] with scalapb.lenses.Updatable[Genre] {
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
        val __value = iconPath
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = iconPath
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre = {
      var __id = this.id
      var __name = this.name
      var __iconPath = this.iconPath
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
            __iconPath = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
          id = __id,
          name = __name,
          iconPath = __iconPath
      )
    }
    def withId(__v: _root_.scala.Int): Genre = copy(id = __v)
    def withName(__v: _root_.scala.Predef.String): Genre = copy(name = __v)
    def withIconPath(__v: _root_.scala.Predef.String): Genre = copy(iconPath = __v)
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
          val __t = iconPath
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(id)
        case 2 => _root_.scalapb.descriptors.PString(name)
        case 3 => _root_.scalapb.descriptors.PString(iconPath)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre
}

object Genre extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre, com.github.tozastation.clasickcoreapi.grpc.Genre] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre, com.github.tozastation.clasickcoreapi.grpc.Genre] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre): com.github.tozastation.clasickcoreapi.grpc.Genre = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.Genre.newBuilder
    javaPbOut.setId(scalaPbSource.id)
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.setIconPath(scalaPbSource.iconPath)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.Genre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
    id = javaPbSource.getId.intValue,
    name = javaPbSource.getName,
    iconPath = javaPbSource.getIconPath
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MusicRpcProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MusicRpcProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
  )
  implicit class GenreLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def iconPath: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.iconPath)((c_, f_) => c_.copy(iconPath = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val ICON_PATH_FIELD_NUMBER = 3
  def of(
    id: _root_.scala.Int,
    name: _root_.scala.Predef.String,
    iconPath: _root_.scala.Predef.String
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre = _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre(
    id,
    name,
    iconPath
  )
}