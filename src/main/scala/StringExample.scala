/*
Methods used to obtain information about an object are known as Accessor methods
 */

object StringExample {

  def main(args: Array[String]): Unit = {
    val str1 :String = "Hello World. This world is beautiful. "

    println(str1.length)

    val str2 = "Welcoming Venkat to this World"
    //Concatenating strings example
    println(str1.concat(str2))
    //or
    println(str1 + str2)
  }
}
