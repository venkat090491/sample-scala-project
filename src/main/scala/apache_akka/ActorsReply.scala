package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class ActorReplyExample extends Actor {
  override def receive: Receive = {
    case message : String => println("Message received from "+ sender.path.name+ "message :" + message)
      val child = context.actorOf(Props[ChildActor1], "ChildActor1")
      child ! "Hello child"
  }
}

class ChildActor1 extends Actor {
  override def receive: Receive = {
    case message: String => println("Message received from "+ sender.path.name+ "message :" + message)
      println("replying...")
      sender() ! "I got you !"
  }
}

object ActorsReply {

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[ActorReplyExample], "RootActor1")
    actor ! "Hello"
  }
}
