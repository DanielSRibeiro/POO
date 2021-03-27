package sintaxe

class Funcao {
}

fun main() {
    val a = 20
    val b = 10

    //var z = calcular(a,b,::sum)
    //ou
    var z = calcular(a,b){
            a,b ->
        print("Calcular ")
        a*b
    }

    println(z)
}

fun calcular(i: Int, i1: Int, kFunction2:(Int, Int) -> Int): Int {
    var soma = kFunction2(i,i1)
    return soma
}

fun sum(n1:Int, n2:Int) : Int = n1+n2