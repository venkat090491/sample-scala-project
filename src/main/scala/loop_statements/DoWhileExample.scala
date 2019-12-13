package loop_statements

object DoWhileExample {

  def main(args: Array[String]): Unit = {
    var a = 10
    do {
      println("value of a is :"+ a)
      a += 1
    } while(a < 20)
  }
}
