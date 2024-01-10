package ControleDeFluxo

fun bonus(cargo: String, tempoDeExperiencia: Int) {
    if (cargo == "gerente") {
        if (tempoDeExperiencia < 2) {
            println("Bonus de R$2.000,00")
        } else {
            println("Bonus de R$3.000,00 por ter mais de 2 anos de experiencia.")
        }
    } else if (cargo == "coordenador") {
        if (tempoDeExperiencia < 1) {
            println("Bonus de R$1.500,00")
        } else {
            println("Bonus de R$1.800,00 por ter mais de 1 ano de experiencia.")
        }
    } else if (cargo == "engenheiro") {
        println("Bonus de R$1.000,00")
    } else if (cargo == "estagiario") {
        println("Bonus de R$500,00")
    } else {
        println("O Cargo $cargo não foi encontrado.")
    }
}

fun main() {
    bonus("coordenador", 1)
}