package com.fritzdavenport.fibonacci

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by fritz.davenport on 1/19/17.
  */
class CurrySpec extends FlatSpec with Matchers {
  "Currying" should "definitely work" in {
    def curry[A,B,C](f: (A, B) => C): A => (B => C) =
      (x : A) => y : B => f(x, y)

    def mult(a : Int, b : Int) = a * b
  }

  "Uncurrying" should "also, probably work" in {
    def uncurry[A,B,C](f: A => B => C): (A, B) => C =

  }
}
