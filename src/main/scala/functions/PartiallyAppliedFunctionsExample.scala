package functions

import java.util.Date

object PartiallyAppliedFunctionsExample {

  def main(args: Array[String]): Unit = {
    /*
    Fully applied function
    val date = new Date
    log(date, "message1")

    Thread.sleep(1000)
    log(date, "message2")

    Thread.sleep(1000)
    log(date, "message3")*/

    //Below is the partially applied function example as we are binding date to the function logWithDateBound. So logWithBoundDate is partially
    // applied function
    val date = new Date
    val logWithDateBound = log(date, _: String)

    logWithDateBound("message1")
    Thread.sleep(1000)

    logWithDateBound("message2")
    Thread.sleep(1000)

    logWithDateBound("message3")
  }

  def log(date: Date, message: String)  = {
    println(date+" ---- "+message)
  }
}
