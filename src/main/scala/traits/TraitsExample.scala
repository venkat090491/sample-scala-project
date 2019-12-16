package traits

trait Equal {
  def isEqual(x:Any) : Boolean
  def isNotEqual(x:Any): Boolean = !isEqual(x)
}


/*class Point(xc:Int, yc:Int) extends Equal {
  override def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].xc == yc
}*/

object TraitsExample {


}
