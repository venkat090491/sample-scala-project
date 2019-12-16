import scala.util.matching.Regex

object TestRegex {

  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    val str = "Scala is scalable and cool"
    println(pattern findFirstIn str)

    val pattern1 = new Regex("abl[ae]\\d+")
    val str1 = "ablaw is able1 and cool"

    println((pattern1 findAllIn str1).mkString(","))
  }
}
