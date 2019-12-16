object PatternMatchingExample {

  def main(args: Array[String]): Unit = {
      println(matchTest(1))
      println(matchTest(10))
      println(matchTest1("two"))
      println(matchTest1("test"))
      println(matchTest1(1))
  }

  def matchTest(x:Int) :String = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Many"
  }

  def matchTest1(x:Any): Any  = x match {
    case 1 => "One"
    case "two" => 2
    case y:Int => scala.Int
    case _ => "many"
  }

}
