package Classes

fun main() {
    val p: Pessoa = Pessoa(2002, "Vinicius")

    // uso para simplificar o uso de um objeto.
    with(p){
        this.dormir()
        this.acordar()
    }
}