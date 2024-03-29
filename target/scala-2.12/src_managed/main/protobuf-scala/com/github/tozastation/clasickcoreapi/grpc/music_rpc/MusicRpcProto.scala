// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.tozastation.clasickcoreapi.grpc.music_rpc

object MusicRpcProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Empty,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Genre,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Album,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Artist,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.Music,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum,
    com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Cg9tdXNpY19ycGMucHJvdG8SBW11c2ljIgcKBUVtcHR5ImsKBUdlbnJlEhcKAmlkGAEgASgNQgfiPwQSAmlkUgJpZBIdCgRuY
  W1lGAIgASgJQgniPwYSBG5hbWVSBG5hbWUSKgoJaWNvbl9wYXRoGAMgASgJQg3iPwoSCGljb25QYXRoUghpY29uUGF0aCKdAQoFQ
  WxidW0SFwoCaWQYASABKA1CB+I/BBICaWRSAmlkEh0KBG5hbWUYAiABKAlCCeI/BhIEbmFtZVIEbmFtZRIqCglpY29uX3BhdGgYA
  yABKAlCDeI/ChIIaWNvblBhdGhSCGljb25QYXRoEjAKC2FydGlzdF9uYW1lGAQgASgJQg/iPwwSCmFydGlzdE5hbWVSCmFydGlzd
  E5hbWUioAEKBkFydGlzdBIXCgJpZBgBIAEoDUIH4j8EEgJpZFICaWQSHQoEbmFtZRgCIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEioKC
  Wljb25fcGF0aBgDIAEoCUIN4j8KEghpY29uUGF0aFIIaWNvblBhdGgSMgoLZGVzY3JpcHRpb24YBCABKAlCEOI/DRILZGVzY3Jpc
  HRpb25SC2Rlc2NyaXB0aW9uIp8BCgVNdXNpYxIXCgJpZBgBIAEoDUIH4j8EEgJpZFICaWQSHQoEbmFtZRgCIAEoCUIJ4j8GEgRuY
  W1lUgRuYW1lEjIKC2Rlc2NyaXB0aW9uGAMgASgJQhDiPw0SC2Rlc2NyaXB0aW9uUgtkZXNjcmlwdGlvbhIqCgltM3U4X3BhdGgYB
  CABKAlCDeI/ChIIbTNVOFBhdGhSCG0zdThQYXRoIkUKE1JlcXVlc3RHZXRBbGxHZW5yZXMSLgoFZW1wdHkYASABKAsyDC5tdXNpY
  y5FbXB0eUIK4j8HEgVlbXB0eVIFZW1wdHkiSQoUUmVzcG9uc2VHZXRBbGxHZW5yZXMSMQoGZ2VucmVzGAEgAygLMgwubXVzaWMuR
  2VucmVCC+I/CBIGZ2VucmVzUgZnZW5yZXMiRwocUmVxdWVzdEdldEFsbEFsYnVtc0Zyb21HZW5yZRInCghnZW5yZV9pZBgBIAEoD
  UIM4j8JEgdnZW5yZUlkUgdnZW5yZUlkIlIKHVJlc3BvbnNlR2V0QWxsQWxidW1zRnJvbUdlbnJlEjEKBmFsYnVtcxgBIAMoCzIML
  m11c2ljLkFsYnVtQgviPwgSBmFsYnVtc1IGYWxidW1zIkgKHVJlcXVlc3RHZXRBbGxBcnRpc3RzRnJvbUdlbnJlEicKCGdlbnJlX
  2lkGAEgASgNQgziPwkSB2dlbnJlSWRSB2dlbnJlSWQiVwoeUmVzcG9uc2VHZXRBbGxBcnRpc3RzRnJvbUdlbnJlEjUKB2FydGlzd
  HMYASADKAsyDS5tdXNpYy5BcnRpc3RCDOI/CRIHYXJ0aXN0c1IHYXJ0aXN0cyJLCh1SZXF1ZXN0R2V0QWxsQWxidW1zRnJvbUFyd
  GlzdBIqCglhcnRpc3RfaWQYASABKA1CDeI/ChIIYXJ0aXN0SWRSCGFydGlzdElkIlMKHlJlc3BvbnNlR2V0QWxsQWxidW1zRnJvb
  UFydGlzdBIxCgZhbGJ1bXMYASADKAsyDC5tdXNpYy5BbGJ1bUIL4j8IEgZhbGJ1bXNSBmFsYnVtcyJGChtSZXF1ZXN0R2V0QWxsT
  XVzaWNGcm9tQWxidW0SJwoIYWxidW1faWQYASABKA1CDOI/CRIHYWxidW1JZFIHYWxidW1JZCJRChxSZXNwb25zZUdldEFsbE11c
  2ljRnJvbUFsYnVtEjEKBm11c2ljcxgBIAMoCzIMLm11c2ljLk11c2ljQgviPwgSBm11c2ljc1IGbXVzaWNzMvADCghNdXNpY1JwY
  xJJCgxHZXRBbGxHZW5yZXMSGi5tdXNpYy5SZXF1ZXN0R2V0QWxsR2VucmVzGhsubXVzaWMuUmVzcG9uc2VHZXRBbGxHZW5yZXMiA
  BJkChVHZXRBbGxBbGJ1bXNGcm9tR2VucmUSIy5tdXNpYy5SZXF1ZXN0R2V0QWxsQWxidW1zRnJvbUdlbnJlGiQubXVzaWMuUmVzc
  G9uc2VHZXRBbGxBbGJ1bXNGcm9tR2VucmUiABJnChZHZXRBbGxBcnRpc3RzRnJvbUdlbnJlEiQubXVzaWMuUmVxdWVzdEdldEFsb
  EFydGlzdHNGcm9tR2VucmUaJS5tdXNpYy5SZXNwb25zZUdldEFsbEFydGlzdHNGcm9tR2VucmUiABJnChZHZXRBbGxBbGJ1bXNGc
  m9tQXJ0aXN0EiQubXVzaWMuUmVxdWVzdEdldEFsbEFsYnVtc0Zyb21BcnRpc3QaJS5tdXNpYy5SZXNwb25zZUdldEFsbEFsYnVtc
  0Zyb21BcnRpc3QiABJhChRHZXRBbGxNdXNpY0Zyb21BbGJ1bRIiLm11c2ljLlJlcXVlc3RHZXRBbGxNdXNpY0Zyb21BbGJ1bRojL
  m11c2ljLlJlc3BvbnNlR2V0QWxsTXVzaWNGcm9tQWxidW0iAEI6Cipjb20uZ2l0aHViLnRvemFzdGF0aW9uLmNsYXNpY2tjb3JlY
  XBpLmdycGNCCk11c2ljUHJvdG9QAWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor =
    com.github.tozastation.clasickcoreapi.grpc.MusicProto.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}