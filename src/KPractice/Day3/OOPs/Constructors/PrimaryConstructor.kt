package KPractice.Day3.OOPs.Constructors

fun main() {
var car = AutoMobiles("Car",4,6)
    var tempo= AutoMobiles("Tempo",3,12)
    println(tempo.name)

}
// this is primary constructor

class AutoMobiles(val name:String, val tyres:Int,val maxString: Int)
{
    fun drive(){ }
    fun applyBreak(){ }
}
