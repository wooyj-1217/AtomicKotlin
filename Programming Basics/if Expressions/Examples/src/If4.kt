// IfExpressions/If4.kt

/**
 *
 * if와 else를 여러번 사용하는 예시

                if()
                else if()
                else if()
                  ...
                else

      코드가 복잡해지면 가독성이 떨어짐.
      후에 나올 When Expression을 사용하는 것이 좋다.
 */
fun main() {
  val n: Int = -11
  if (n > 0)
    println("It's positive")
  else if (n == 0)
    println("It's zero")
  else
    println("It's negative")
}
/* Output:
It's negative
*/