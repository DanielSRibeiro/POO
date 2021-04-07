package apicollections

fun main() {
    val salario = arrayOf(
        "1000".toBigDecimal(),
        "1500".toBigDecimal(),
        "3000".toBigDecimal()
    )

    println(salario.somatorio())

    println("----------------------------")
    println(salario.media())

}