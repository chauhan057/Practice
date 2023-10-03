package KPractice.Day5.ObjectKeyword.Object_Expression

fun main() {
/*//    var testObj= object { }   //this is object expression
    var testObj= object {
        val x: Int=10
        fun method(){
            println("I am object expression")
        }
    }
    println(testObj.method())*/

/*    //now the use of ObjectExcepression

    var obj =object :Cloneable{
        override fun clone() {
            println("I am clone")
        }
    }
    obj.clone()   //I am clone*/

    //now for class
    var obj2=object :Person("Vishal"){
        override fun fullName() {
            super.fullName()
            println("Anonymous - $name")
        }
    }
    obj2.fullName()
}
/*interface Cloneable{
    fun clone()
}*/

//also we can do same a class
open class Person(val name:String){
    open fun fullName() = println("Full Name - $name")
}