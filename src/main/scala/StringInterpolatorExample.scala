object StringInterpolatorExample {

  def main(args: Array[String]): Unit = {
    val names = "James"
    println(s" Hello ${names}")

    //Example for evaluating expression in String Interpolation
    println(s" 1 + 1 is : ${1 + 1}")

    // Printf alternate in scala using string interpolator is f"

    val height = 1.9d
    println(f"$names%s is $height%3.2f meters tall")
  }
}
