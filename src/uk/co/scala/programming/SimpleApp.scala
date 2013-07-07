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
  
  def brutalIterator(list: Iterable[String]) = {
    for (i <- list) {
      print(i)
    }
  }
  
  val MAX = general.max(10, 5)
  println(MAX)
  println(general.max(10, 15))
}