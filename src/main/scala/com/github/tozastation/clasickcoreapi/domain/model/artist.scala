package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class ArtistId(value: Int) extends MappedTo[Int]

case class ArtistName(value: String) extends MappedTo[String]

case class Description(value: String) extends MappedTo[String]

case class IconPath(value: String) extends MappedTo[String]

case class Artist(
                  id: ArtistId,
                  name: ArtistName,
                  description: Description,
                  iconPath: IconPath
                )

class Artists(tag: Tag) extends Table[Artist](tag, "artist") {
  def id = column[ArtistId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[ArtistName]("name")
  def description = column[Description]("description")
  def iconPath = column[IconPath]("icon_path")
  def * = (id, name, description, iconPath) <> (Artist.tupled, Artist.unapply)
}

object Artists extends TableQuery(new Artists(_))