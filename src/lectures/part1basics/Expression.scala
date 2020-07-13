package lectures.part1basics

object Expression extends App {
  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  println(!(1 == x))
  // 1 && ||

  var aVariable = 2
  aVariable += 3 // also works with
  println(aVariable)

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    i += 1
    println(i)
  }

  //NEVER WRITE THIS AGAIN

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlocks: Int = {
    val y = 2
    val z = y + 1

    if (z > 2) 1 else 2
  }
  val aStrCodeBlocks = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986 //IRREVALENT
    42
  }
  println(someOtherValue)
}
