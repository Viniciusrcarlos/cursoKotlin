package Funcoes

fun ex5(str: String) {
    println(str.replace("a", "x", true).lowercase())
}

fun caracters(str: String) = str.length

fun cubo(n: Int): Int = n * n * n

fun milhasKm(milhas: Float): Float = milhas * 1.6f

fun converteAnos(anos: Int) {
    println("${anos} anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun main() {
    converteAnos(2)
    println(cubo(10))
    println(Funcoes.milhasKm(602f))
    println(caracters("Vinicius"))
    ex5("AAAAAA")
}







