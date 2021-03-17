class When {
}

fun main() {

    val a = (1..5).random()
    var b:String

    val c:Int? = null
    var d = c ?: 0 //se c for null o valor é 0
    //switch do kotlin
    when(a){
        1 -> {b = "A"}
        2 -> { b ="B"}
        else -> { b ="C"}
    }
    println(a)
    println(b)
    println(d)
}