// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  int + double
  double + int
  string + int
  string + double
  string + character
  string + boolean
  character + int
  character + string

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
//  int + boolean
//  int + string
//  int + character
//  double + boolean
//  double + string
//  double + character
//  boolean + character
//  character + double
//  character + boolean

  // write some examples
}