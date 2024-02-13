package Classes

enum class Prioridades(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: ${value}"
        }
             },
    Media(5),
    Alta(15)
}

enum class AnimalEnum() {
    Cachorro, Gato, Cavalo, Vaca
}

fun x(p: Prioridades) {

}

fun main() {

    for (p in Prioridades.values()) {
        println(p)
    }



}