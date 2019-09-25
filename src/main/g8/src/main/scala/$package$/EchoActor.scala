package $package$

import akka.actor.{Actor, Props}

object EchoActor {
  def props: Props = Props(new EchoActor)
}

class EchoActor extends Actor {

  override def receive: Receive = {
    case msg: String => sender() ! msg
    case _ =>
  }
}

