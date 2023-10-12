package KPractice.Day6_1

fun main() {
    
    println(EnumByAaditya.DIAMOND)
    println(EnumByAaditya.DIAMOND.name)
    println(EnumByAaditya.DIAMOND.ordinal)

    var array: Array<EnumByAaditya> =EnumByAaditya.values()
    array.forEach { it }

    var check =EnumByAaditya.valueOf("GOLD")
    println(check)
}

enum class EnumByAaditya {
    SILVER,
    GOLD,
    PLATINUM,
    DIAMOND
}