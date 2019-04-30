package befaster.solutions.SUM

import org.scalatest.{FlatSpec, Matchers}

class SumTest extends FlatSpec with Matchers {

  it should "compute sum" in {
    Sum.sum(1,2) shouldBe 3
  }

  it should "throw exception if par negative" in {
    intercept[IllegalArgumentException]{
      Sum.sum(-2,10)
    }}

    it should "throw exception if par bigger than 100" in {
      intercept[IllegalArgumentException]{
        Sum.sum(1,105)
      }}

}

