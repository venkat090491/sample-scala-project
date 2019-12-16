package collections_examples.lists

object ListExample1 {

  def main(args: Array[String]): Unit = {
    val fruits : List[String] = List("apples", "bananas", "grapes")
    val nums : List[Int] = List(1,2,3,4)
    //Empty List
    val emptyList : List[Nothing] = List()

    //Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1,0,0),
        List(0,1,0),
        List(0,0,1)
      )

    //Another way of creating lists
    val fruits1 = "apples" :: ("oranges" :: ("pears" :: Nil))

    val empty = Nil
    println(fruits.head)
    println(fruits.tail)
    println(fruits.isEmpty)

    //Concatenating lists in scala using ::: or List.:::() or List.concat() methods

    val nums2 = List(5,6,7,8)
    println(nums:::nums2)
    //or
    println(nums.:::(nums2))
    //orhttps://docs.scala-lang.org/overviews
    println(nums.concat(nums2))
    //or
    println(List.concat(nums, nums2))

    //Example for creating uniform lists in scala to retain same content across the list
    val fruits3 = List.fill(3)("apples")
    println(fruits3)


  }
}
