// DataTypes/Types.kt

/**
 *
 * Type Inference
 * - var & val에서 굳이 type을 지정하지 않아도 알아서 Kotlin이 추론해주는 것.
 *
 * - var & val에서도 type을 지정해줄 수 있음.
 *
 *      val identifier: Type = initialization
 *
 *
 */
fun main() {
  val whole: Int = 11              // [1] Type : Integer, 모든 numbers를 가질 수 있음
  val fractional: Double = 1.4     // [2] Type : Double, 모든 소수점자리를 가질 수 있음
  val trueOrFalse: Boolean = true  // [3] Type : Boolean, true or false 를 가질 수 있음
  val words: String = "A value"    // [4] Type : String, Char의 집합을 가질 수 있음. " "으로 할당할 수 있음.
  val character: Char = 'z'        // [5] Type : Char, 한 글자만 가질 수 있음
  val lines: String = """Triple quotes let
you have many lines
in your string"""                  // [6] Triple-Double-Quotes, 많은 라인, 혹은 특수문자 할당할 때. """ """
  println(whole)
  println(fractional)
  println(trueOrFalse)
  println(words)
  println(character)
  println(lines)
}
/* Output:
11
1.4
true
A value
z
Triple quotes let
you have many lines
in your string
*/