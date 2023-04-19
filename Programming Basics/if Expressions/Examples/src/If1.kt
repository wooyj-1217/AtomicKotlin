// IfExpressions/If1.kt

/**
 *
 * If
 *
 * - 선택을 만들어냄.
 * - expression을 테스트하여 true인지 false인지를 확인하고 그에 따라 action을 수행함.
 * - Boolean : True-or-False expression
 * - if( True-or-False expression only )
 *
 */


fun main() {
  if (1 > 0)
    println("It's true!") //single line일 경우엔 { } 없어도 됨
  if (10 < 11) {          //multi line일 경우에는 필수임.
    println("10 < 11")
    println("ten is less than eleven")
  }
}
/* Output:
It's true!
10 < 11
ten is less than eleven
*/