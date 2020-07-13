package lectures.part1basics

object ValuesVariableTypes extends App {

  var x: Int = 42
  println(x)

  x = 2
  println(x)

  //Compiler can infer types

  val aString: String = "hello Scala"; val anotherString = "goodbye"
  println(aString)
  println(anotherString)

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val along: Long = 534525534L
  val aFloat: Float = 2.0f
  val aDouble: Double =   3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5

}
