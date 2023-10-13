package KPractice.Day8.Collection.List

fun main() {

    val num = mutableListOf(1,2,3,4)
    println(num)
  num.add(2,6)
    println(num)
    println(num.contains(3))
    println(num.remove(3))

    val list = listOf(11,22)
    num.addAll(list)    //merge to list
    println(num)


}