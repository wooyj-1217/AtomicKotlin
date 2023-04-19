// StringTemplates/ExpressionInTemplate.kt

/**
 *
 * ${} 을 통해서 String 안에 expression을 넣을 수 있음.
 * return값은 String으로 변환되어 결과값인 String 안에 삽입됨.
 *
 */
fun main() {
  val condition = true
  println(
    "${if (condition) 'a' else 'b'}")  // [1]
  val x = 11
  println("$x + 4 = ${x + 4}")
}
/* Output:
a
11 + 4 = 15
*/