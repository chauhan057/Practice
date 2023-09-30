package KPractice.Day2.Loops

fun main() {
    for (i in 1 .. 5)
        println(i)

    println("\n Time Table \n")
    val num = 2
    for (i in 1..10){
        //2 x 1= 2
        //2 x 2 =4
        //        println(num.toString() +" x "+i + " = "+(num*i) )  //use .toString for int to String b/c when we in println then it is the first priority to to make num variable in String
        //string Templeting
        println( "$num x $i ="+(num*i))  // or  $ -: is a string templating

    }
}