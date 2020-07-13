package lectures.Part2oop

object InheritanceAndTraits {

  class Animal {
    def eat = println("nomnom")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat
}
