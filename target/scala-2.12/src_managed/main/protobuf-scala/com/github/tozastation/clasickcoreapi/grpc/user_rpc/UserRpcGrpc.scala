package com.github.tozastation.clasickcoreapi.grpc.user_rpc

object UserRpcGrpc {
  val METHOD_SIGN_IN: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("user.UserRpc", "SignIn"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn])
      .build()
  
  val METHOD_SIGN_UP: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("user.UserRpc", "SignUp"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp])
      .build()
  
  val METHOD_GET_SINGLE_USER: _root_.io.grpc.MethodDescriptor[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("user.UserRpc", "GetSingleUser"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser])
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("user.UserRpc")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(com.github.tozastation.clasickcoreapi.grpc.user_rpc.UserRpcProto.javaDescriptor))
      .addMethod(METHOD_SIGN_IN)
      .addMethod(METHOD_SIGN_UP)
      .addMethod(METHOD_GET_SINGLE_USER)
      .build()
  
  trait UserRpc extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = UserRpc
    def signIn(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn]
    def signUp(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp]
    def getSingleUser(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser]
  }
  
  object UserRpc extends _root_.scalapb.grpc.ServiceCompanion[UserRpc] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[UserRpc] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.github.tozastation.clasickcoreapi.grpc.user_rpc.UserRpcProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = UserRpcProto.scalaDescriptor.services(0)
  }
  
  trait UserRpcBlockingClient {
    def serviceCompanion = UserRpc
    def signIn(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn
    def signUp(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp
    def getSingleUser(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser
  }
  
  class UserRpcBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[UserRpcBlockingStub](channel, options) with UserRpcBlockingClient {
    override def signIn(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SIGN_IN, options, request)
    }
    
    override def signUp(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SIGN_UP, options, request)
    }
    
    override def getSingleUser(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser): com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_SINGLE_USER, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): UserRpcBlockingStub = new UserRpcBlockingStub(channel, options)
  }
  
  class UserRpcStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[UserRpcStub](channel, options) with UserRpc {
    override def signIn(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SIGN_IN, options, request)
    }
    
    override def signUp(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SIGN_UP, options, request)
    }
    
    override def getSingleUser(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser): scala.concurrent.Future[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_SINGLE_USER, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): UserRpcStub = new UserRpcStub(channel, options)
  }
  
  def bindService(serviceImpl: UserRpc, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_SIGN_IN,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignIn, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignIn]): Unit =
          serviceImpl.signIn(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_SIGN_UP,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestSignUp, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseSignUp]): Unit =
          serviceImpl.signUp(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_SINGLE_USER,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser, com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser] {
        override def invoke(request: com.github.tozastation.clasickcoreapi.grpc.user_rpc.RequestGetSingleUser, observer: _root_.io.grpc.stub.StreamObserver[com.github.tozastation.clasickcoreapi.grpc.user_rpc.ResponseGetSingleUser]): Unit =
          serviceImpl.getSingleUser(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): UserRpcBlockingStub = new UserRpcBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): UserRpcStub = new UserRpcStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.github.tozastation.clasickcoreapi.grpc.user_rpc.UserRpcProto.javaDescriptor.getServices().get(0)
  
}