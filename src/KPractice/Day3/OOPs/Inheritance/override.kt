package KPractice.Day3.OOPs.Inheritance


// overide ka use
// jis properties or method ko override krna hai ,uske aage 'open' eyword
// jaha kr rhe hai waha ,'oveeride' keyword laga denge
//also we can override the getter and setter

fun main() {
   val mob = OnePlus()  // child class object
   mob.display()
    println( mob.size)

    val parent =Mobile()   // parent class object
    parent.display()
    println(parent.size)
}
 open class Mobile{
    val name:String=" "
  open  val size : Int =5
    fun makeCall()= println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
  open  fun display() = println("Simpe Mobile Display")
}
class OnePlus: Mobile(){
    override val size:Int=6
//  override  fun display()= println("One Plus Display")
    override fun display() {              //now we can call also super class method
    super.display()
        println("One plus Display")
    }
}