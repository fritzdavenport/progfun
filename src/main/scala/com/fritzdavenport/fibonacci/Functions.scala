package com.fritzdavenport.fibonacci

/**
  * Created by fritz.davenport on 1/18/17.
  */
object Functions {
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    def sortedLoop(head : A, tail : Array[A]) : Boolean = {
      if (tail.isEmpty) true
      else if (gt(head, tail.head)) sortedLoop(tail.head, tail.tail)
      else false
    }

    sortedLoop(as.head, as.tail)
  }
}
