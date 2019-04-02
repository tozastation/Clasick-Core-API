package com.github.tozastation.clasickcoreapi.domain.service

import com.github.tozastation.clasickcoreapi.domain.model._
import com.github.tozastation.clasickcoreapi.grpc.login_service._
import com.github.tozastation.clasickcoreapi.infrastructure.persistence.repository.MixInUserRepository
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait UsesUserService {
  val userService: UserService
}

trait UserService {
  def createUser(requestSignUp:RequestSignUp): Future[ResponseSignUp]
  def checkExistMe(requestSignIn: RequestSignIn): Future[ResponseSignIn]
  def getSingleUser(requestGetSingleUser: RequestGetSingleUser): Future[ResponseGetSingleUser]
}

trait MixInUserService extends UsesUserService {
  val userService: UserServiceImpl.type = UserServiceImpl
}

object UserServiceImpl extends UserService with MixInUserRepository {
  override def createUser(requestSignUp: RequestSignUp): Future[ResponseSignUp] = {
    val user = User(
      id = null,
      name = UserName(value = requestSignUp.userName),
      pass = UserPass(value = requestSignUp.password),
      contact = Contact(email = "", phone = ""),
      accessToken = AccessToken(value = "")
    )
    val maybeAccessToken = userRepository.createUser(user)
    maybeAccessToken.transform(
      {accessToken => return Future(ResponseSignUp(accessToken = accessToken.get.value, result = Result.SUCCESS))},
      {_ => return Future(ResponseSignUp(accessToken = null, result = Result.FAILED))}
    )
  }

  override def checkExistMe(requestSignIn: RequestSignIn): Future[ResponseSignIn] = {
    val maybeUser = userRepository.selectMe(
      name = UserName(value = requestSignIn.userName),
      pass = UserPass(value = requestSignIn.password)
    )
    maybeUser.transform(
      {user => return Future(ResponseSignIn(accessToken = user.get.accessToken.value, result = Result.SUCCESS))},
      {_ => return Future(ResponseSignIn(accessToken = null, result = Result.FAILED))}
    )
  }

  override def getSingleUser(requestGetSingleUser: RequestGetSingleUser): Future[ResponseGetSingleUser] = {
    val maybeUser = userRepository.selectUser(id = UserId(value = requestGetSingleUser.userId))
    maybeUser.transform(
      {user => return Future(
        ResponseGetSingleUser(
          user = Option(ResponseUser(userId = user.get.id.value, userName = user.get.name.value)),
          result = Result.SUCCESS
        ))
      },
      {_ => return Future(
        ResponseGetSingleUser(
          user = null,
          result = Result.FAILED
        ))
      }
    )
  }
}