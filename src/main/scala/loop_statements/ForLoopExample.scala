package loop_statements

/*
  General syntax of for loop in Scala
  for(var x <- Range)
    statements(s)

  Range can be represented as i to j or i until j
  <- operator is called generator
 */

object ForLoopExample {

  def main(args: Array[String]): Unit = {

    var a = 0
    for(a <- 1 to 10)
      println("Value of a is:"+ a)
  }
}
