package KPractice.Day2.Functions

fun main() {
    //normal args
    println(sub(3, 1))

    //named args
    println( sub(a = 8, b = 4))  //ordering can be changed in this named args

    //function can be stored in a variable
    var fn = ::addition
    println(fn(4,6))

    println(  sub(8.0, 1.0,2))

}

fun addition (a:Int,b:Int):Int{
    return a+b
}
fun sub(a:Int, b: Int): Int {
    return a-b
}
fun sub(a:Double, b: Double): Double {
    return a-b
}
fun sub(a:Double, b: Double,c :Int): Double {
    return a+b-c
}

