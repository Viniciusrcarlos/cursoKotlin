package ControleDeFluxo.Exercicios

fun main() {
    val a = readLine()
    val b = readLine()
    val c = readLine()

    if (a != null && a != "") {
        a.toInt()
    }
    if (b != null && b != "") {
        b.toInt()
    }
    if (c != null && c != "") {
        c.toInt()
    }

    if (a == b && a == c) {
        println("Triangulo equilatero.")
    } else {
        println("Não é um triangulo equilatero.")
    }
}