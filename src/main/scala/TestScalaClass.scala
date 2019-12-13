object TestScalaClass {

  def main(args: Array[String]): Unit = {

    println("Hello World!!")
  }

  //Imperative approach example
  def containsNeg(nums:List[Int]) : Boolean = {
    var exists = false
    for(num <- nums)
      if (num < 0)
        exists = true

    exists
  }

  //functional approach
  def containsNeg1(nums:List[Int]): Boolean = nums.exists(_ < 0)
  def containsOdd(nums:List[Int]): Boolean = nums.exists( _ % 2 == 1)
}
