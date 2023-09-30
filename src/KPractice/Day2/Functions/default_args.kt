package KPractice.Day2.Functions

fun main() {

    //default args
    println("\n + default args")
    message()
    //params args
    println("\n + parameterized args")
    message(4)  // passed value is args

}
fun message(count :Int = 2)  //count is known as params ,  count can't be reasigned b/c it is val type
{
    for (i in 1..count) {
        println(" Hello $i")
    }

}