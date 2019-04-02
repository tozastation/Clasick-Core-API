package com.github.tozastation.clasickcoreapi.infrastructure.persistence.component

import com.typesafe.config.ConfigFactory
import slick.jdbc.MySQLProfile.api._
import slick.jdbc.{JdbcProfile, MySQLProfile}

/**
  * Author lightstaff
  * URL https://qiita.com/lightstaff/items/9579a4aa5112e53f3962
  */

/** Database component for MySQL **/
object MySQLDBComponent extends DBComponent {

  /** Jdbc profile **/
  override lazy val profile: JdbcProfile = MySQLProfile

  import profile.api._

  /** Database instance **/
  override lazy val db: Database = MySQLDBConnector.connection

}

/** Singleton database connector for MySQL **/
private object MySQLDBConnector {

  private val config = ConfigFactory.load()
  config.checkValid(ConfigFactory.defaultReference(), "slick.mysql")

  /** Connection **/
  val connection = Database.forConfig("slick.mysql", config)

}