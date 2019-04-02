package com.github.tozastation.clasickcoreapi.infrastructure.persistence.repository

import com.github.tozastation.clasickcoreapi.domain.model._
import com.github.tozastation.clasickcoreapi.domain.repository.{UserRepository, UsesUserRepository}
import com.github.tozastation.clasickcoreapi.infrastructure.persistence.component.MySQLDBComponent
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
  override def selectUser(id: UserId): Future[Option[User]] = {
    val q = Users.filter(_.id === id)
    MySQLDBComponent.db.run(q.result.headOption)
  }

  override def createUser(user: User): Future[Option[AccessToken]] = {
    val result = MySQLDBComponent.db.run(Users += user)
    result.transform(
      {_ => return Future(Option(user.accessToken)) },
      {_ => throw new Exception("Can't Insert Data")}
    )
  }

  override def selectMe(name: UserName, pass: UserPass): Future[Option[User]] = {
    val q = Users.filter(u => u.name === name && u.pass === pass)
    MySQLDBComponent.db.run(q.result.headOption)
  }
}