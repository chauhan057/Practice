package KPractice.Day4.Interfaces


fun main() {

    dragObjects(arrayOf(Circle(4.0),Square(4.0),Triangle(2.0,4.0),Player("Vishal")))
}

//fun dragObjects(objects:Array<Shape>){
fun dragObjects(objects:Array<Draggable>){
    for (obj:Draggable in objects ){
        obj.drag()
    }
}
//DefinitionOfInterface, its method is by default abstract\
interface Draggable{
    fun drag()
}
//parent class in inheritated by Draggable DefinitionOfInterface
abstract class Shape: Draggable{
    abstract fun area():Double
//    abstract fun drag()

}
class Circle(val radius:Double):Shape(){
    override fun area(): Double=Math.PI*radius*radius
    override fun drag() = println("Circle is draging")
}
class Square(val side:Double): Shape(){
    override fun area(): Double =side*side
    override fun drag() = println("Square is draging")
}
class Triangle(val base:Double,val height :Double):Shape(){
    override fun area(): Double =0.5*base*height
    override fun drag() = println("Triangle is draging")

}

//inheritence by DefinitionOfInterface
class Player(val name:String):Draggable{
    override fun drag()= println("$name is dragging")
}