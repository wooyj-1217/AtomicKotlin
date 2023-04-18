// DataTypes/StringPlusNumber.kt

/**
 *
 * Type
 *
 * 데이터를 어떻게 쓸 것인지 Kotlin에게 알려주는 것.
 *
 * 어떤 타입의 expression을 제공해줄 것인지,
 * 이 데이터가 어떤 역할을 수행할 것인지,
 * 데이터의 의미가 무엇인지,
 * 어떤 타입의 값이 저장될 수 있는지
 * 등을 정의해줌.
 *
 * type rule이 있는데, 그 rule을 어길 경우에는 error message가 나온다.
 *
 */


fun main() {
  println("Sally" + 5.9) // String + number = String
//  println("Sally" * 5.9) // String * number = Error
            // None of the following candidates is applicable because of receiver type mismatch
}
/* Output:
Sally5.9
*/