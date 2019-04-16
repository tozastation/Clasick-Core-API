package com.github.tozastation.clasickcoreapi.domain.service

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import com.github.tozastation.clasickcoreapi.domain.model._
import com.github.tozastation.clasickcoreapi.grpc.user_rpc.{RequestGetSingleUser, RequestSignIn, RequestSignUp, ResponseGetSingleUser, ResponseSignIn, ResponseSignUp, ResponseUser}
import com.github.tozastation.clasickcoreapi.infrastructure.persistence.repository.MixInUserRepository
import com.github.tozastation.clasickcoreapi.interface.jwt.JwtComponent

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait UsesUserService {
  val userService: UserService
}

trait UserService {
  def createUser(requestSignUp: RequestSignUp): Future[ResponseSignUp]

  def checkExistMe(requestSignIn: RequestSignIn): Future[ResponseSignIn]

  def getSingleUser(requestGetSingleUser: RequestGetSingleUser): Future[ResponseGetSingleUser]
}

trait MixInUserService extends UsesUserService {
  val userService: UserServiceImpl.type = UserServiceImpl
}

object UserServiceImpl extends UserService with MixInUserRepository {

  override def createUser(requestSignUp: RequestSignUp): Future[ResponseSignUp] = {
    val userId = UserId(value = 0)
    val userName = UserName(value = requestSignUp.name)
    val userPass = UserPass(value = requestSignUp.password)
    val contact = Contact(email = requestSignUp.contact.get.email, phone = requestSignUp.contact.get.phoneNum)
    // パスワードハッシュ化
    val hashedPass = UserPass(value = userPass.value)
    // Jwt生成
    val accessToken = AccessToken(value = JwtComponent.createJwt(userName.value))
    /**
      * SignUp時に，自己紹介とユーザアイコンは登録しない
      */
    val user = User(
      id = userId,
      name = userName,
      pass = hashedPass,
      contact = contact,
      accessToken = accessToken,
      userIconPath = null,
      introduction = null
    )
    val maybeAccessToken = userRepository.createUser(user)
    maybeAccessToken.flatMap(
      accessToken => Future(ResponseSignUp(accessToken = accessToken.get.value))
    )
  }

  override def checkExistMe(requestSignIn: RequestSignIn): Future[ResponseSignIn] = {
    val userName = UserName(value = requestSignIn.name)
    val userPass = UserPass(value = requestSignIn.password)
    // maybeUser Future[Option[User]]
    val maybeUser = userRepository.selectMe(
      name = userName,
      pass = userPass
    )
    maybeUser.flatMap(
      user =>
        if (authenticate(requestSignIn.password, user.get.pass.value)) {
          Future(ResponseSignIn(accessToken = user.get.accessToken.value))
        } else {
          Future(ResponseSignIn(accessToken = null))
        }
    )
  }

  override def getSingleUser(requestGetSingleUser: RequestGetSingleUser): Future[ResponseGetSingleUser] = {
    val id = UserId(value = requestGetSingleUser.userId)
    val maybeUser = userRepository.selectUser(id = id)
    maybeUser.flatMap(
      user => Future(
        ResponseGetSingleUser(
          user = Option(ResponseUser(userId = user.get.id.value, userName = user.get.name.value))
        )
      )
    )
  }

  def createHash(password: String): String = {
    val bcrypt = new BCryptPasswordEncoder()
    bcrypt.encode(password)
  }

  def authenticate(password: String, hashString: String): Boolean = {
    val bcrypt = new BCryptPasswordEncoder()
    bcrypt.matches(password, hashString)
  }
}