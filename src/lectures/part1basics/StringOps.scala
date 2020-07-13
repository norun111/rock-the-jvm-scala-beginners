package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello I am learning Scala"

  println(str.charAt(2)) //Index: 2 "l"

  println(str.substring(6, 11)) //from Index:6 to Index:11 6~10
  println(str.split(" ").toList) //List(Hello, I, am, learning, Scala)
  println(str.startsWith("Hello")) //return boolean
  println(str.replace(" ", "-")) //convert "-" from " "
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse) //alacS gninrael ma I olleH
  println(str.take(2)) //He

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name I am $age years old"
  val anotherGreeting = s"Hello, my name is $name I am ${age + 1} years old"

  println(anotherGreeting)

  // F-interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minutes"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
