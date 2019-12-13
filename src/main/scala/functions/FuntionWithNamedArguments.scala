package functions

object FuntionWithNamedArguments {

  def main(args: Array[String]): Unit = {
    printInt(b = 7, a = 5)
  }

  def printInt(a:Int, b:Int) = {
    println("Value of a is :"+a)
    println("Value of b is :" +b)
  }
}
