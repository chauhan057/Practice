package KPractice.Day3.OOPs.Constructors




fun main() {
    var car = AutoMobile("BMW",4,6,true)  // primary+ secondary constuctor object
    println(car.name)
    println(car.airBags)
    var person=Person()                            //empty constructor object
    println(person.age) //0
    println(person.name) // " "



    var per2 = Person2("vishal",23)  // Secondary constructor object
    println(per2.age1)  // 23
    println(per2.name1)  // vishal

    // println(per2)  //its print the addresses only not actua value
}
                                                        // this is primary + Secondary constructor
class AutoMobile(val name:String, val tyres:Int,val maxString: Int,hasAirBags:Boolean) {
    val airBags =hasAirBags  // properties
    fun drive(){ }
    fun applyBreak(){ }
}
                                                        // this is secondary constructor ,since it is not used val , or var keyword for defining the datatype
class Person2(name:String,age :Int){
//    val name2=name
//    val age2 =age
                //also we print additional message by using secondary constructor
    val name1="$name - JI"
    val age1 ="$age - age hai"
    val canVote =age>18 //also make proverties
}
                                //this is default but empty constructor
class Person(){
    val name: String = ""
    var age:Int = 0
}

class  Empty{}                  // this is empty class






