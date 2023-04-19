// StringTemplates/StringTemplates.kt

/**
 *
 * String Templates
 *
 * - String을 생성하는 프로그램 방식
 * - identifier 앞에 $를 붙이면 String Template은 그 identifier의 값을 String에 넣음
 *
 */

fun main() {
  val answer = 42
  println("Found $answer!")     // [1] $answer는 identifier answer의 값이 대체함.
  println("printing a $1")      // [2] $뒤의 값이 identifier가 아닐때는 아무 일도 발생하지 않음.
}
/* Output:
Found 42!
printing a $1
*/