package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class ArtistId(value: Int) extends MappedTo[Int]

case class ArtistName(value: String) extends MappedTo[String]

case class ArtistDescription(value: String) extends MappedTo[String]

case class ArtistIconPath(value: String) extends MappedTo[String]

case class Artist(
                  id: ArtistId,
                  name: ArtistName,
                  description: ArtistDescription,
                  artistIconPath: ArtistIconPath
                )

class Artists(tag: Tag) extends Table[Artist](tag, "artist") {
  def id = column[ArtistId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[ArtistName]("name")
  def artistDescription = column[ArtistDescription]("description")
  def artistIconPath = column[ArtistIconPath]("icon_path")
  def * = (id, name, artistDescription, artistIconPath) <> (Artist.tupled, Artist.unapply)
}

object Artists extends TableQuery(new Artists(_))