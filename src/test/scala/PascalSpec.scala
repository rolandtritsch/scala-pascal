package org.innolocity.scala.pascal

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class PascalSpec extends FlatSpec {
   "The top of the triangle" should "only have one element and it needs to be 1" in {
    val triangle = Triangle.firstNRows(0)

    triangle should have length 1
    triangle(0) should have length 1
    triangle(0)(0) shouldBe 1
  }

  "The first 5 rows" should "be correct" in {
    val solution = List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1), List(1, 4, 6, 4, 1))

    val triangle = Triangle.firstNRows(4)
    triangle should be (solution)
  }

  "The 6th row" should "be correct" in {
    val solution = List(1, 5, 10, 10, 5, 1)

    val triangle = Triangle.rowN(5)
    triangle should be (solution)
  }
}