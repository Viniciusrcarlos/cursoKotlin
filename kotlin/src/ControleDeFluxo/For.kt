package ControleDeFluxo

fun main() {

    for (i in 1..10) {
        print("$i ")
    }

    println()

    // mostra todos os numeros pares de 0 a 20
    for (i in 0..20 step 2) {
        print("$i ")
    }

    println()

    val str = "Kotlin é show!"
    for (char in str) {
        print(char)
    }

    println()

    for (j in 20 downTo 0 step 3) {
        print("$j ")
    }

}