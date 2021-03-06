package com.campudus.vertx

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

trait VertxExecutionContext extends ExecutionContext {
  def execute(runnable: Runnable): Unit = runnable.run()
  def reportFailure(t: Throwable): Unit = println("failed while executing in vertx context", t)

  implicit val executionContext = VertxExecutionContext
}

object VertxExecutionContext extends VertxExecutionContext
