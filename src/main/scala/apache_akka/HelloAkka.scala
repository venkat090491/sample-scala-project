package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class HelloAkka extends Actor{
  override def receive: Receive = {
    case msg:String => println(msg)
    case _ => println("Unknown message")
  }
}

object Main {


  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem("ActorSystem")
    var actor = actorSystem.actorOf(Props[HelloAkka], "HelloAkka")
    actor ! "Hello Akka"
    actor ! 100.52
  }
}
