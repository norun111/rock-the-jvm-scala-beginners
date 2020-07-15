package lectures.Fringe

object Car extends App {
  val car = new Car("blue")
  car.run

  private def output(message: String): Unit = println(message)

  class Car(color: String) {
    def run = {
      Car.output("Start!!")
    }
  }
}
