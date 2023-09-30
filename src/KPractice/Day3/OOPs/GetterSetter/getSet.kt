package KPractice.Day3.OOPs.GetterSetter


fun main() {
    val p1=Person("Vishal",21)
    println(p1.age)
    p1.age=23
    p1.age=-12
    println(p1.name)
    println(p1.age)
    val p2=Person("A",21)
}
class Person(nameParams:String, ageParams:Int){
// manually method to defining getter and setter
    var name:String=nameParams
        get() { //getter for name
            println("Name getter is called \n")
            return field.toUpperCase()
        }

    var age:Int =ageParams
        set(value) {      //setter for age
            if (value>0)
            {
                field=value
            }else{
                println("age setter is called \n")
                println(" Age Can't be Negative")
            }
        }
//default getter and setter for email variables
    var email:String =""
    get() = field
    set(value) {
        field=value
    }
}