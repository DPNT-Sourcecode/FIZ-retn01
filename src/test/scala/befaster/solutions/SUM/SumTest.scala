package befaster.solutions.SUM

import org.scalatest.{FlatSpec, Matchers}

class SumTest extends FlatSpec with Matchers {

  it should "compute sum" in {
    Sum.sum(1,2) shouldBe 3
  }


  it should "compute sum with negative" in {
    Sum.sum(-10,-20) shouldBe -30
  }

}

