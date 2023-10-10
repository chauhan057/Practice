package KPractice.Day7.ExceptionHandling

import java.util.concurrent.CountDownLatch

fun main() {
createUserList(5)
createUserList(-2)
}
fun createUserList(count:Int){

    if (count<0)
    {
        try {
            println("       $count is not allowed ")
        }
        catch (e: Exception){

        }
    }
    else{
        println("this is $count")
    }
}
