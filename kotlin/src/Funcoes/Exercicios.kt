package Funcoes

fun main() {
    converteAnos(2)
}

fun converteAnos(anos: Int) {
    println("${anos} anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 12 * 31} dias")
    println("${anos * 12 * 31 * 24} horas")
    println("${anos * 12 * 31 * 24 * 60} minutos")
    println("${anos * 12 * 31 * 24 * 60 * 60} segundos")
}

