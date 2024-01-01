package Funcoes

fun main() {
    val str = "Hello World"

    println("Tamanho da String: ${str.length}")
    println("Tamanho 0 da String: ${str[0]}")
    println(str.startsWith("Hell")) // retorna um Boolean
    println(str.endsWith("hell")) // retorna um Boolean
    println(str.substring(2,4))
    println(str.replace("World", "World aaaaaa")) // muda uma parte da string
    println(str.lowercase()) // converte todos os caracteres para minusculo
    println(str.uppercase()) // converte todos os caracteres para maiusculo
    str.trim() // tira todos os espacos na string
    println(str)

}