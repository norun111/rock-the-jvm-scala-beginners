package lectures.Part2oop

object Exceptions extends App {
  val x: String = null
//  println(x.length)

  // throwing and catching exception

  val aWeirdValue: String = throw new NullPointerException

  //throwable classes extend the Throwable class
  //Exceptions and Error are the major Throwable subtypes

  //2 . how to catch exception
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you")
    else 42
  
}
