# Implementation of the Pascal Triangle (to play around with code correctness)

This is an implementation of the [Pascal Triangle](https://en.wikipedia.org/wiki/Pascal%27s_triangle) to facilitate a discussion about code correctness (and ways to express it).

## To make this work ...

* you need to install git (e.g. `brew install git`)
* clone this repo
* run `sbt run`
* run `sbt test`

## Code correctness

The main intention is to discuss how you can show that code it doing what it is suppose to do.

Means, you need to have the means to express an expectation (or requirements) and then you need to have the means to prove that your expectations/requirements have been met.

I started to think about this, when I saw [Bill Venners talk on Programming by Contract](https://www.youtube.com/watch?v=LvhRYke2_LY) and while I worked through [THE Haskell book](http://haskellbook.com/) (and was exposed to [QuickCheck](https://hackage.haskell.org/package/QuickCheck) and [Jesitron's](http://jessitron.com) talk on [property-based testing](https://www.youtube.com/watch?v=shngiiBfD80)).

In this context I want to think and talk about ...

* conventional testing approaches
  * TDD - Test Driven Design (BDD, FDD, ...)
  * Unit-, Integration-, System-/End-to-End-, Acceptance-Testing
  * Non-functional testing (Load and Performance, Availability and Breaking, ...)
* programming-by-contract
* property-based-testing

## Tools (Scala)

* conventional - [ScalaTest](http://www.scalatest.org/)
* programming-by-contract - [Scala.Predef](http://www.scala-lang.org/api/2.12.0/scala/Predef$.html) (require/ensuring)
* property-based-testing - [ScalaCheck](https://www.scalacheck.org/)
* non-functional testing - [Gatling](http://gatling.io/)

