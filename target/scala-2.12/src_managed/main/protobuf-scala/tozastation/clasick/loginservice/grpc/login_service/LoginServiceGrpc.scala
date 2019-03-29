package tozastation.clasick.loginservice.grpc.login_service

object LoginServiceGrpc {
  val METHOD_SIGN_IN: _root_.io.grpc.MethodDescriptor[tozastation.clasick.loginservice.grpc.login_service.RequestSignIn, tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("LoginService", "SignIn"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[tozastation.clasick.loginservice.grpc.login_service.RequestSignIn])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn])
      .build()
  
  val METHOD_SIGN_UP: _root_.io.grpc.MethodDescriptor[tozastation.clasick.loginservice.grpc.login_service.RequestSignUp, tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("LoginService", "SignUp"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[tozastation.clasick.loginservice.grpc.login_service.RequestSignUp])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp])
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("LoginService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(tozastation.clasick.loginservice.grpc.login_service.LoginServiceProto.javaDescriptor))
      .addMethod(METHOD_SIGN_IN)
      .addMethod(METHOD_SIGN_UP)
      .build()
  
  trait LoginService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = LoginService
    def signIn(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignIn): scala.concurrent.Future[tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn]
    def signUp(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignUp): scala.concurrent.Future[tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp]
  }
  
  object LoginService extends _root_.scalapb.grpc.ServiceCompanion[LoginService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[LoginService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = tozastation.clasick.loginservice.grpc.login_service.LoginServiceProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = LoginServiceProto.scalaDescriptor.services(0)
  }
  
  trait LoginServiceBlockingClient {
    def serviceCompanion = LoginService
    def signIn(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignIn): tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn
    def signUp(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignUp): tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp
  }
  
  class LoginServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[LoginServiceBlockingStub](channel, options) with LoginServiceBlockingClient {
    override def signIn(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignIn): tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SIGN_IN, options, request)
    }
    
    override def signUp(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignUp): tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SIGN_UP, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): LoginServiceBlockingStub = new LoginServiceBlockingStub(channel, options)
  }
  
  class LoginServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[LoginServiceStub](channel, options) with LoginService {
    override def signIn(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignIn): scala.concurrent.Future[tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SIGN_IN, options, request)
    }
    
    override def signUp(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignUp): scala.concurrent.Future[tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SIGN_UP, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): LoginServiceStub = new LoginServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: LoginService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_SIGN_IN,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tozastation.clasick.loginservice.grpc.login_service.RequestSignIn, tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn] {
        override def invoke(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignIn, observer: _root_.io.grpc.stub.StreamObserver[tozastation.clasick.loginservice.grpc.login_service.ResponseSignIn]): Unit =
          serviceImpl.signIn(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_SIGN_UP,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[tozastation.clasick.loginservice.grpc.login_service.RequestSignUp, tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp] {
        override def invoke(request: tozastation.clasick.loginservice.grpc.login_service.RequestSignUp, observer: _root_.io.grpc.stub.StreamObserver[tozastation.clasick.loginservice.grpc.login_service.ResponseSignUp]): Unit =
          serviceImpl.signUp(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): LoginServiceBlockingStub = new LoginServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): LoginServiceStub = new LoginServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = tozastation.clasick.loginservice.grpc.login_service.LoginServiceProto.javaDescriptor.getServices().get(0)
  
}