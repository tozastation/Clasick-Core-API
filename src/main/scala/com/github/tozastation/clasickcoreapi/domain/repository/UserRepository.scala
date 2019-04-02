package com.github.tozastation.clasickcoreapi.domain.repository

import com.github.tozastation.clasickcoreapi.domain.model._

import scala.concurrent.Future

trait UsesUserRepository {
    val userRepository: UserRepository
}

trait UserRepository {
    /**
      * ユーザを検索する
      * @param id UserId
      * @return
      */
    def selectUser(id: UserId): Future[Option[User]]

    /**
      * ユーザを作成する
      * @param user User
      * @return
      */
    def createUser(user: User): Future[Option[AccessToken]]

    /**
      * 自身を検索する
      *
      * @param name UserName
      * @param pass UserPass
      * @return
      */
    def selectMe(name: UserName, pass: UserPass): Future[Option[User]]
}