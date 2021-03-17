fun main() {
    var s:String = "Daniel"
    var arrayS = arrayOf("asd",12, 100)
    var b = "    "

    //quantidade de letras
    println(s.length)

    //primeira letra
    println(s.first())

    //ultima letra
    println(s.last())

    //Primeiro na lista
    println(arrayS.first())

    //Ultimo da lista
    println(arrayS.last())
    println("-------------------------")

    //Blank x Empaty

    //Ele esta Branco
    println(b.isBlank())

    //Ele esta branco nao vazio
    println(b.isEmpty())
}