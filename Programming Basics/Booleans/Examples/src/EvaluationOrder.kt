// Booleans/EvaluationOrder.kt

/**
 *
 * Boolean은
 *
 * 복잡한 로직을 간결한 expression으로 바꿔주는 역할을 함.
 * 다만 쉽게 헷갈릴 수도 있음. 그렇기에 가독성을 위헤 명시적으로 의도를 표현해주는 것이 좋음.
 *
 * 괄호 없이는 &&이 ||보다 우선순위다.
 *
 * [1] 식과 [2] 식은 결과가 같다. &&가 우선순위이기때문에.
 * [3]은 () 때문에 결과가 다르다.
 *
 */
fun main() {
  val sunny = true
  val hoursSleep = 6
  val exercise = false
  val temp = 55

  // [1]:
  val happy1 = sunny && temp > 50 ||
    exercise && hoursSleep > 7
  println(happy1)

  // [2]:
  val sameHappy1 = (sunny && temp > 50) ||
    (exercise && hoursSleep > 7)
  println(sameHappy1)

  // [3]:
  val notSame =
    (sunny && temp > 50 || exercise) &&
      hoursSleep > 7
  println(notSame)
}
/* Output:
true
true
false
*/