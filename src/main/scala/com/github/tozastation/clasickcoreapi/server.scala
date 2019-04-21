package com.github.tozastation.clasickcoreapi

import io.grpc.{Server, ServerBuilder, ServerInterceptors}

import scala.concurrent.ExecutionContext
import java.util.concurrent.Executors
import com.github.tozastation.clasickcoreapi.application.UserApplicationImpl
import com.github.tozastation.clasickcoreapi.grpc.user_rpc.UserRpcGrpc
import com.github.tozastation.clasickcoreapi.interface.util.util

object server extends App {
  private val executionContext: ExecutionContext = ExecutionContext.fromExecutor(Executors.newCachedThreadPool())

  private def start(): Unit = {
    val server = new GrpcServer(executionContext)
    server.start()
    server.blockUnitShutdown()
  }
  start()
}

class GrpcServer(executionContext: ExecutionContext) extends util {
  self =>
  private val port = sys.env.getOrElse("SERVER_PORT", "50051").toInt
  private var server: Server = _

  def start(): Unit = {
    server = ServerBuilder.forPort(port).addService(
      ServerInterceptors.intercept(
        UserRpcGrpc.bindService(UserApplicationImpl, executionContext)
      )
    ).build.start
    logger.info("gRPC server started, listening on " + port)

    sys.addShutdownHook {
      logger.info("*** shutting down gPRC server since JVM is shutting down")
      self.stop()
    }
  }

  def stop(): Unit = {
    if (server != null) {
      logger.info("*** gRPC server shutdown")
      server.shutdown()
    }
  }

  def blockUnitShutdown(): Unit = {
    if (server != null) {
      server.awaitTermination()
    }
  }
}
