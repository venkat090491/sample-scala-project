package functions

object NestedFunctionsExample {

  def main(args: Array[String]): Unit = {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
    println(factorial(5))
  }

  def factorial(x:Int) : Int = {
    def fact(i:Int, accumulator: Int): Int = {
      if(i ==1)
        accumulator
      else
        fact(i -1 , i * accumulator)
    }
    fact(x,1)
  }
}
