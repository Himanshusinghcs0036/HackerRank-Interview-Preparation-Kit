package build.warm_up

object RepeatedString extends App {

  def repeatedString(s: String, n: Long): Long = {
    val countAInSource = s.split("").filter(_ == "a").length
    val sourceStringLength = s.length
    val multipleLengthCount = ((n / sourceStringLength) * countAInSource)
    if (n % sourceStringLength == 0) return multipleLengthCount
    else {
      val remainElementSize = n - ((n / sourceStringLength).toInt) * sourceStringLength
      val extraA=s.substring(0,remainElementSize.toInt).split("").filter(_ == "a").length
      return multipleLengthCount+extraA
    }
  }

  print(repeatedString("aba", 10))

}
