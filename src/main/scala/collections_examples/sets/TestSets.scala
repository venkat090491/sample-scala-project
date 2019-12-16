package collections_examples.sets

object TestSets {

  def main(args: Array[String]): Unit = {
    val set1 = Set("apples", "oranges", "bananas")
    val set2 = Set("apples","grapes")
    println(set1)

    println(set1.head)
    println(set1.tail)
    println(set1.isEmpty)

    println(set1.++(set2))
    println(set1 ++ set2)
  }
}
