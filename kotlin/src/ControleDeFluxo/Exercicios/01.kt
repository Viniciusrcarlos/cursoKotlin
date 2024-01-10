package ControleDeFluxo.Exercicios

fun quadrado() {
    print("Digite um lado do quadrado: ")
    val a = readLine()
    print("Digite o outro lado do quadrado: ")
    val b = readLine()

    if (a == b) {
        println("É um quadrado")
    } else {
        println("Não é um quadrado")
    }
}

fun triangulo() {
    print("Digite o lado do triangulo: ")
    val a = readLine()
    print("Digite o lado do triangulo: ")
    val b = readLine()
    print("Digite o lado do triangulo: ")
    val c = readLine()

    if (a == b && a == c) {
        println("Triangulo equilatero.")
    } else {
        println("Triangulo não equilatero.")
    }
}



fun main() {
    triangulo()
}