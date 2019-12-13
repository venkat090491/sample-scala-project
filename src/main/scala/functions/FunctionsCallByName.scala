package functions

object FunctionsCallByName {

  def main(args: Array[String]): Unit = {

    def main(args: Array[String]): Unit = {
      delayed(time())
    }

    def time() = {
      println("getting time in nano seconds")
      System.nanoTime
    }

    def delayed(t: => Long) = {
      println("In delayed method")
      println("param: "+t)
    }
  }
}
