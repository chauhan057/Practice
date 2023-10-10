package KPractice.Day7.NullsafetyOperator

//null value is a type of error ,that is handle by using null safety operator
//jb bhi hm kisi datatype ke bad ? ,to wo data nullable type datatype ho jayega
// nullable type means value ke sath -2 null bhi accept kr lega

fun main() {

//    val name:String =null  // it occur error
    val name: String? =null   // remove error  by using null safety operator
    val drive:Boolean? =true  // it can also uses the safety operator with values or null

    val gender:String="Male"  //female ,others // non -nullable type
    val gender2: String? =null  //nullable type

//    gender2.toUpperCase() // it occure error
    if (gender2 != null) {        //resolve by using sorrounding block
       println( gender2.toUpperCase()) //not executed      // this is first way to perform operation, jisme hm 'if' ko bar-2 use na krna pade
    }
//safe call operator-: isme ye check krta hai ki agar ye objec null hoga to nhi call krega, other wise object(toUpperCase()) call krega

    println(gender2?.toUpperCase())  //print "null"   //this is sencond way to perform operator , jaha hm 'if' bar -2 nhi use kr rhe hai,






}
