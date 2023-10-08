package KPractice.Day5.ObjectKeyword.Object_Declaration

fun main() {
  println(A.num)
    B.test()
//  println(B.test())
}

object A{
    init { //use of init block
        println("This is init block A")
    }
    val num: Int=10
}
object B:Aaditya(){
    val p:Int=20


    fun test(){
        println( "I am the Object of B")
        super.methodOne()
    }
}
open class Aaditya{
    init {
        println("Aaditya's init block...")
    }
    open fun methodOne()
    {
        println("Aaditya's method...")
    }
    companion object{
        init {

        }
    }
}
