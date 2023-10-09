package KPractice.Day6.ENum_Classes

fun main() {
    val day = Day2.SUNDAY
    day.printFormattedDay()
    }

enum class Day2(val number:Int) {
    SUNDAY (1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7); // add ';'

    //we can also define function in enum class , but ensure that we add ';' to above line

    fun printFormattedDay(){
        println(
            "Day is $this"
        )
    }
}