package ControleDeFluxo.Exercicios

fun portaria() {
    print("Digite sua idade: ")
    val idade = readLine()

    if (idade != null && idade.toInt() < 18) {
        println("Negado. Menores de idade não são permitidos.")
    } else {
        print("Digite o tipo de convite: ")
        val convite = readLine()
        if (convite == "comum" || convite == "premium" || convite == "luxo") {
            print("Digite o codigo do convite: ")
            
        } else {
            print("Negada. Convite invalido.")
        }
    }
}

fun main() {
    portaria()
}