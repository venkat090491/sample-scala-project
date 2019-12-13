package functions

object FunctionsWithVariableArguments {
  def main(args: Array[String]): Unit = {
    printArgs("Hello", "Scala", "Python")
  }

  def printArgs(args:String*) = {
    var i = 0
    for(arg <- args){
      println("Arg value["+i+"] = "+arg)
      i += 1
    }
  }

}
