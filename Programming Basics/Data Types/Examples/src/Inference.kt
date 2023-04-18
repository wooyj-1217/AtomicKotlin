// DataTypes/Inference.kt


/**
 *
 * Inference
 *
 * - Type을 섞어 쓸 때 사용.
 * - Kotlin에서 알아서 결과값에 대한 Type 지정을 해줌.
 *
 */
fun main() {
  val n = 1 + 1.2 // Kotlin이 n에 대한 결과값에 대한 Type을 결정해줌.
  println(n)      // result type is Double!
}
/* Output:
2.2
*/