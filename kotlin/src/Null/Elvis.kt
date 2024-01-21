package Null

fun main() {

    val str: String? = null

    if (str == null) {
        println("Nulo")
    } else {
        println(str)
    }

    println(str?: "oi")

}