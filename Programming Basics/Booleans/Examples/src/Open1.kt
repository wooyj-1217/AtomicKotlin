// Booleans/Open1.kt

/**
 *
 * Booleans
 *
 * &&(and) : 왼쪽, 오른쪽 Boolean expression이 모두 true일 때
 * ||(or) : 왼쪽, 오른쪽 Boolean expression 중 하나라도 true일 때
 *
 *
 */
fun isOpen1(hour: Int) {
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val status =
    if (hour >= open && hour < closed) // [1] 운영시간 내의 시간인지 체크하는 용도로 &&를 사용.
      true
    else
      false
  println("Open: $status")
}

fun main() = isOpen1(6)
/* Output:
Operating hours: 9 - 20
Open: false
*/