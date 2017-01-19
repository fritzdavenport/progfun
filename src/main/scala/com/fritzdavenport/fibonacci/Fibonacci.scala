package com.fritzdavenport.fibonacci

import scala.annotation.tailrec

object Fibonacci {
  @tailrec
  def calc(n : Int, a : Int, b : Int) : Int = {
    if (n == 0) a
    else calc(n-1, b, b+a)
  }

  def getPos(i: Int, acc : Int = 0) : Int = {
    if (i == 0) 0
    else if (i == 1) 1
    else if (i == 2) 1
    else calc(i, 0, 1)
  }
}
