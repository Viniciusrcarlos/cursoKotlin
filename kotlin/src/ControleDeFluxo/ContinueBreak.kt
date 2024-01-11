package ControleDeFluxo

fun main() {

    var i = 0
    while (i < 100000000) {

        if (i == 10) {
            break
        }

        print("$i ")
        i++

    }

    println()

    var j = 0
    while (j < 50) {
        if (j < 20) {
            j++
            continue
        }

        print("$j ")
        j++
    }
}