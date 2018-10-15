package build.warm_up

object SockMerchant extends App {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var totalPairs = 0
    for ( m1 <- ar.distinct ) {
      totalPairs=totalPairs+((ar.filter(_==m1).length/2).toInt)
    }
    return totalPairs 
  }

  var sockArray = Array(1,1,3,1,2,1,3,3,3,3)
  sockMerchant(7, sockArray)
}
