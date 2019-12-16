package traits

trait Printable extends Any{
  def print():Unit = println(this)
}

//Value class Example
class Wrapper(val underlying:Int) extends AnyVal with Printable

object ValueClassExample {

  def main(args: Array[String]): Unit = {
    val w = new Wrapper(3)
    w.print()
  }
}
