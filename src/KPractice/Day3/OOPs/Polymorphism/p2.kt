package KPractice.Day3.OOPs.Polymorphism

fun main() {

    val shape =Shape2()
    printAreas(shape)  //0.0
    val square= Square2(4.0)
    printAreas(square)



}
fun printAreas(shape2: Shape2){
    println(shape2.area())
}

open class Shape2{
    open fun area(): Double {
        return 0.0
    }
}

class Circle2(val radius:Double):Shape2(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Square2(val side:Double):Shape2(){
    override fun area(): Double {
        return side*side
    }

    //if we add new shape then no need to make a object
    class  Triangle2(val base:Double,val height:Double):Shape2(){
        override fun area(): Double {
            return 0.5*base* height
        }
    }

}