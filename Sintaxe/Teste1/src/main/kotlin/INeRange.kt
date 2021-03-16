fun main() {
    var lista = listOf(1,2,3,4,5,6,7,8,9,10, "Daniel")
    var a = 11
    var b = "Daniel"
    //aleatorio entre 1 ate 10
    var r = (1..10).random()

    //false: 11 nao esta na lista
    println(a in lista)

    //true: Daniel esta na lista
    println(b in lista)

    println("--------------------------------")
    for(c in lista){
        println(c)
    }
    println("--------------------------------")
    println(r)
}