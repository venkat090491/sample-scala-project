package collections_examples.maps

/*
Maps can be created using the below mentioned examples
val map1 : Map[Char, Int] = Map()
or
val map2 = Map("red"->"#FF0000", "azure"->"#F0FFFF")
 */

object TestMaps {

  def main(args: Array[String]): Unit = {
    val colors = Map("red"-> "#FF0000", "azure"->"#F0FFFF", "peru"-> "#CD853F")
    val nums :Map[Int, Int] = Map()
    val colors1 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0001")


    println(colors.keys)
    println(colors.values)
    println(nums.isEmpty)
    println(colors.isEmpty)

    println(colors ++ colors1)

    //Iterating through map examples
    colors.keys.foreach{ i =>
       println(i)
        println(colors(i))
    }
  }
}
