package lectures.Part2oop

object caseClasses extends App {

  /*
   equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  //1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  println(jim.toString)
}
