package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String ={
    if(number<1 || number>9999) throw new IllegalArgumentException("Number should be in [1-9999]")
    val isFizz=number%3==0 || number.toString.contains('3')
    val isBuzz=number%5==0 || number.toString.contains('5')
    val isDeluxe=number>10 && number.toString.count(x=> x==number.toString.
    (isFizz,isBuzz,isDeluxe) match {
      case (true,true) => "fizz buzz"
      case (true,_) => "fizz"
      case (_,true) => "buzz"
      case _ => ""+number
    }
  }
}


