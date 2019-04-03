package com.github.tozastation.clasickcoreapi.domain.service

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import com.github.tozastation.clasickcoreapi.domain.model._
import com.github.tozastation.clasickcoreapi.grpc.user_rpc._
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
    // パスワードハッシュ化
    val hashedString = createHash(requestSignUp.password)
    // Jwt生成
    val token = JwtComponent.createJwt(requestSignUp.userName)
    val user = User(
      id = null,
      name = UserName(value = requestSignUp.userName),
      pass = UserPass(value = hashedString),
      contact = Contact(email = "", phone = ""),
      accessToken = AccessToken(value = token)
    )
    val maybeAccessToken = userRepository.createUser(user)
    maybeAccessToken.transform(
      { accessToken => return Future(ResponseSignUp(accessToken = accessToken.get.value, result = Result.SUCCESS)) },
      { _ => return Future(ResponseSignUp(accessToken = null, result = Result.FAILED)) }
    )
  }

  override def checkExistMe(requestSignIn: RequestSignIn): Future[ResponseSignIn] = {
    // maybeUser Future[Option[User]]
    val maybeUser = userRepository.selectMe(
      name = UserName(value = requestSignIn.userName),
      pass = UserPass(value = requestSignIn.password)
    )
    maybeUser.transform(
      { user =>
        if (authenticate(requestSignIn.password, user.get.pass.value)) {
          return Future(ResponseSignIn(accessToken = user.get.accessToken.value, result = Result.SUCCESS))
        } else {
          return Future(ResponseSignIn(accessToken = null, result = Result.FAILED))
        }
      },
      { _ => return Future(ResponseSignIn(accessToken = null, result = Result.FAILED)) }
    )
  }

  override def getSingleUser(requestGetSingleUser: RequestGetSingleUser): Future[ResponseGetSingleUser] = {
    val maybeUser = userRepository.selectUser(id = UserId(value = requestGetSingleUser.userId))
    maybeUser.transform(
      { user =>
        return Future(
          ResponseGetSingleUser(
            user = Option(ResponseUser(userId = user.get.id.value, userName = user.get.name.value)),
            result = Result.SUCCESS
          ))
      },
      { _ =>
        return Future(
          ResponseGetSingleUser(
            user = null,
            result = Result.FAILED
          ))
      }
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