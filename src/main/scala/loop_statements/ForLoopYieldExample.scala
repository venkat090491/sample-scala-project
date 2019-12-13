package loop_statements

object ForLoopYieldExample {

  def main(args: Array[String]): Unit = {
    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    var retVal = for {a <- numList if a != 2 ; if a < 8} yield a
    println(retVal.getClass.getName)
    for( a <- retVal)
      println("Value of a :" + a)
  }
}
