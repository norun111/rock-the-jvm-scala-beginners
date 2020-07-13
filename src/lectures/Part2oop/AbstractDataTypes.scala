package lectures.Part2oop

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit

  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    def preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // 1 = traits do not have constructor parameters
  // 2 - multiple traits may be inheritance by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
