package build.warm_up

object JumpingOnClouds extends App {

  var steps = 0

  def jumpingOnClouds(c: Array[Int]): Int = {
    var currIndex = 0
    while (currIndex < (c.length - 2)) {
      currIndex = doJump(currIndex, c)
      steps += 1
    }
    return steps
  }

  def doJump(index: Int, ar: Array[Int]): Int = {
    try {
      if (ar(index + 2) == 0) return index + 2
      else return index + 1
    } catch {
      case ex: Exception => return index + 1
    }
  }

  println(jumpingOnClouds(Array(0, 0, 0, 0, 1, 0)))
}
