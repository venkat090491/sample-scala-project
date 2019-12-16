package collections_examples.lists

object ListTabulateExample {

  def main(args: Array[String]): Unit = {
    val squares = List.tabulate(6)(n => n * n)
    println("squares: "+squares)

    val mul = List.tabulate(4,5)( _ * _)
    println(mul)
  }
}
