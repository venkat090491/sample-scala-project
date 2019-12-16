package collections_examples.tuples

object TestTuples {

  def main(args: Array[String]): Unit = {
    val t1 = (4,3,2,1)

    t1.productIterator.foreach(println)
  }
}
