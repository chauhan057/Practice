package KPractice.Day3.OOPs.Polymorphism

//polymorphism-:
// Parent can hold a reference to its child
// Parent can call methods of child classes (which are common)
// it is run time polymorphism or inheritance concept
fun main() {
    val circle:Circle= Circle(2.0)  // or we can also write , explain in below line
    val circle1:Shape= Circle(2.0) //apply polymorphism b/c method name is same ,but we used Shape instead of Circle
    println(circle1.area())
    val square:Square= Square(3.0)
    println(circle.area())
    println(square.area())

}
open class Shape{
    open fun area(): Double {
    return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }

}