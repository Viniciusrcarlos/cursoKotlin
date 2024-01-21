package ControleDeFluxo.Exercicios.For

fun printEscada(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun main() {

    printEscada(4)

}