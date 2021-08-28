package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42 // this is a value
  println(x)

  /** val x: Int = 42
   *  AND
   *  val x = 42
   *  Are the Same - The compiler infers the vals type
   *  */

  // x = 13 - WRONG

  // values (val) are immutable

  val aString: String = "Strings are Double Quoted"
  println(aString)

  val aBool: Boolean = true
  val aChar: Char = 'a' // Chars = Symbols are single quoted

  // variables

  var aVar: Int = 4

  aVar = 5 // Is ok; vars are mutable
  println(aVar)
}
