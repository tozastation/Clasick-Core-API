package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class AlbumId(value: Int) extends MappedTo[Int]

case class AlbumName(value: String) extends MappedTo[String]

case class AlbumIconPath(value: String) extends MappedTo[String]

case class Album(
                id: AlbumId,
                name: AlbumName,
                iconPath: AlbumIconPath
                )

class Albums(tag: Tag) extends Table[Album](tag, "album") {
  def id = column[AlbumId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[AlbumName]("name")
  def albumIconPath = column[AlbumIconPath]("icon_path")
  def * = (id, name, albumIconPath) <> (Album.tupled, Album.unapply)
}

object Albums extends TableQuery(new Albums(_))