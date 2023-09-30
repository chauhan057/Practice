package KPractice.Day3.OOPs.ClassesAndObjects

fun main() {
    var i :Int =20
    println(i.plus(30))
    println(i.toFloat())
    i=65
    println(i.toChar())

    val pr = Person("A",21)
    val pr2 = Person("B",17)
    println(pr.canVote()) // true
    println(pr2.canVote()) //false
    pr.age=16
    println(pr.canVote())  //false

}
class Person(val name: String, var age:Int ){
    //methods
    fun canVote():Boolean{
        return age>18
    }
}