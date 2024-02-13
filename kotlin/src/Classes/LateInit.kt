package Classes

class Receita() {
    lateinit var instrucoes: String

    fun gerarReceita() {
        instrucoes = "Lave as maos."
    }

    fun imprimirReceita() {
        if (this::instrucoes.isInitialized) {
            instrucoes = "Lave as maos."
        }
    }
}

fun main() {
    var r:Receita = Receita()
    println(r.imprimirReceita())
}