// VarAndVal/Vars.kt

/**
 *
 * Identifier(식별자)
 *
 * program의 요소를 참조하기위해 식별자를 만듬.
 * data Identifier는 프로그램 실행 중에 contents가 바뀌는지 여부에 따라 var, val로 나누어짐
 *  - var : variable(변수), 재할당 가능 ex) var identifier = initialization
 *  - val : value(값), 재할당 불가 ex) val identifier = initialization
 *
 *  식별자의 이름을 생성할 때는 소문자로 시작해야되며, 대소문자 구분된다.
 *    thisValue != thisvalue
 *
 */


fun main() {
  var whole = 11              // [1] var 이름은 whole, 11을 저장.
  var fractional = 1.4        // [2] 소수점자리 숫자를 저장
  var words = "Twas Brillig"  // [3] String(=text) 저장.
  println(whole)
  println(fractional)
  println(words)
}
/* Output:
11
1.4
Twas Brillig
*/