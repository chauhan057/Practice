package KPractice.Day6.Sealed_Classes

//data can be modified ,means type can be changed as our requirement
fun main() {

    val tile:Red = Red("Mashroom",25)
    val tile2 = Red("Fire",30)
    println("${tile.type }....${tile.point}")
}
sealed class Tile
class  Red(val type:String,val point:Int): Tile()
class  Blue(val point: Int): Tile()
