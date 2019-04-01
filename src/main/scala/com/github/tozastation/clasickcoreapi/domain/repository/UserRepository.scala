package com.github.tozastation.clasickcoreapi.domain.repository

import com.github.tozastation.clasickcoreapi.domain.model.{AccessToken, User, UserId, UserPass}

trait Transaction[A]

trait UsesUserRepository {
    val userRepository: UserRepository
}

trait UserRepository {
    /**
      * ユーザを検索する
      * @param id UserId
      * @param pass UserPass
      * @return
      */
    def selectUser(id: UserId, pass: UserPass): Transaction[Option[User]]

    /**
      * ユーザを作成する
      * @param user User
      * @return
      */
    def createUser(user: User): Transaction[Option[AccessToken]]
}