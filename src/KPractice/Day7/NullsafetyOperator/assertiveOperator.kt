package KPractice.Day7.NullsafetyOperator


fun main() {
    val gender: String = "Male"
    val gender2: String? = null

    gender2?.toUpperCase()  // (?.) -"safe call operator" -: isme agr value null hai execute nhi hoga
    gender2!!.toUpperCase() // (!!) -"asserted operator"  -: isme agr value null hai to to ye execute hoga aur error bhi show krega


}
