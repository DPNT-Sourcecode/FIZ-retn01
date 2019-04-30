package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizTest extends FlatSpec with Matchers {

  it should "if number 9 got fizz" in {
    FizzBuzz.fizzBuzz(9) shouldBe "fizz"
  }

  it should "if number 25 got buzz" in {
    FizzBuzz.fizzBuzz(25) shouldBe "buzz"}

    it should "if number 225 got fizz buzz" in {
      FizzBuzz.fizzBuzz(225) shouldBe "fizz buzz"}

  it should "if number 29 got 29" in {
    FizzBuzz.fizzBuzz(29) shouldBe "29"}

  it should "if number 23 got fizz" in {
    FizzBuzz.fizzBuzz(23) shouldBe "fizz"}

  it should "if number 58 got buzz" in {
    FizzBuzz.fizzBuzz(58) shouldBe "buzz"}

  it should "if number 555 got fizz buzz fake deluxe" in {
    FizzBuzz.fizzBuzz(555) shouldBe "fizz buzz fake deluxe"}

  it should "if number 2222 got deluxe" in {
    FizzBuzz.fizzBuzz(2222) shouldBe "deluxe"}

  it should "if number 7777 got fake deluxe" in {
    FizzBuzz.fizzBuzz(7777) shouldBe "fake deluxe"}

  it should "if number 777 got fizz fake deluxe" in {
    FizzBuzz.fizzBuzz(777) shouldBe "fizz fake deluxe"}
}



