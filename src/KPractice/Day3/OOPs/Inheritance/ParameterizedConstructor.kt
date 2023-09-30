package KPractice.Day3.OOPs.Inheritance


fun main() {
    val mob = OnePlus1("Smart Phones")  // child class object
    mob.display()
    println( mob.size)

    val parent =Mobile1("General")   // parent class object
    parent.display()
    println(parent.size)
}
open class Mobile1(val type:String){
    val name:String=" "
    open  val size : Int =9
    fun makeCall()= println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open  fun display() = println("Simpe Mobile Display")
}

//class OnePlus1: Mobile1("Smart Phone"){     //hard coded parameter passed
class OnePlus1(typeParams: String): Mobile1(typeParams){
    override val size:Int=10
    override  fun display()= println("One Plus Display")
}