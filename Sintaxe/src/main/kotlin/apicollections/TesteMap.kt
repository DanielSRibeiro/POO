package apicollections

fun main() {
    val pair1:Pair<String, Double> = Pair("daniel", 1000.00)
    val map1 = mapOf(pair1)

    map1.forEach { t, u -> println("Chave: $t Valor: R$$u")}

    println("-------------------------------------")
    val map2 = mapOf(
        "daniel2" to 2000.00,
        "filipi" to 2300.00
    )

    map2.forEach { t, u -> println("Chave: $t Valor: R$$u")}
}