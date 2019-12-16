package collections_examples.options

object TestOptions {

  def main(args: Array[String]): Unit = {
    val capitals = Map("France"->"Paris","Japan"->"Tokyo")

    println(capitals.get("India"))
    println(show(capitals.get("India")))
    println(show(capitals.get("Japan")))
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
