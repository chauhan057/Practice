package KPractice.Day7.ExceptionHandling
  //try not be single , it always come with catch or finally
// catch can come more than one time for different data handling, but base exception is always botton of all catch block
import java.lang.NullPointerException

fun main() {

    val array = arrayOf(1,3,4)

   try {
       println(array[6])
   }
   catch (ex:NullPointerException){  //more than one
       println("this is null pointer exception")
   }
   catch (exx:ArrayIndexOutOfBoundsException){
       println("array inxed out of bound")
   }

   catch (e:Exception){  //base catch always bottom of all catch
       println("please provide correct array index")
   }
    finally {
        println("This is finally block")
    }
}
