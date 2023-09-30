package KPractice.Day2.Range

// when is the replacement of the of switch case in java
//when is used instead of if else , b/c when is helpful for code readability

fun main() {
    val animals ="horse"


/*    if (animals == "horse"){
        println("this is horsesese")
    }
        else if (animals==" dogs"){
            println("this is dogs")
        }else
        {
            println(" This is nothing")
        }*/

    when(animals) {
        "dogs" -> println("this is dogs0")
        "horse" -> println("this is horse")
        else -> println("not")
    }


//another example of when with reduced form for better understanding

    val number = 17 // teen
    val result3 = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        13 -> "Thirteen"
        in 14 ..19 -> "teen"
        else -> " Nothing"
    }
    println(result3)
}