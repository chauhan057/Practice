package KPractice.Day8.Collection.Map

fun main() {
    val student= mapOf<Int,String>(1 to "vishal", 2 to "ji",3 to "app  hai")
//    student.put(1,"Bishal") //we can't  add by 'add' method,
                            // we need to 'to' operator
    println(student)
}