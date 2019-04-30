package befaster.solutions.SUM

import befaster.runner.SolutionNotImplementedException

object Sum {
  def sum(x: Int, y: Int): Int = {
     if (x<=0 || x>=100) throw new IllegalArgumentException("first parameter Must be  >=0 adn <=100")
    if (y<=0 || y>=100) throw new IllegalArgumentException("second parameter Must be  >=0 adn <=100")
    x+y
  }
}


