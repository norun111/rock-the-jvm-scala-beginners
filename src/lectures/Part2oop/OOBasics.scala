package lectures.Part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}
// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2
  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  //overloading
  // can overloading with different parameter
  def greet(): Unit = println(s"Hi, I am $name")

  //this can't overload
//  def greet(): Int = 42

  //multiple constructor
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

//class parameters are NOT FIELDS
