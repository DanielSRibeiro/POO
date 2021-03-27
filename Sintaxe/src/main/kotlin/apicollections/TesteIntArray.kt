package apicollections

fun main() {
    val values = IntArray(5)

    values[0] = 0
    values[1] = 7
    values[2] = 14
    values[3] = 21
    values[4] = 28

    for(valor in values){
        println(valor)
    }

    println("----------------------")
    values.forEach {
        println(it)
    }

    println("----------------------")

    for(valorInt in values.indices){
        println(values[valorInt])
    }
}
