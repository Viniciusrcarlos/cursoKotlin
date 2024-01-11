package ControleDeFluxo

fun main() {

    // Faca enquanto

    var i = 0
    do {
        print("$i ")
        i++
    } while (i < 10)


    // enquanto o nome não for escrito, ele repete
    do {
        print("Informe seu nome: ")
        val value = readLine()
    } while (value == "")

}