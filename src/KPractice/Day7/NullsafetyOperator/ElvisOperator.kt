package KPractice.Day7.NullsafetyOperator

//elvis operator =   ?:
// also known as null collising operator


fun main() {
    val gender: String = "Male"
    val gender2: String? = null

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2  ")
        println("Line 3 $it")
    }
    val selectedValue = gender2 ?:"NA"  //agr value hai , to wo value print kreha , ohter wise 'NA' print krega


}
