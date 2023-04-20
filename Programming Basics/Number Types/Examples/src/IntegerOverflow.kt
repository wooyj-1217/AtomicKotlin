// NumberTypes/IntegerOverflow.kt

/**
 *
 * Int의 값 제한
 *
 * between -2의 31승 and +2의 31승-1
 * a constraint of the Int 32-bit representation.
 * 넘어가면 overflow
 *
 */


fun main() {
  val i: Int = Int.MAX_VALUE //Int.MAX_VALUE => Largest number of Int
  println(i + i)
}
/* Output:
-2
*/