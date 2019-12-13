package functions

object FunctionDefaultParametersExample {

  def main(args: Array[String]): Unit = {
    println(addInt(10))
    println(addInt(b = 20))
  }
  def addInt(a:Int = 5, b:Int = 7) : Int = a + b
}
