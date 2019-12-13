package conditionals

/*
  General syntax of if else in scala
  if(Boolean expression) {
    statements
  }
  if(Boolean expression)
    statements
  else
    statements
 */

object TestIfElse {

  def main(args: Array[String]): Unit = {
    var x = 30

    if(x < 20)
      println("This is if statement")
    else
      println("This is else statement")
  }
}
