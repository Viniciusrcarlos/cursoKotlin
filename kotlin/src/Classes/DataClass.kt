package Classes

//class Forma(val a: Int, val b: Int) {
//    override fun equals(other: Any?): Boolean {
//        return if (other is Forma) {
//            (other.a == this.a && other.b == this.b)
//        } else {
//            false
//        }
//    }
//}

data class FormaData(val a: Int, val b: Int) {

}

fun main() {
    val f1: FormaData = FormaData(10 ,5)
    val f2: FormaData = FormaData(10 ,5)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())


}