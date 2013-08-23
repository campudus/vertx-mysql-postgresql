package com.campudus.test.postgresql

import org.junit.Test
import org.vertx.scala.core.json._

import com.campudus.test.{ BaseSqlTests, SqlTestVerticle }

class PostgreSqlTest extends SqlTestVerticle with BaseSqlTests {

  val address = "campudus.asyncdb"
  val config = Json.obj("address" -> address)

  override def getConfig = config

  @Test
  override def selectFiltered(): Unit = super.selectFiltered()
  @Test
  override def selectEverything(): Unit = super.selectEverything()
  @Test
  override def insertUniqueProblem(): Unit = super.insertUniqueProblem()
  @Test
  override def insertMaliciousDataTest(): Unit = super.insertMaliciousDataTest()
  @Test
  override def insertTypeTest(): Unit = super.insertTypeTest()
  @Test
  override def insertCorrect(): Unit = super.insertCorrect()
  @Test
  override def createAndDropTable(): Unit = super.createAndDropTable()
  @Test
  override def multipleFields(): Unit = super.multipleFields()
  @Test
  override def simpleConnection(): Unit = super.simpleConnection()

}