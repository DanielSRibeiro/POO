fun main(args: Array<String>) {
//variavel e constante

    val nome:String = "Daniel"
    var a:Int = 1
    val b:Int = 2

    var c = teste1(a, b)
    println("O Valor é $c")

    println("O Valor é ${teste2(4,3)}")
}

//Tipos de Funções
fun teste1(a :Int, b:Int ): Int = if(a>b) a else b

fun teste2(a :Int, b:Int ): Int {
    return if(a>b) a else b
}