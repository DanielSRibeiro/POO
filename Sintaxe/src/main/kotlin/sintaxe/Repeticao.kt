package sintaxe

class Repeticao {
}

fun main() {
    var array = "Olha esse array"

    for (i in 1..20 step 2){//pulando em 2 se nao colocar vai ser 1
        print("$i ")
    }
    println("---------------------------")

    for (i in 20 downTo 1){//decrescente
        print("$i ")
    }
    println("---------------------------")

    for (i in 0 until 20){//parar quando chegar no 20
        print("$i ")
    }
    for(l in array){
        println(l.toUpperCase())
    }
}