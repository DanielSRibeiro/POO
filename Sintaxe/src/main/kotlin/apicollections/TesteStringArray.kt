package apicollections

fun main() {
    val nome = Array(3){""}

    nome[0] = "Daniel"
    nome[1] = "Ana"
    nome[2] = "Carla"

    nome.forEach { println(it) }

    println("----------------------------------------")
    nome.sort()
    nome.forEach { println(it) }

    println("----------------------------------------")
    val arrayOf = arrayOf("Filipi","Carlos","Gabriel")
    arrayOf.sort()
    arrayOf.forEach { println(it) }
}