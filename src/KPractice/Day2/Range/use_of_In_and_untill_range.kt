package KPractice.Day2.Range

// 'in'  range with (.. & until )
// 1. .. -: it takes upper bound of the number      , i in 1..5 , include the 5 also
// 2. until  -: it can't take upper bound      ,1 until 5 , can't include 5

fun main() {
    //  in example
    var a=10
    if (a in 1..10)   // in with double dots(..) keyword can take the upper bound of the number
        println(a)
//    if (a in 1 until 11)
//        println(a)
    for (i in 1..5)
        println(i)

    // untill examples
    var b= 22
    if (b in 1 until  24) // in with until
        println(b)

    val result =b in 1..22   // reduced code of the above, nothing else(..)
    println(result)
    val result2 =b in 1 until 22   // reduced code of the above, nothing else( until )
    println(result2)
}