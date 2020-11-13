package namegenerator

import util.Random

class NameGenerator {
  val names = Seq("Alice", "Eve", "Bob", "Peter", "Sue")

  def randomName(): String = {
    val index = Random.nextInt(names.size)
    names(index)
  }
}
