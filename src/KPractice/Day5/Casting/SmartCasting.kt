package KPractice.Day5.Casting


fun main() {
    val circle= Circle1(4.0)
    val player = Player1("Smily")

//    val arr:Array<Draggable1> = arrayOf(circle,player,Test()) // occur error by explicit type casting
//    val arr:Array<Any> = arrayOf(circle,player,Test()) //Remove error b/c Any is all class Parent class but occur eeror in run type
    //error is -: .ClassCastException: Test can't be cast to Player
    val arr:Array<Draggable1> = arrayOf(circle,player)

    for (obj: Draggable1 in arr){
        if (obj is Circle1){
            println(obj.area())
        }
        else{
            (obj as Player1).sayMyName()
        }
    }

}

interface Draggable1{
    fun drag()
}

abstract class Shape1: Draggable1 {
    abstract fun area():Double
}

class Circle1(val radius:Double): Shape1(){
    override fun area(): Double=Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")
}

class Player1(val name:String) : Draggable1 {
    override fun drag()= println("$name is dragging")
    fun sayMyName()= println("Hey my name is - $name")
}
// it's give error because it is not implemented the Draggable DefinitionOfInterface
class Test{ }