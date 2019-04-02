package com.github.tozastation.clasickcoreapi.infrastructure.persistence.component

import slick.jdbc.JdbcProfile

/**
  * Author lightstaff
  * URL https://qiita.com/lightstaff/items/9579a4aa5112e53f3962
  */

/** Interface for database component **/
trait DBComponent {

  /** Jdbc profile **/
  val profile: JdbcProfile

  import profile.api._

  /** Database **/
  def db: Database

}