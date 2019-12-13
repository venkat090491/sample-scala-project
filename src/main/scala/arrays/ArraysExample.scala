package arrays

import Array._

object ArraysExample {

  def main(args: Array[String]): Unit = {
    //Ways of creating arrays in Scala
    var z:Array[String] = new Array[String](3)
    //or
    var z1 = new Array[String](3)
    //or
    var z2 = Array("Zara", "Nuha", "Ayan")

    //Example for concatenating arrays
    val myList1 = Array(1,2,3,4)
    val myList2 = Array(5,6,7,8)

    val myList3 = concat(myList1, myList2)
    //myList3.foreach(println)

    //Creating array with range

    val myList4 = range(10,20, 2)
    //myList4.foreach(println)

    val myList5 = Array.apply(1,2,3,4,5)
    myList5.foreach(println)

  }
}
