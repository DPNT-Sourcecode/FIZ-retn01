package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String ={
    if(number<1 || number>9999) throw new IllegalArgumentException("Number should be in [1-9999]")
    val numberStr=number.toString
    val isFizz=number%3==0 || numberStr.contains('3')
    val isBuzz=number%5==0 || numberStr.contains('5')
    val isDeluxe=number>10 && numberStr.count(x=> x==numberStr.charAt(0))==numberStr.length()
    val isFakeDeluxe=isDeluxe &&  number%2==1
    (isFizz,isBuzz,isDeluxe) match {
      case (true,true,true) => if (isFakeDeluxe)"fizz buzz fake deluxe" else "fizz buzz deluxe"
      case (true,true,false) => "fizz buzz"
      case (true,false,true) => "fizz deluxe"
      case (false,true,true) => "buzz deluxe"
      case (false,false,true) => "deluxe"
      case (true,false,false) => "fizz"
      case (false,true,false) => "buzz"
      case _ => ""+number
    }
  }
}


