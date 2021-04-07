package sintaxe

class When {
}

fun main() {

    val a = (1..100).random()
    var b:String

    val c:Int? = null
    var d = c?: 0 //se c for null o valor é 0
    val e = c?: d?: 7 //se c for null ele recebe o valor de d se d for null ele recebe 7 ,mas d = 0 pois c = null

    //switch do kotlin
    when(a){
        in 1..30 -> b = "A"
        in 31..60 ->  b ="B"
        else ->  b ="C"
    }
    println(a)
    println(b)
    println(d)
    println(e)
}