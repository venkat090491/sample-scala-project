package collections_examples.sets

object TestMinAndMaxInSets {

  def main(args: Array[String]): Unit = {
    val numsSet = Set(5,6,9,20, 30,45)
    println(numsSet.min)
    println(numsSet.max)

    //Find Common elements between sets
    val numsSet2 = Set(50,60,9,20,35,55)

    println(numsSet & numsSet2)
    //or
    println(numsSet.intersect(numsSet2))

    //Difference between sets
    println(numsSet &~ numsSet2)


  }
}
