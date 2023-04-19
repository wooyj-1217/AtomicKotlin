// StringTemplates/TripleQuotes.kt

/**
 *
 * " <- 를 String 내에 넣어야 될 때 '\' 을 앞에 넣거나 """(Triple Quotes)로 처리.
 *
 */
fun main() {
  val s = "value"
  println("s = \"$s\".")
  println("""s = "$s".""")
}
/* Output:
s = "value".
s = "value".
*/