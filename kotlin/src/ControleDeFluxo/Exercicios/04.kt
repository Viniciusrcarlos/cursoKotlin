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
            val codConvite = readLine()
            if (codConvite.toString().uppercase().startsWith("XL", 0) || codConvite.toString().uppercase().startsWith("XT", 0)) {
                println("Welcome :)")
            }
        } else {
            print("Negada. Convite invalido.")
        }
    }
}

fun main() {
    portaria()
}