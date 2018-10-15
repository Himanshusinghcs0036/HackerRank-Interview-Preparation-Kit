package build.warm_up

object SockMerchant extends App {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var totalPairs = 0
    println(ar.distinct.foreach(i => ar.filter(_ == i).length))
    return totalPairs
  }

  var sockArray = Array(1,1,3,1,2,1,3,3,3,3)
  sockMerchant(7, sockArray)
}
