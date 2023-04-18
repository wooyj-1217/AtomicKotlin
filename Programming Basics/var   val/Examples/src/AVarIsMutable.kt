// VarAndVal/AVarIsMutable.kt

/**
 *
 * var identifier로 정의되었을 경우 값이 변할 수 있다.
 *
 * 값이 변하는 것을 표현할 때에는 var를 사용하는 것이 유용하다.
 * 프로그램의 복잡도가 증가할 때 코드를 좀 더 깔끔하고 안전하고 쉽게 이해할 수 있도록 작성하려면
 * identifier로 이 값이 변하는지 아닌지를 확실하게 보여주는 것이 좋다.
 *
 */


fun main() {
  var sum = 1
  sum = sum + 2
  sum += 3
  println(sum)
}
/* Output:
6
*/