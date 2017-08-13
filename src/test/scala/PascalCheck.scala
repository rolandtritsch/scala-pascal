package org.innolocity.scala.pascal

import org.scalacheck.Gen
import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop._

class PascalCheck extends PropSpec with PropertyChecks with Matchers {
  private val MaxRow = 10000000

  property("The sum of row(n+1) is the sum of row(n)*2") {
    forAll { (row: Int) =>
      whenever(
        row >= 0 && row < MaxRow
      ) {
        val sumOfRowN = Triangle.rowN(row).sum
        val sumOfRowNPlusOne = Triangle.rowN(row + 1).sum
        sumOfRowNPlusOne shouldBe sumOfRowN * 2
      }
    }
  }

  property("All rows are palindromes") {
    forAll (minSuccessful(300), workers(4)) { (row: Int) =>
      whenever(
        row >= 0 && row < MaxRow
      ) {
        val rowN = Triangle.rowN(row)
        rowN should be (rowN.reverse)
      }
    }
  }

  val edgeIndexes = for {
    row <- Gen.choose(0, MaxRow)
    col <- Gen.oneOf(0, row)
  } yield (row, col)

  property("For all rows the first and the last col are 1") {
    forAll(edgeIndexes) { (i) =>
        Triangle.triangleByIndex(i) shouldBe 1
    }
  }
}