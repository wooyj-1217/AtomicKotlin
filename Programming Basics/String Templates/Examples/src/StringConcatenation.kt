// StringTemplates/StringConcatenation.kt

/**
 *
 * String들의 연결을 '+'로 할 수 있음
 *
 */
fun main() {
  val s = "hi\n" // \n is a newline character
  val n = 11
  val d = 3.14
  println("first: " + s + "second: " +
    n + ", third: " + d)
}
/* Output:
first: hi
second: 11, third: 3.14
*/