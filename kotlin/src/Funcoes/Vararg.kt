package Funcoes

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }

    return (soma/notas.size)
}

fun <T> media2(vararg notas: T) {
    
}


fun main() {
    println(media(10f,0f))
}