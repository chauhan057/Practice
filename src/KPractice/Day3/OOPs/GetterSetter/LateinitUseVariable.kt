package KPractice.Day3.OOPs.GetterSetter


//use of lateinit keyword
// ye 'val' type ki nhi ho skti ,ye 'var' honi chahiye
// inko hm int,float,boolean,etc define nhi kr skte
// iska use hm bad me value assign krne ke liye krte hai
// it is reduce the run time error
fun main() {
    val ob=Calculator()  // default constructor ,and it is parameterless constructor
    ob.add(3,2)
    println( ob.add(3,2))

}
class Calculator{

//    var mesage:String         //occures error
    lateinit var message:String   //message are assigned further

    fun add(a: Int , b:Int):Int{
        return  a+b
    }
    fun multiply(a: Int , b:Int):Int{
        return  a*b
    }
}