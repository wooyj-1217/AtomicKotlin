// Booleans/Closed.kt

/**
 *
 * or에 대한 예시.
 * 왼쪽, 오른쪽 중 하나라도 true면 결과물도 true
 *
 */

fun isClosed(hour: Int) {
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val status = hour < open || hour >= closed
  println("Closed: $status")
}

fun main() = isClosed(6)
/* Output:
Operating hours: 9 - 20
Closed: true
*/