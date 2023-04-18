// VarAndVal/Vals.kt

/**
 *
 * val은 재할당이 되지 않는다.
 *
 * 하는 역할에 맞게 잘 묘사해서 이름을 짓는 것은 코드를 이해하기 쉽게 만들고 주석을 다는 것을 줄여줌.
 *
 */


fun main() {
  val whole = 11
  // whole = 15 // Error   // [1]
  val fractional = 1.4
  val words = "Twas Brillig"
  println(whole)
  println(fractional)
  println(words)
}
/* Output:
11
1.4
Twas Brillig
*/

/**
 *
 * var는 데이터가 무조건 바뀔때는 매우 유용하게 쓰임. 하지만 실제로 쓰일때는 좀 피하는것이 좋다.
 * 보통 프로그램은 val을 쓸 때 확장, 또는 유지가 쉽다.
 * 하지만 가끔은 val만 이용해서 코드를 풀어나가기에 너무 복잡해 질 수도 있다.
 * 그럴 때를 위해 Kotlin은 var의 유연함을 제공한다.
 * 다만 val을 사용하면 할 수록 프로그램을 더 안전하게 만들려면 var가 거의 필요없다는 사실을 알게 됨.
 *
 */