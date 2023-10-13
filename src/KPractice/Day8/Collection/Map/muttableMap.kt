package KPractice.Day8.Collection.Map

fun main() {
    val students = mutableMapOf<Int,String>()
    students.put(1,"Vishal")
    students.put(2,"Ravi")
    students.put(3,"Kriti")

    println(students.get(1)) // Vishal
    println(students.get(11)) //null

    for ((key,value) in students){
        println("$key  -  $value")
    }

    students[8] = "Amit"
    println(students[8])

}