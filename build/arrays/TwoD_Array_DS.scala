package build.arrays

import javax.lang.model.`type`.ArrayType

object TwoD_Array_DS extends App {

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    var maxHGSum = -99999
    val loopLimit= arr.size - 3
    for(i <- 0 to loopLimit){
      for(j <- 0 to (arr(i).size-3)){
        var firstRow= arr(i)(j)+arr(i)(j+1)+arr(i)(j+2)
        var secondRow=arr(i+1)(j+1)
        var thirdRow=arr(i+2)(j)+arr(i+2)(j+1)+arr(i+2)(j+2)
        var currentHGSum= firstRow + secondRow + thirdRow
        if(currentHGSum > maxHGSum) maxHGSum = currentHGSum
      }
    }
    return maxHGSum
  }

  //call the above method with input array as parameter
}
