package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String ={
    if(number<1 || number>9999) throw new IllegalArgumentException("Number should be in [1-9999]")
    val numberStr=number.toString
    val isFizz=number%3==0 || numberStr.contains('3')
    val isBuzz=number%5==0 || numberStr.contains('5')
    val isDeluxe=number%3==0 && numberStr.contains('3') || (number%5==0 && numberStr.contains('5'))
    val strDeluxe= if (isDeluxe &&  number%2==0) "deluxe"  else "fake deluxe"
    (isFizz,isBuzz,isDeluxe) match {
      case (true,true,true) =>"fizz buzz "+strDeluxe
      case (true,true,false) => "fizz buzz"
      case (true,false,true) => "fizz "+strDeluxe
      case (false,true,true) =>  "buzz "+strDeluxe
      case (false,false,true) => strDeluxe
      case (true,false,false) => "fizz"
      case (false,true,false) => "buzz"
      case _ => ""+number
    }
  }
}

