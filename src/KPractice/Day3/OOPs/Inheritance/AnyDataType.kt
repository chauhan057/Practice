package KPractice.Day3.OOPs.Inheritance

// use of 'any' dataType
// in kotlin ,all classes has super/parent class by default , jiska data type 'Any' hoti hai
// like ,,,,,,    Any-> Mobile -> One Plus      (so any is parent class of mobile by default)

fun main() {
    val mob = OnePlus2("Smart Phones")  // child class object
    mob.display()
    println( mob.size)

   println(mob.toString())
}
open class Mobile2(val type:String){
  open val name:String=" "
    open  val size : Int =9
    fun makeCall()= println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open  fun display() = println("Simpe Mobile Display")
}

class OnePlus2(typeParams: String): Mobile2(typeParams){
    override val name: String = "Oppo "
    override val size:Int=10
    override  fun display()= println("One Plus Display")
    override fun toString(): String {
//        return super.toString()

        return "name -$name size -$size "
    }
}