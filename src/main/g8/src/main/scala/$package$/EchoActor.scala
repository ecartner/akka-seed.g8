package $package$

import akka.actor.{Actor, Props}
import akka.event.Logging

object EchoActor {
  def props: Props = Props(new EchoActor)
}

class EchoActor extends Actor {
  val log = Logging(context.system, this)

  override def preStart(): Unit = {
    log.debug("Starting")
  }

  override def receive: Receive = {
    case msg: String => sender() ! msg
    case _ =>
  }
}

