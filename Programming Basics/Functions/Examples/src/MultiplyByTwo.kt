// Functions/MultiplyByTwo.kt
/**
 *
 * Function
 *
 * - 이름을 가지고 있는 작은 프로그램 같은 것, 다른 function에서 이름을 부름으로써 실행될 수 있음.
 * - group of activities
 * - 프로그램을 구성하는, 재사용하는 가장 기본적인 방법
 *
                          ┌ Parameter : function에 넘겨주는 정보. identifier name(Type)을 적어주어야 함.
                          │
        fun functionName(p1: Type1, p2: Type2, ...): ReturnType {
                lines of code
            return result
        }     │
              │
              └ Keyword : function이 끝났을 때 생산해내는 결과물이 뒤에 옴.

 *
 */
fun multiplyByTwo(x: Int): Int {  // [1] 파라메터 1개 Int 타입, return 타입도 Int
  println("Inside multiplyByTwo") // [2] function Body. 마지막줄에 return 값으로 parameter 곱하기 2 결과값
  return x * 2
}

fun main() {
  val r = multiplyByTwo(5)        // [3] function을 call 해서 적절한 인자값에 할당함.
  println(r)
  // println(text:String) : Kotlin Library Function. kotlin이 제공하는 function.


}
/* Output:
Inside multiplyByTwo
10
*/