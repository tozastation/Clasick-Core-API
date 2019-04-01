package com.github.tozastation.clasickcoreapi.domain.model

import slick.driver.MySQLDriver.api._

/**
  * UserId
  * @param value 識別子
  */
case class UserId(value: Int) extends MappedTo[Int]

/**
  * UserName
  * @param value ユーザ名
  */
case class UserName(value: String) extends MappedTo[String]

/**
  * UserPass
  * @param value パスワード
  */
case class UserPass(value: String) extends MappedTo[String]

/**
  * Contact
  * @param email ユーザのEmail
  * @param phone ユーザの電話番号
  */
case class Contact(
                  email: String,
                  phone: String
                  )

/**
  * AccessToken アクセストークンJWT
  * @param value
  */
case class AccessToken(value: String) extends MappedTo[String]

/**
  * User
  * @param id UserId
  * @param name UserName
  * @param contact Contact
  */
case class User(
               id: UserId,
               name: UserName,
               pass: UserPass,
               contact: Contact,
               accessToken: AccessToken
               )


class Users(tag: Tag) extends Table[User](tag, "user") {
  def id = column[UserId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[UserName]("name")
  def pass = column[UserPass]("password")
  def email = column[String]("email")
  def phone = column[String]("phone")
  def contact = (email, phone) <> (Contact.tupled, Contact.unapply)
  def accessToken = column[AccessToken]("access_token")
  def * = (id, name, pass, contact, accessToken) <> (User.tupled, User.unapply)
}