package KPractice.Day3.OOPs.Constructors


fun main() {

    var obj=PrimaryConstructorVerma("Aaditya")
    obj.printMethod()
}
class PrimaryConstructorVerma(name: String) {

    fun printMethod(){
        println("method block called....")

    }
    init {
        println("init block called....")
    }

}