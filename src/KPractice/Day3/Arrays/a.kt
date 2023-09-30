package KPractice.Day3.Arrays

fun main() {
    var arr= arrayOf("one","two","three","four")
    var arr1:Array<Int> = arrayOf(1,2,3,4)

    var arr2= arrayOf<Int>(3,4,5)

    for (i in arr){
        println(i)
    }
    println("\n with their index")
    for ((i ,e) in arr.withIndex()){  // i-> index   ,,,,e -> element
//        println(i.toString() +" "+ e)
//or
        println("$i - $e")
    }

    println("\n "+ arr[0])   // get the first element
    val b= arr.get(1) // another way to find index
    println("\n "+ b)

     arr.set(3,"Ten")  //set the element at desired index
    println(arr[3])

     println("\n size of the array is -: "+arr.size)

}