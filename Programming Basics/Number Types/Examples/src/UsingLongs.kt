// NumberTypes/UsingLongs.kt

fun main() {
  val i = Int.MAX_VALUE
  println(0L + i + i)              // [1] Long으로 Type Cast (어느 한 쪽에만 L 붙여도 Long으로 형변환 됨)
  println(1_000_000 * 1_000_000L)  // [2] overflow prevent
}
/* Output:
4294967294
1000000000000
*/