package uk.co.scala.programming

class General {

  def factorial(x: BigInt): BigInt = {
	  if (x == 0) 1 else x * factorial(x -1)
  }
  
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
}