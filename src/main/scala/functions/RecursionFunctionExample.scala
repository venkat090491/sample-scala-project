package functions

object RecursionFunctionExample {

  def main(args: Array[String]): Unit = {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
    println(factorial(5))

  }

  def factorial(x:Int): Long = {
    if(x <= 1)
      1
    else
      x * factorial(x - 1)
  }
}
