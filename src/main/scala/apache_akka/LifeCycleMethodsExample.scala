package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class LifeCycleMethodsExample extends Actor{
  override def receive: Receive = {
    case msg: String => {
      println(msg +" "+self.path.name)
      var a:Int = 10/0
    }
  }

  override def preStart(): Unit = {
    println("PreStart called")
  }

  override def postStop(): Unit = {
    println("PostStop Called")
  }

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    println("PreRestart method is called")
    println("Reason:" +reason)
  }
}

object ActorMain {

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[LifeCycleMethodsExample], "LifeCyclesMethods")
    actor ! "Hello from"

    println("Stopping actor")
    actorSystem.stop(actor)
  }
}
