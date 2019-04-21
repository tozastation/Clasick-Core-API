package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class MusicId(value: Int) extends MappedTo[Int]

case class MusicName(value: String) extends MappedTo[String]

case class MusicDescription(value: String) extends MappedTo[String]

case class ManifestPath(value: String) extends MappedTo[String]

case class Music(
                  id: AlbumId,
                  name: AlbumName,
                  description: MusicDescription,
                  manifestPath: ManifestPath
                )

class Musics(tag: Tag) extends Table[Music](tag, "music") {
  def id = column[AlbumId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[AlbumName]("name")
  def musicDescription = column[MusicDescription]("description")
  def manifestPath = column[ManifestPath]("m3u8_path")
  def * = (id, name, musicDescription, manifestPath) <> (Music.tupled, Music.unapply)
}

object Musics extends TableQuery(new Musics(_))