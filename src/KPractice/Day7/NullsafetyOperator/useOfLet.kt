package KPractice.Day7.NullsafetyOperator

fun main() {
    val gender:String="Male"  //female ,others // non -nullable type
    val gender2: String? =null  //nullable type


    //let is also known as lambda
    //use of let, execut the multiple statement
    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2  ")  //gender bhi gender on=bject ko hi point krega
        println("Line 3 $it") //ye bhe gender2 object ko hi point krega, //'it' let me define hota hai ,


    gender.let {  }         //also we can with non nullable type

    }
}

