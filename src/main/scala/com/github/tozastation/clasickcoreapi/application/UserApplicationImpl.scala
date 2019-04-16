package com.github.tozastation.clasickcoreapi.application

import com.github.tozastation.clasickcoreapi.domain.service.MixInUserService
import com.github.tozastation.clasickcoreapi.grpc.user_rpc._
import com.github.tozastation.clasickcoreapi.grpc.user_rpc.UserRpcGrpc.UserRpc

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}

object UserApplicationImpl extends UserRpc with MixInUserService{
  override def getSingleUser(request: RequestGetSingleUser): Future[ResponseGetSingleUser] = {
    userService.getSingleUser(request)
  }

  override def signIn(request: RequestSignIn): Future[ResponseSignIn] = {
    userService.checkExistMe(request)
  }

  override def signUp(request: RequestSignUp): Future[ResponseSignUp] = {
    print("Throw SignUp")
    userService.createUser(request)
  }
}
