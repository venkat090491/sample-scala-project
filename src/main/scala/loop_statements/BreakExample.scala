package loop_statements

import scala.util.control._

object BreakExample {

  def main(args: Array[String]): Unit = {
    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    val loop = new Breaks

    loop.breakable {
      for(a <- numList) {
        println("Value of a is :"+ a)

        if(a == 4) {
          loop.break
        }
      }
    }

    println("After the loop")
  }
}
