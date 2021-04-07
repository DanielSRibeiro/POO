package sintaxe

class Pessoa (
    val nome:String,
    val idade:Int,
    var isCasado: Boolean,
)

fun main() {
    //Forma de Instanciar uma class
    var pessoa1 = Pessoa("Daniel",18, false)
    val pessoa2 = Pessoa("Maria",20, true)

    println("${pessoa1.nome}")
    //Somando a Idade do pessoa1
    println("${pessoa1.idade+10}")
    println("---------------------------------")
    //pessoa2

    println("Voce é casado:  ${chamandoVerificacao(pessoa2.isCasado)} ")
}

fun chamandoVerificacao(casado: Boolean): String = if(casado) "Sim eu sou" else "Não sou não"
