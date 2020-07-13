package lectures.Part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hangout with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)
    def unary_! : String = s"$name what the hack!?"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
//    def learnsScala = this.learns("Scala") //Same
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntax suger)

  // "operators" in Scala

  val john  = new Person("John", "Back To The Future")
  println(john + mary) //Super cool

  println(mary.+(john))

  // ALL OPERATION ARE METHODS.
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) //equivalent

  /*
  1. Overload the + operator
     mary + "the rockstar" => new person "Mary (the rockstar)"

  2. Add an age to the Person class
     Add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer

  3. Add a "learns" method in the Person class => "Mary learns Scala"
     Add a learnsScala method, calls learns method with "Scala"
     Use it in postfix notation.

  4. Overload the apply method
     mary.apply(2) => "Mary watched Inception 2 times"
   */

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)

  println(mary(10))
}
