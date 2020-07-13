package lectures.Part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false
  }

  class Person {
    // instance-level functionality
  }

  // COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala objects = SINGLETON INSTANCE
  val mary = new Person
  val john = new Person
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1==person2)
}
