package lectures.part1basics

object Functions extends App {

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + "-" + aRepeatedFunction(aString, n-1)
  }

  // Type annotation is not mandatory in regular functions
  // but it is in recursive functions.

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.
  // ALWAYS AVOID LOOPS, USE RECURSION

}
