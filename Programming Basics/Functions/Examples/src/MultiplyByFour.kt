// Functions/MultiplyByFour.kt


/**
 *
 * Function이 하는 activity를 잘 설명하는 이름을 선택하는 것이 중요.
 *  - 코드 읽기 쉬워짐 + 코드 위에 주석을 줄여줌.
 *
 */


fun multiplyByFour(x: Int) = x * 4 // 이 경우에는 returnType을 생략할 수 있다.

fun main() {
  val result: Int = multiplyByFour(5)
  println(result)
}
/* Output:
20
*/