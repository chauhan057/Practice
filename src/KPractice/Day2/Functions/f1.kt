package KPractice.Day2.Functions

fun main() {
  val result =  add( 1,2)
    println(result)
    evenOrOdd(3)
}

fun evenOrOdd(n: Int): String {
    val result = if (n%2==0) "even" else "odd"
    println(result)
    return result
}
fun add(num1: Int, num2: Int): Int
{
   var sum =num1+num2
   return sum
}
