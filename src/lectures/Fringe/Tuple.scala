package lectures.Fringe

object Tuple extends App {

  def getMaxValue(numbers: List[Int]):(Int, Int, Int) = {
    val max = numbers.max
    val min = numbers.min
    val index = numbers.indexOf(max)
    (max, min, index)
  }

  val numbers = List(1,2,3,4,5,10,6)

  val maxValue = getMaxValue(numbers)
  println(maxValue._1) //max
  println(maxValue._2) //min
  println(maxValue._3) //max_index
}
