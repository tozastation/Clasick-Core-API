package com.github.tozastation.clasickcoreapi.grpc.music_rpc

object MusicRpcGrpc {
  val METHOD_GET_ALL_GENRES: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("music.MusicRpc", "GetAllGenres"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres])
      .build()
  
  val METHOD_GET_ALL_ALBUMS_FROM_GENRE: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("music.MusicRpc", "GetAllAlbumsFromGenre"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre])
      .build()
  
  val METHOD_GET_ALL_ARTISTS_FROM_GENRE: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("music.MusicRpc", "GetAllArtistsFromGenre"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre])
      .build()
  
  val METHOD_GET_ALL_ALBUMS_FROM_ARTIST: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("music.MusicRpc", "GetAllAlbumsFromArtist"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist])
      .build()
  
  val METHOD_GET_ALL_MUSIC_FROM_ALBUM: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("music.MusicRpc", "GetAllMusicFromAlbum"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum])
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("music.MusicRpc")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(com.github.tozastation.clasickcoreapi.grpc.music_rpc.MusicRpcProto.javaDescriptor))
      .addMethod(METHOD_GET_ALL_GENRES)
      .addMethod(METHOD_GET_ALL_ALBUMS_FROM_GENRE)
      .addMethod(METHOD_GET_ALL_ARTISTS_FROM_GENRE)
      .addMethod(METHOD_GET_ALL_ALBUMS_FROM_ARTIST)
      .addMethod(METHOD_GET_ALL_MUSIC_FROM_ALBUM)
      .build()
  
  trait MusicRpc extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = MusicRpc
    def getAllGenres(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres]
    def getAllAlbumsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre]
    def getAllArtistsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre]
    def getAllAlbumsFromArtist(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist]
    def getAllMusicFromAlbum(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum]
  }
  
  object MusicRpc extends _root_.scalapb.grpc.ServiceCompanion[MusicRpc] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[MusicRpc] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.github.tozastation.clasickcoreapi.grpc.music_rpc.MusicRpcProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = MusicRpcProto.scalaDescriptor.services(0)
  }
  
  trait MusicRpcBlockingClient {
    def serviceCompanion = MusicRpc
    def getAllGenres(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres
    def getAllAlbumsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre
    def getAllArtistsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre
    def getAllAlbumsFromArtist(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist
    def getAllMusicFromAlbum(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum
  }
  
  class MusicRpcBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[MusicRpcBlockingStub](channel, options) with MusicRpcBlockingClient {
    override def getAllGenres(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ALL_GENRES, options, request)
    }
    
    override def getAllAlbumsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ALL_ALBUMS_FROM_GENRE, options, request)
    }
    
    override def getAllArtistsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ALL_ARTISTS_FROM_GENRE, options, request)
    }
    
    override def getAllAlbumsFromArtist(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ALL_ALBUMS_FROM_ARTIST, options, request)
    }
    
    override def getAllMusicFromAlbum(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum): com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ALL_MUSIC_FROM_ALBUM, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): MusicRpcBlockingStub = new MusicRpcBlockingStub(channel, options)
  }
  
  class MusicRpcStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[MusicRpcStub](channel, options) with MusicRpc {
    override def getAllGenres(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ALL_GENRES, options, request)
    }
    
    override def getAllAlbumsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ALL_ALBUMS_FROM_GENRE, options, request)
    }
    
    override def getAllArtistsFromGenre(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ALL_ARTISTS_FROM_GENRE, options, request)
    }
    
    override def getAllAlbumsFromArtist(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ALL_ALBUMS_FROM_ARTIST, options, request)
    }
    
    override def getAllMusicFromAlbum(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ALL_MUSIC_FROM_ALBUM, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): MusicRpcStub = new MusicRpcStub(channel, options)
  }
  
  def bindService(serviceImpl: MusicRpc, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_GET_ALL_GENRES,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllGenres, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllGenres]): Unit =
          serviceImpl.getAllGenres(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_ALL_ALBUMS_FROM_GENRE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromGenre, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromGenre]): Unit =
          serviceImpl.getAllAlbumsFromGenre(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_ALL_ARTISTS_FROM_GENRE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllArtistsFromGenre, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllArtistsFromGenre]): Unit =
          serviceImpl.getAllArtistsFromGenre(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_ALL_ALBUMS_FROM_ARTIST,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllAlbumsFromArtist, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllAlbumsFromArtist]): Unit =
          serviceImpl.getAllAlbumsFromArtist(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_ALL_MUSIC_FROM_ALBUM,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum, com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.music_rpc.RequestGetAllMusicFromAlbum, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.music_rpc.ResponseGetAllMusicFromAlbum]): Unit =
          serviceImpl.getAllMusicFromAlbum(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): MusicRpcBlockingStub = new MusicRpcBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): MusicRpcStub = new MusicRpcStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.github.tozastation.clasickcoreapi.grpc.music_rpc.MusicRpcProto.javaDescriptor.getServices().get(0)
  
}