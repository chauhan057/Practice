package KPractice.Day6.Compaion
// only one companion are allowed in a single class // it like static class in java
// companion object is basically used for factory pattern


fun main() {
//    MyClass.MyObject.f() // if you want to access f() method without Object ,so you use companion keyword
    MyClass.f()
    MyClass.AnotherObject.g()
}
class MyClass {
/*
    object MyObject{
        fun  f(){
            println("Hello I am F from object")
        }
    }
*/
   companion object MyObject{
    @JvmStatic
    fun  f(){
            println("Hello I am F from object")
        }
    }
    object AnotherObject{
        fun  g(){
            println("Hello I am G from object")
        }
    }
}