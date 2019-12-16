package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class RootActor extends Actor {
  override def receive: Receive = {
    case msg: String => println(msg+" "+self.path.name);
      var childActor = context.actorOf(Props[Child], "Child")
      childActor ! "Hello"
  }
}

class Child extends Actor {
  override def receive: Receive = {
    case msg: String => println(msg +" "+self.path.name)
  }
}

object ChildActorExample {

  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem("ActorSystem")
    var actor = actorSystem.actorOf(Props[RootActor], "RootActor")
    actor ! "Hello"
  }
}
