package Null

fun main() {
    try {
        val s:String? = null
        val a = 10/0

        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variavel null")
    } catch (e: ArithmeticException) {
        println("Impossivel dividir por 0")
    } catch (e: Exception) {
        println("Generica!")
    } finally {
        println("Try finalizado!")
    }

    print("Fim.")
}