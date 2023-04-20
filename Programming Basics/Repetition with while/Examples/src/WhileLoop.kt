// RepetitionWithWhile/WhileLoop.kt

/**
 *
 * While keyword
 *
 * 반복작업을 위해서 쓰는 가장 기본 형태
 * Boolean 값이 true가 될 때까지 반복됨.
 *
 */


fun condition(i: Int) = i < 100  // [1] 비교식 < 이 boolean 결과값을 가져옴.

fun main() {
  var i = 0
  while (condition(i)) {         // [2] condition(i) function의 result 값이 true가 될 때 까지 안의 블록을 반복.
    print(".")
    i += 10                      // [3] 10을 더하고 i에 재할당 한다는 뜻. i = i + 10 과 동일한 코드다.
  }
}
/* Output:
..........
*/