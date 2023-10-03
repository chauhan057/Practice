package KPractice.Day5.ObjectKeyword.Object_Declaration


// example of singleton object
fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()

}
object SharingWidget{
    private var twitterLikes=0
    private var fbLikes=0

    fun incrementTwitterLikes()= twitterLikes++
    fun incrementFbLikes()= fbLikes++

    fun display()= println("Facebook - $fbLikes -- Twitter - $twitterLikes")
}