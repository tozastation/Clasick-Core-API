// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.music_rpc
import scala.collection.JavaConverters._

@SerialVersionUID(0L)
final case class ResponseGetAllArtistsFromGenre(
    artists: _root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ResponseGetAllArtistsFromGenre] with scalapb.lenses.Updatable[ResponseGetAllArtistsFromGenre] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      artists.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      artists.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre = {
      val __artists = (_root_.scala.collection.immutable.Vector.newBuilder[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist] ++= this.artists)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __artists += _root_.scalapb.LiteParser.readMessage(_input__, com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
          artists = __artists.result()
      )
    }
    def clearArtists = copy(artists = _root_.scala.collection.Seq.empty)
    def addArtists(__vs: com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist*): ResponseGetAllArtistsFromGenre = addAllArtists(__vs)
    def addAllArtists(__vs: TraversableOnce[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]): ResponseGetAllArtistsFromGenre = copy(artists = artists ++ __vs)
    def withArtists(__v: _root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]): ResponseGetAllArtistsFromGenre = copy(artists = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => artists
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(artists.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre
}

object ResponseGetAllArtistsFromGenre extends scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre, com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllArtistsFromGenre] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] with scalapb.JavaProtoSupport[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre, com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllArtistsFromGenre] = this
  def toJavaProto(scalaPbSource: com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre): com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllArtistsFromGenre = {
    val javaPbOut = com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllArtistsFromGenre.newBuilder
    javaPbOut.addAllArtists(scalaPbSource.artists.map(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.github.tozastation.clasickcoreapi.grpc.ResponseGetAllArtistsFromGenre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre = com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
    artists = javaPbSource.getArtistsList.asScala.map(com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist.fromJavaProto)(_root_.scala.collection.breakOut)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MusicRpcProto.javaDescriptor.getMessageTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MusicRpcProto.scalaDescriptor.messages(10)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
  )
  implicit class ResponseGetAllArtistsFromGenreLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre](_l) {
    def artists: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]] = field(_.artists)((c_, f_) => c_.copy(artists = f_))
  }
  final val ARTISTS_FIELD_NUMBER = 1
  def of(
    artists: _root_.scala.collection.Seq[com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist]
  ): _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre = _root_.com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre(
    artists
  )
}
