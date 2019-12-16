package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class ActorMethodsExample extends Actor{
  override def receive: Receive = {
    case msg:String => println("Message received:"+msg+" from - "+self.path.name)
      println("Sender:"+sender())
  }
}

object ActorExample {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[ActorMethodsExample], "ActorMethodsExample")
    actor ! "Hello from"
    actor.tell("Hello", null)
  }
}
