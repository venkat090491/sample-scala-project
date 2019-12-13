object DemoPoint {

  def main(args: Array[String]): Unit = {
    val pt = new Point(10,20)
    pt.move(10,10)

    val location = new Location(10,20,30)
    location.move(5,5,5)
  }
}
