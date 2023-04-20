// Booleans/Open2.kt

/**
 *
 * expression의 결과물을 val 에 담아 if 문을 조금 더 간결하게 만들 수 있다.
 *
 */


fun isOpen2(hour: Int) {
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val status = hour >= open && hour < closed
  println("Open: $status")
}

fun main() = isOpen2(6)
/* Output:
Operating hours: 9 - 20
Open: false
*/