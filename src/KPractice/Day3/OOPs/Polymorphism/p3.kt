package KPractice.Day3.OOPs.Polymorphism

// method calling
//Circle3 -> Shape3-> Any    (Any is default and parent class of all classes)

fun main() {
    val circle=Circle3(4.0)
    println(circle.toString())

}
open class Shape3{
    open fun area(): Double =0.0
    override fun toString(): String {
        return " I am a shape but of Any Class"
    }
}

class Circle3(val radius:Double):Shape3(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}