package KPractice.Day3.OOPs.Constructors

fun main() {
    var car = AutoMobile3("BMW",4,6,"petrol") // primary constructor object
    var car2 = AutoMobile3("BMW","petrol") //secondary constructor object


}

class AutoMobile3(val name:String, val tyres:Int,val maxString: Int,val engineType:String)  // primary constuctor
{
    //secondary constructor
    constructor(nameParams:String ,engineParams:String) : this(nameParams,4,5,engineParams)
    fun drive(){}
    fun applyBreak(){ }
}