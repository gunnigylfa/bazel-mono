package greeting

import namegenerator.NameGenerator

object Greeter extends App {
  val nameGenerator = new NameGenerator()
  println(s"Hello ${nameGenerator.randomName()}!")
}
