// Functions/SayHello.kt

/**
 *
 * return 값이 없을 때 Unit
 *
 * Unit은 쓰지않아도 Kotlin이 처리해줌.
 *
 */

fun sayHello() {
  println("Hallo!")
}

fun sayGoodbye(): Unit {
  println("Auf Wiedersehen!")
}

fun main() {
  sayHello()
  sayGoodbye()
}
/* Output:
Hallo!
Auf Wiedersehen!
*/