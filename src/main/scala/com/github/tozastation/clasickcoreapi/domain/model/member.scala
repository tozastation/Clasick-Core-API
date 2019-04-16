package com.github.tozastation.clasickcoreapi.domain.model

import slick.lifted.MappedTo
import slick.jdbc.MySQLProfile.api._

case class MemberId(value: Int) extends MappedTo[Int]

case class MemberName(value: String) extends MappedTo[String]

case class MemberIconPath(value: String) extends MappedTo[String]

case class Member(
                  id: MemberId,
                  name: MemberName,
                  memberIconPath: MemberIconPath
                )

class Members(tag: Tag) extends Table[Member](tag, "member") {
  def id = column[MemberId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[MemberName]("name")
  def memberIconPath = column[MemberIconPath]("icon_path")
  def * = (id, name, memberIconPath) <> (Member.tupled, Member.unapply)
}

object Members extends TableQuery(new Members(_))