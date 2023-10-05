package KPractice.Day6_1

fun main(args: Array<String>) {
    var obj= LazyImplementation()
    obj.printMethod()
}
class LazyImplementation {
    val a: Int=15 // memory allocated
    val b: Int by lazy { //memory not allocated
        20
    }
    fun printMethod(){
        println("Hello b=${b+a}")
    }



}