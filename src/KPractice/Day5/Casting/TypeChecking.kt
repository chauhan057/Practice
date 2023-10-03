package KPractice.Day5.Casting

// 'is' operator is used for typeChecking
// it is checkong on run time

fun main() {
    val circle= Circle(4.0)
    val player = Player("Smily")

    if (circle is Circle)
    {
        println("This is circle")   //Circle is also Shape,so circle is Shape =true
    }
  /*  if (circle is Player) {
        println("This is circle")   //it's give error it is not theri type
    }*/
}

interface Draggable{
    fun drag()
}

abstract class Shape: Draggable {
    abstract fun area():Double
}

class Circle(val radius:Double): Shape(){
    override fun area(): Double=Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")
}

class Player(val name:String) : Draggable {
    override fun drag()= println("$name is dragging")
    fun sayMyName()= println("Hey my name is $name")
}