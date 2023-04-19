// IfExpressions/OneOrTheOther.kt

/**
 *
 * result를 Expression으로 쓰는 예시
 *
 * - result of expression == result of function일 때 oneOrTheOther(exp: Boolean)와 같이 쓸 수 있다.
 * - if expression이 곧 function body가 되는 셈.
 *
 */

fun oneOrTheOther(exp: Boolean): String =
  if (exp)
    "True!" // No 'return' necessary
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))
  println(oneOrTheOther(x == 2))
}
/* Output:
True!
False
*/