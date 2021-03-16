fun main(args: Array<String>) {
    var a = 1
    var b = 2

    var c = teste(a, b)

    println("O Valor é $c")

}

fun teste(a :Int, b:Int ): Int { return if(a>b) a else b }