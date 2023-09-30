package KPractice.Day3.OOPs.Constructors

fun main() {
    val ob=Calculator()  // default constructor ,and it is parameterless constructor
    ob.add(3,2)
    println( ob.add(3,2))

}
class Calculator{

    fun add(a: Int , b:Int):Int{
        return  a+b
    }
    fun multiply(a: Int , b:Int):Int{
        return  a*b
    }
}