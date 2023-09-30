package KPractice.Day2.Range

// step used in range
// step is used for skip the number
fun main() {

    println(" with ' step ' Keyword")
    var num2 =3
    for ( i in 0..10 step 2)
        println(" $num2 * $i = "+num2*i)
///////////////////////////////////////////
    println(" without ' step ' Keyword")

    var num =2
    for ( i in 1..10)
        println(" $num * $i = "+num*i)

}
