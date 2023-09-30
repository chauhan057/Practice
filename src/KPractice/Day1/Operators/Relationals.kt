package KPractice.Day1.Operators


//
//  >  -Greater Than
//  <  -less Than
//  >=
//  <=
//  ==
//  !=
fun main() {
    var i =1
    var j =2
    println(i>j)   // 1> 2 false
    println(i<j)    //1<2 true
    println(i>=j)
    println(i>=j)
    println(i==j)
    println(i!=j)
    print("\n")

    // pre & post Increment
    // i++
    // ++i
    //similarly , decrement Operator
    // i--
    // --i

    i=10
    println(i++ + ++i) // 10 + 12 =22
     i =21
    println(i++)
    i =31
    println(++i)
    i =41
    println(i--)
    i =51
    println(--i)

}