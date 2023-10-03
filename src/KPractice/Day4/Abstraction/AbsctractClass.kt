package KPractice.Day4.Abstraction

//Abstract
// class can't be instantiated
//abstract class can have both abstact and non-abstract properties and method
//if a class has abstract method or property then class must be declared as abstract

fun main() {
    val circle= Circle(2.0)
    println(circle.area())
    circle.display()
//    println(circle.display())
}

// class can't be instantiated
// is class ka koi object nhi bana skta ,ya can't be used or can't be inherite to its methods
abstract class A{
    fun method1(){
        println("I am a method")
    }
}

abstract class Shape{

    abstract fun area():Double
    abstract fun display()
}

class Circle(val radius:Double): Shape(){
    override fun area(): Double =Math.PI*radius*radius
    override fun display(){
        println("Circle is getting displayed")
    }


}