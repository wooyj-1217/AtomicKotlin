// NumberTypes/LongConstants.kt



/**
 *
 * Long
 *
 * between -2의 63승 and +2의 63승 -1
 * 숫자 뒤에 L을 붙이면 Type이 Long 이 됨.
 *
 */


fun main() {
  val i = 0          // Infers Int
  val l1 = 0L        // L creates Long
  val l2: Long = 0   // Explicit type
  println("$l1 $l2")
}
/* Output:
0 0
*/