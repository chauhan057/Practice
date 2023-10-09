package KPractice.Day6.ENum_Classes

fun main() {
    val day = Day1.SUNDAY
    println(day)
    println(day.number)

    for (i in Day1.values()){
        println(i)
//        print(i)
//        println("... "+i.number)


    }
}
//also make paramaterized constructor by using enum key
enum class Day1(val number:Int) {
    SUNDAY (1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}