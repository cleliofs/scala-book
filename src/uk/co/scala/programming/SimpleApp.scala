package uk.co.scala.programming

object Hello extends App {

  var hello = new HelloWorld
  
  hello.printHelloWorld()
  hello.print("Print this line");
  
  var general = new General
  
  val res1 = general.factorial(30)
  hello.print(res1.toString)
  
  var capitals = Map("US" -> "Washignton", "Brazil" -> "Brasilia", "England" -> "London")
  println(capitals)
  println(capitals("Brazil"))
  capitals += ("Japan" -> "Tokyo")
  println(capitals)
  capitals.foreach(c => println(c))
  capitals.keys.foreach(k => println(k.toUpperCase()));
  capitals.values.foreach(v => println(v.toLowerCase()));
  
  brutalIterator(capitals.keys)
  brutalIterator(capitals.keys.toArray)

  def brutalIterator(list: Array[String]) = {
	  list.foreach(i => print(i))
  }
  
  def brutalIterator(list: Iterable[String]) = {
    for (i <- list) {
      print(i)
    }
  }
  
  val MAX = general.max(10, 5)
  println(MAX)
  println(general.max(10, 15))
  
  val greetings = new Array[String](3)
  greetings(0) = "Hello"
  greetings(1) = ", "
  greetings(2) = "world!"
  for (i <- 0 to (greetings.length - 1)) print(greetings(i))
  greetings.foreach(i => print(i))
  
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwoThreeFour)
  
  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree)
  if (oneTwoThree.exists(i => i == 1)) print("Number 1 exists")
  if (oneTwoThree.exists(i => i == 4)) print("Number 4 exists")
  val newOneTwoThree = 4 :: oneTwoThree
  if (newOneTwoThree.exists(i => i == 4)) print("Now number 4 exists on new list")
    
}