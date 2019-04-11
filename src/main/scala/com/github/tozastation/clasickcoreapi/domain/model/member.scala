package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class MemberId(value: Int) extends MappedTo[Int]

case class MemberName(value: String) extends MappedTo[String]

case class IconPath(value: String) extends MappedTo[String]

case class Member(
                  id: MemberId,
                  name: MemberName,
                  iconPath: IconPath
                )

class Members(tag: Tag) extends Table[Member](tag, "member") {
  def id = column[MemberId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[MemberName]("name")
  def iconPath = column[IconPath]("icon_path")
  def * = (id, name, iconPath) <> (Member.tupled, Member.unapply)
}

object Members extends TableQuery(new Members(_))