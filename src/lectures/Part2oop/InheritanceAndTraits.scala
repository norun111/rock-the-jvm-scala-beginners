package lectures.Part2oop

object InheritanceAndTraits extends App{

  //single class inheritance
  class Animal {
    val creatureType = "wild"
    protected def eat = println("nomnom")
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
//  cat.eat can't do this (protected)
  cat.crunch

  //not override yet
  println(cat.creatureType)

  //construction
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
//  class Dog(override val creatureType: String) extends Animal {
////    override val creatureType: String = "domestic"
//    override def eat = println("crunch crunch")
//  }

  class Dog(dogType: String) extends Animal {
    override val creatureType: String = dogType
    override def eat = println("crunch crunch")
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution
  val unknownAnimal = new Dog("K9")

  unknownAnimal.eat

}
