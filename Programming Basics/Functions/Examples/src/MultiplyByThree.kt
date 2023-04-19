// Functions/MultiplyByThree.kt

/**
 *
 *  축약 구문(Abbreviated Syntax)
 *
 *  function이 하나의 expression일 때 사용 가능.
 *
 *      fun functionName(arg1: Type1, arg2: Type2, ...): ReturnType = expression
 *
 */


fun multiplyByThree(x: Int): Int = x * 3  // short version of saying return x * 3

fun main() {
  println(multiplyByThree(5))
}
/* Output:
15
*/