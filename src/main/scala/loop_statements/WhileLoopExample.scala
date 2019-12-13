package loop_statements

/*
General syntax of while loop is
while(condition) {
  statement(s)
}
 */

object WhileLoopExample {

  def main(args: Array[String]): Unit = {
    var a =10
    while(a<20) {
      println("value of a is :" +a)
      a += 1
    }
  }
}
