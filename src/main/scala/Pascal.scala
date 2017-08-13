package org.innolocity.scala.pascal

object Pascal {
  def main(args: Array[String]): Unit = {
    println(Triangle.firstNRows(4))
  }
}

object Triangle {
  def firstNRows(n: Int): List[List[Int]] = {
    require(n >= 0, s"${n} violated: n >= 0")
    (for(row <- 0 to n) yield rowN(row)).toList
  } ensuring(result => result.nonEmpty)

  def rowN(n: Int): List[Int] = {
    require(n >= 0, s"${n} violated: n >= 0")
    (for(col <- 0 to n) yield triangleByIndex((n, col))).toList
  } ensuring(result => result.head == 1 && result.last == 1)

  def triangleByIndex(i: (Int, Int)): Int = i match {
    case (0, 0) => 1
    case (r, 0) => 1
    case (r, c) if (r == c) => 1
    case (r, c) => triangleByIndex((r-1, c-1)) + triangleByIndex((r-1, c))
  }
}

