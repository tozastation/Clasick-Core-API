package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class PlaylistId(value: Int) extends MappedTo[Int]

case class PlaylistName(value: String) extends MappedTo[String]

case class PlaylistIconPath(value: String) extends MappedTo[String]

case class  Playlist(
                   id:  PlaylistId,
                   name:  PlaylistName,
                   playlistIconPath: PlaylistIconPath
                 )

class  Playlists(tag: Tag) extends Table[Playlist](tag, "playlist") {
  def id = column[PlaylistId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[PlaylistName]("name")
  def playlistIconPath = column[PlaylistIconPath]("icon_path")
  def * = (id, name, playlistIconPath) <> (Playlist.tupled, Playlist.unapply)
}

object Playlists extends TableQuery(new Playlists(_))