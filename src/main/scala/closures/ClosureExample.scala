package closures

/*
  Example for function literal  or anonymous function
  (x:Int) => x + 1
  Example for function value
  val func1 = (x:Int) => x + 1

  Example for closure function
  val closureFunc = (x:Int) = x + factor
  Above closure has formal parameter bounded to function i.e x which is passed during function call where as we have non formal parameter i.e factor
 */

object ClosureExample {

  def main(args: Array[String]): Unit = {
    println("multiplier(1) value = "+ multiplier(1))
    println("multiplier(2) value = "+ multiplier(2))
  }
  var factor = 3
  val multiplier = (x:Int) => x * factor

}
