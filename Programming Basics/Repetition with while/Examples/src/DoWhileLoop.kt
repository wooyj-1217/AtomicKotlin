// RepetitionWithWhile/DoWhileLoop.kt


/**

    Do While 문

    do {
      반복되어야 하는 코드가 위치하는 곳
    } while (Boolean-expression)

   while과의 차이점.
    - do While 의 경우 무조건 한번은 실행됨. 시작부터 false일 때도 무조건.

 */


fun main() {
  var i = 0
  do {
    print(".")
    i += 10
  } while (condition(i))
}
/* Output:
..........
*/