package KPractice.Day6.Sealed_Classes

fun main() {

    val tile1: Tile1 = Red1("Mashroom",25)
//    val points:Int = when (tile1) { } //this occur error because it has fixed variation, either red or blue
  val points:Int = when (tile1) {
      is Blue1 ->tile1.point1*3
      is Red1 -> tile1.point1*2
  }
    println(points)
}
sealed class Tile1
class  Red1(val type1:String,val point1:Int): Tile1()
class  Blue1(val point1: Int): Tile1()