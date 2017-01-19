package com.fritzdavenport.fibonacci

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by fritz.davenport on 1/18/17.
  */
class FunctionsTest extends FlatSpec with Matchers {

  "FunctionsTest" should "isSorted" in {
    val a = Array(1,2,3,4,5)
    val gt = (a : Int, b : Int) => a < b
    Functions.isSorted[Int](a, gt) shouldBe true

    val b = Array(5,4,3,2,1)
    Functions.isSorted[Int](b, gt) shouldBe false
  }
}
