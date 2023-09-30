package KPractice.Day3.OOPs.ClassesAndObjects

fun main() {
    val  mustang = Car("mustang", "petrol",1000)
    val beetle = Car ( "beetle", "desiel",2000)

    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)

    println(beetle.name)
    beetle.driveCar()
}
class Car(val  name: String,val type:String,var kmRan:Int){  //properties

    fun driveCar(){ //methods or functions
        println("$name car is driving")
    }
//short way
    fun applyBreak() =" Applied Break"
}