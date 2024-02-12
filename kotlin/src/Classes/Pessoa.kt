package Classes

import ControleDeFluxo.Exercicios.quadrado

class Pessoa(val anoNascimento: Int, var nome: String) {

     var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String):this(anoNascimento, nome) {
        this.doc = doc
    }

    fun dormir(): Int {
        return 2
    }

    fun acordar() {
        println("Acordando...")
    }

}

fun main() {
    var pessoa: Pessoa = Pessoa(2000, "Vinicius", "21321")

    println(pessoa.dormir())


}