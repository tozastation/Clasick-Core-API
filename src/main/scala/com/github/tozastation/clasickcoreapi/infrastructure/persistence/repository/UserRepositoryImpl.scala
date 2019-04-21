package com.github.tozastation.clasickcoreapi.infrastructure.persistence.repository

import com.github.tozastation.clasickcoreapi.domain.model._
import com.github.tozastation.clasickcoreapi.domain.repository.{UserRepository, UsesUserRepository}
import com.typesafe.config.ConfigFactory
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * MixInUserRepository
  * UserRepositoryの実装を提供するただ一つのフィールドを持つモジュール
  */
trait MixInUserRepository extends UsesUserRepository {
  val userRepository: UserRepositoryImpl.type = UserRepositoryImpl
}


object UserRepositoryImpl extends UserRepository {

  private val config = ConfigFactory.load("database.conf")
  config.checkValid(ConfigFactory.defaultReference(), "slick.mysql")
  private val db = Database.forConfig("slick.mysql", config)

  override def selectUser(id: UserId): Future[Option[User]] = {
    val q = Users.filter(_.id === id)
    db.run(q.result.headOption)
  }

  override def createUser(user: User): Future[Option[AccessToken]] = {
    val result = db.run(Users += user)
    result.flatMap(
      _ => Future(Option(user.accessToken))
    )
  }

  override def selectMe(name: UserName, pass: UserPass): Future[Option[User]] = {
    val q = Users.filter(u => u.name === name)
    db.run(q.result.headOption)
  }
}