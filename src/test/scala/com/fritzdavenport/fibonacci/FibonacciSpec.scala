package com.fritzdavenport.fibonacci

import org.scalatest.{FlatSpec, Matchers}

class FibonacciSpec extends FlatSpec with Matchers {
  "Fib" should "work for easy numbers" in {
    Fibonacci.getPos(0) shouldBe 0
    Fibonacci.getPos(1) shouldBe 1
    Fibonacci.getPos(2) shouldBe 1
    Fibonacci.getPos(3) shouldBe 2
    Fibonacci.getPos(6) shouldBe 8
  }
}
