package controleDeFluxo

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade.")
        if (idade >= 60) {
            println("Terceira idade")
        }
    }else if (idade <= 10){
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

fun main() {
    maiorDeIdade(8)
}