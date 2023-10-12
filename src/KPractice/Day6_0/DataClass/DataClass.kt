package KPractice.Day6_0.DataClass

fun main() {
    val p1= Person(1,"John")
    val p2= Person(1,"John")

    println(p1) // toString
    println(p2)
    println(p1.hashCode())
    println(p1==p2)  //return false
    println(p1.equals(p2)) // return true
    // use of 'copy' keyword
    val p3: Person =p1.copy()
    println(p3)
    //change the value also
    val p4: Person =p1.copy(id = 3)  //also we change the valye of any type
    println(p4)
    //ALSO WE want to set email on another



}
//class Person(val id: Int,val name:String){  //not print actual data,if I used 'data' keyword the we print actually and formatted data
data class Person(val id: Int,val name:String){

}
