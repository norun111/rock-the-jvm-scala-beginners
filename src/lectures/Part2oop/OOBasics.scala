package lectures.Part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author = new Author("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
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
  /*
  Novel and a Author

  Author: first name, surname, year
   - method fullName

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel


   */

  class Author(firstName: String, surname: String, val year: Int) {
    def fullName(): String = firstName + " " + surname

  }

  class Novel(name: String, year: Int, author: Author) {
    def authorAge = year - author.year
    def isWrittenBy(author: Author) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  /*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
   */


//class parameters are NOT FIELDS
