package ControleDeFluxo.Exercicios.While


fun ex1() {
    val caixa = 2000
    val balao = 7
    var soma = 0
    var contador = 0

    while (soma <= 2000) {
        soma += balao
        contador++

        if (soma > caixa) {
            soma -= 7
            contador--
            break
        }

    }

    println(contador)
}

fun ex2() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun ex3(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun ex4(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
    }
    return false
}


fun main() {
    ex4("xxooox")
}