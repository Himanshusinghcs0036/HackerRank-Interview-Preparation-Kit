package build.warm_up

object CountingValleys extends App {

  def countingValleys(n: Int, s: String): Int = {
    var currentStatus = 0
    var countVally = 0
    for (step <- s.split("")) {
      if (currentStatus == 0 & step == "D") countVally = countVally + 1
      currentStatus=updateLevel(step, currentStatus)
    }
    return countVally
  }

  def updateLevel(step: String, currentStatus: Int): Int = {
    if (step == "D")  return (currentStatus - 1)
    else  return (currentStatus + 1)
  }

  println("total Vally =  "+countingValleys(5, "UDDDUDUU"))
}
