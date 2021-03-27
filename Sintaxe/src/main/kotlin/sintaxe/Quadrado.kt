package sintaxe

class Quadrado (var altura:Int, var largura:Int){

    val isQuadrado:Boolean
        get(){
            return altura == largura
        }
    //ou
    val isQuadrado2:Boolean
        get() = altura == largura
}

fun main() {
    //sim
    var quadrado1 = Quadrado(12,12)
    println(quadrado1.isQuadrado)

    //nao
    var quadrado2 = Quadrado(10,12)
    println(quadrado2.isQuadrado2)
}