package KPractice.Day3.OOPs.Polymorphism


// pros of polymorphism

//Helps to write maintatainable & Extensible Code
// helps in interacting with objects via common DefinitionOfInterface


fun main() {
   // val circle:Circle1= Circle1(2.0)  // or we can also write , explain in below line
    val circle2:Shape1= Circle1(2.0) //apply polymorphism b/c method name is same ,but we used Shape instead of Circle
//    println(circle2.area())
    val square:Square1= Square1(3.0)
//    println(circle.area())
//    println(square.area())

                                    //see how type inference is working as i add deiiference shapes
    val shapes:Array<Shape1> = arrayOf(Circle1(3.0), Circle1(4.0),Square1(5.0),
        Square1.Triangle1(3.0, 4.0)
    )
    calculateAreas(shapes)
}
//pros
fun calculateAreas(shapes: Array<Shape1>){
    for (shape in shapes){
        println(shape.area())
    }
}


open class Shape1{
    open fun area(): Double {
        return 0.0
    }
}

class Circle1(val radius:Double):Shape1(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Square1(val side:Double):Shape1(){
    override fun area(): Double {
        return side*side
    }

    //if we add new shape then no need to make a object
    class  Triangle1(val base:Double,val height:Double):Shape1(){
        override fun area(): Double {
            return 0.5*base* height
        }
    }

}