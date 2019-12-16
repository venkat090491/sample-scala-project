package apache_akka

import java.util.concurrent.TimeUnit

import akka.actor.{Actor, ActorSystem, Props}
import akka.util.Timeout

class ActorAskMethodExample extends Actor{
  override def receive: Receive = {
    case message: String => println("Message received : "+ message)
      println("Replying...")
      //val sender = sender()

  }
}

object ActorsAskMethodMain {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[ActorAskMethodExample], "ActorAskMethod")
    //implicit val timeout = Timeout(2)
  }
}
