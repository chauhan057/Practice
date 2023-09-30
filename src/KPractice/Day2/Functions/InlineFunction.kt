package KPractice.Day2.Functions

fun main() {
    evenOrOdd1(4)

    val res1 =    evenOdd(45)
    println(res1)
}
fun evenOrOdd1(n: Int): String {
    val result1 = if (n%2==0) "even" else "odd"
    println(result1)
    return result1
}

//by inline function
fun evenOdd( n:Int) =if (n%2==0)" Even" else "odd"