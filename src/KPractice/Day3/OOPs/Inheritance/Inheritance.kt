package KPractice.Day3.OOPs.Inheritance

// open keyword is used for inheritance

// inheritence is also known as 'IS A' Relationship
//ex
//Car is a Vehicle, Truck is a vehicle
// Square is a Shape,Circle is a Shape
//Cat is an Animal ,Dog is an Animal
//Saving Account ,Current Account
//FullTime Employee, PartTime Employee
//etc

// it can support only single king inheritance not support multiple kind inheritance.......................

fun main() {
     val obChild= Child()
    obChild.myMethod()
    obChild.myMethod2()

}
open class Parent{
    init {
        println("\n  Parent's Constructor is called first")
    }
    val name:String=" "
    fun myMethod(){
        println("I am in Parent")
    }
}
//class  Child: Parent(),Phone(){   // multiple inheritance is not supported
class  Child: Parent(){
    init {
        println(" Child's Constructor Called ")
    }
    fun myMethod2(){
        println("I am in Child")
    }
}