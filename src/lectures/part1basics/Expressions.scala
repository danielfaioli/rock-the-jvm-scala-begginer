package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // This is a Expression
  println(x)

  // Math and Bitwise operators
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  // relational operators
  // == != > >= < <=

  println(! (1 == x))

  var aVar = x
  aVar += 1
  println(aVar)

  // Instructions (DO - Imperative Languages) Vs Expressions (VALUE)

  // IF expressions
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF Expression - This is something that evaluates to a VALUE
  println(5)

  /** In functional programming and expresive languages
   *  the logics are different.
   *  In a imperative language the above statement would be:
   *  if val = true; do something else do something else;
   *  In an expressive language:
   *  A value is either one value if a condition says its true or other value
   *  otherwise.
   *  */

  // Everithing in scala is an expressions - that is, it returns a value

  val aWeirdValue = (aVar = 3) // Unit === void
  println(aWeirdValue)

  // Side effects in scala are evaluated to Unit
  // side effects: println(), while loops, reassigning variables

  // Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = 3

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  // Code Blocks are, as everithing in scala, EXPRESSIONS
  // The values and variables in a code block are LOCAL

  // Exercises

  // 1. difference between "hello world" vs println("hello world")

  val hello = "hello world" // this is a string
  println("hello world") // this is a unit
  // println() is an expression which has the side effect of printing something to the console


  val someValue = {
    2 < 3
  } // this is a bool

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  } // the value of someOtherValue is 42
  println(someOtherValue)


}
