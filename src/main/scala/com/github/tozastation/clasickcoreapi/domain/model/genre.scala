package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class GenreId(value: Int) extends MappedTo[Int]

case class GenreName(value: String) extends MappedTo[String]

case class GenreIconPath(value: String) extends MappedTo[String]

case class Genre(
                   id: GenreId,
                   name: GenreName,
                   genreIconPath: GenreIconPath
                 )

class Genres(tag: Tag) extends Table[Genre](tag, "genre") {
  def id = column[GenreId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[GenreName]("name")
  def iconPath = column[GenreIconPath]("icon_path")
  def * = (id, name, iconPath) <> (Genre.tupled, Genre.unapply)
}

object Genres extends TableQuery(new Genres(_))