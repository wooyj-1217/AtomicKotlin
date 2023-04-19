// IfExpressions/TrueOrFalse.kt

/**
 *
 * trueOrFalse()
 * - exp parameter가 true인지 false인지에 따라 return 하는 값이 달라지는 function
 *
 *
 */

fun trueOrFalse(exp: Boolean): String {
  if (exp)
    return "It's true!"          // [1] true 일 경우의 return 값
  return "It's false"            // [2] false 일 경우의 return 값
}

fun main() {
  val b = 1
  println(trueOrFalse(b < 3))
  println(trueOrFalse(b >= 3))
}
/* Output:
It's true!
It's false
*/