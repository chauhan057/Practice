package KPractice.Day6.ENum_Classes
// enum class have set of instance value like  SUNDAY, MONDAY, TUESDAY....etc  ,they cant be modify or changed

fun main() {
    val day = Day.SUNDAY
    println(day)
}
enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}