package Funcoes

fun main() {

    println(helloWorld())
    println(sum(2,3))
    println(sum2(5,3))
    println(divisao(10f, 30.4f))
}

fun sum(a: Int, b: Int): Int {
    var c = a + b
    return c;
}

fun sum2(a: Int, b: Int): Int = (a + b)

fun helloWorld(): String{
    return "Olá, mundo!"
}

fun divisao(a:Float, b:Float) = a/b