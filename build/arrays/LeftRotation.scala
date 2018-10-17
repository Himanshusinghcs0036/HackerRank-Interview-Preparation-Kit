package build.arrays

object LeftRotation extends App {

  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    var copyArray = a.clone()
    for (index <- 0 to (a.length - 1)) {
      val sourceIndex = (index + d) % a.length
      copyArray(index)=a(sourceIndex)
      println("For index :"+index +" and sourceIndex: "+sourceIndex +" value copyArray(index) ="+copyArray(index) +" and source array a(sourceIndex) = "+a(sourceIndex))
    }
    return copyArray;
  }

  //rotLeft(Array(1,2, 3, 4, 5), 5)
  var finalArray=rotLeft(Array(1,2, 3, 4, 5), 4)
  finalArray.foreach( x => println(x))


}
