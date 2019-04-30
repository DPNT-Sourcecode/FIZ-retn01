package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String ={
    if(number<1 || number>9999) throw new IllegalArgumentException("Number should be in [1-9999]")
    (number%3,number%5) match {
      case (0,0) => "FizzBuzz"
      case (0,_) => "Fizz"
      case (_,0) => "Buzz"
      case _ => ""+number
    }
  }
}

