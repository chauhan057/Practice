package KPractice.Day3.OOPs.Constructors

// init {...}  -: this block is helpful for message showing

fun main() {
    var car = AutoMobile2("BMW",4,6)  // primary+ secondary constuctor object


}
// this is primary + Secondary constructor
class AutoMobile2(val name:String, val tyres:Int,val maxString: Int) {
    init {
        println(" 1st initializer block")
    }
    fun drive(){ }
    init {
        println("2nd initializer block")
    }
    fun applyBreak(){ }
}