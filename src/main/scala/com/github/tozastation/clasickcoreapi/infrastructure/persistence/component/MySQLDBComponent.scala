package com.github.tozastation.clasickcoreapi.infrastructure.persistence.component

import com.github.tozastation.clasickcoreapi.domain.model.{Albums, Artists, Genres, Members, Musics, Playlists, Users}
import com.typesafe.config.ConfigFactory
import slick.jdbc.MySQLProfile.api._
import slick.jdbc.{JdbcProfile, MySQLProfile}

/**
  * Author lightstaff
  * URL https://qiita.com/lightstaff/items/9579a4aa5112e53f3962
  */

/** Database component for MySQL **/
trait MySQLDBComponent extends DBComponent {

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

class InitDB {
  private val config = ConfigFactory.load("database.conf")
  config.checkValid(ConfigFactory.defaultReference(), "slick.mysql")
  private val db = Database.forConfig("slick.mysql", config)
  val schema = Users.schema

  def main(args: Array[String]): Unit = {
    db.run(DBIO.seq(
      schema.create,
      //...
      //schema.drop
    ))
  }//++ Musics.schema ++ Playlists.schema ++ Artists.schema ++ Genres.schema ++ Members.schema ++ Albums.schema
}