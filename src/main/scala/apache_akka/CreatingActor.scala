package apache_akka

import akka.actor.{Actor, ActorSystem, Props}

class CreatingActor extends Actor{
  override def receive: Receive = {
    case msg: String => println(msg + " "+ self.path.name)
  }
}

object CreatingActorExample {
  def main(args: Array[String]): Unit = {
    var actorSystem = ActorSystem("ActorSystem")
    var props1 = Props[CreatingActor]
    var actor1 = actorSystem.actorOf(props1)
    var actor2 = actorSystem.actorOf(Props[CreatingActor], "Actor2")
    var actor3 = actorSystem.actorOf(Props(classOf[CreatingActor]), "Actor3")
    var actor4 = actorSystem.actorOf(Props[CreatingActor], name="Actor4")
    var actor5 = actorSystem.actorOf(Props(new CreatingActor()), name="Actor5")

    actor1 ! "Hello"
    actor2 ! "Hello"
    actor3 ! "Hello"
    actor4 ! "Hello"
    actor5 ! "Hello"

  }
}
