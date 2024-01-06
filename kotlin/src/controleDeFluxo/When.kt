package controleDeFluxo

fun bonus(cargo: String): Float {
    var bonus = 0f

    if (cargo == "gerente") {
        bonus = 2000f
    } else if (cargo == "coordenador") {
        bonus = 1500f
    } else if (cargo == "engenheiro") {
        bonus = 1000f
    } else if (cargo == "estagiario") {
        bonus = 500f
    }

    return bonus
}

fun bonusWhen(cargo: String): Float {
    val bonus = when (cargo) {
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro" -> 1000f
        "estagiario" -> 500f
        else -> 0f
    }
    return bonus
}

fun main() {
    var bonus = bonusWhen("engenheiro")

    println(bonus)
}