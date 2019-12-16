package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class PropsExample extends Actor{
  override def receive: Receive = {
    case msg: String => println(msg+" "+self.path.name)
  }
}

object PropsMain {
  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem("ActorSystem")
    var actor = actorSystem.actorOf(Props[PropsExample], "PropExample")
    actor ! "Hello from"
  }
}
