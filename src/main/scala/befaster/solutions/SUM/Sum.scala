package befaster.solutions.SUM

import befaster.runner.SolutionNotImplementedException

object Sum {
  def sum(x: Int, y: Int): Int ={
    if(x<0 || x>100) throw new IllegalArgumentException("First argument is out of range")
    if(y<0 || y>100) throw new IllegalArgumentException("Second argument is out of range")
    x+y
  }
}



