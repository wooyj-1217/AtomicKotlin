// IfExpressions/If3.kt

/**
 *
 * else Keyword
 *
 * - True 일 경우와 false일 경우 둘 다 다룰 때 사용.
 * - if와 함께일 경우에만 사용가능.
 *
 */

fun main() {
  val n: Int = -11
  if (n > 0)
    println("It's positive")
  else
    println("It's negative or zero")
}
/* Output:
It's negative or zero
*/