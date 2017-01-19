package com.fritzdavenport.fibonacci

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by fritz.davenport on 1/18/17.
  */
class PartialSpec extends FlatSpec with Matchers {
  "Partial" should "work" in {
    def partial[A,B,C](a : A, f : (A,B) => C) : B => C = (b) => f(a, b)
    val a = 4
    val mult = (a : Int, b : Int) => a * b

    partial(a, mult)(4) shouldBe 16
  }
}
