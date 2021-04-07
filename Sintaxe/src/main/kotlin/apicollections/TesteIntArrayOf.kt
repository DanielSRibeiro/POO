package apicollections

fun main() {
    val values = intArrayOf(0,28,21,14,7)

    values.sort()
    for (valor in values){
        println(valor)
    }
    println("---------------------------------")
    println("Menor numero: ${values.minOrNull()} " +
            "\nMaior numero: ${values.maxOrNull()} " +
            "\nMedia: ${values.average()}")

    val filter = values.filter { it > 7 }

    filter.forEach{ println(it)}

    println("---------------------------------------")
    println(values.count { it in 7..21 })
    println("---------------------------------------")
    println(values.find { it > 14 })
    println("---------------------------------------")
    println(values.any{ it < 7})
}