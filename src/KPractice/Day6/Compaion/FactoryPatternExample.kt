package KPractice.Day6.Compaion

fun main() {
    val pizza1: Pizza =Pizza.Factory.create("Peppy Paneer")
    println(pizza1)

    //here i am calling via factory reference -don't want to use factory ref
    //now after defining that as compainon
    var pizza2:Pizza = Pizza.create("Tomato")
    println(pizza2)

    // one more thing we can do -We want everyone to call this create method if they wnat pizza
    //for that we will mark the constructor as private

//    var pizza3:Pizza =Pizza()  //Now  everyone needs to call create method
    //i.e. everyone has to call its factory


}

class Pizza(val type:String ,val toppings:String) {
//class Pizza private constructor(val type:String ,val toppings:String) { //for pizza3
//    object  Factory{  // this is my factory object // for pizza1
   companion object  Factory{  // this is my factory object // for pizza2
        fun create(pizzaType:String) :Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza ("Tomato","Tomato Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm", "Paneer,Cheese Burst, Tomato,Onion")
                else -> Pizza("Baisic","Onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', toppings='$toppings')"
    }

}