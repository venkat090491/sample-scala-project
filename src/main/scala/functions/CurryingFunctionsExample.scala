package functions

/*
Currying transforms a function that takes multiple parameters into a chain of functions

Example: def strcat(s1:String)(s2:String) = s1 + s2
            or
         def strcat(s1:String) = (s2:String) => s1+s2
 */

object CurryingFunctionsExample {

  def main(args: Array[String]): Unit = {
    val str1:String = "Hello"
    val str2: String = "Scala!"

    println(strcat(str1)(str2))
  }

  def strcat(s1:String)(s2:String):String = s1 + s2
}
