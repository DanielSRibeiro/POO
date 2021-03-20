class Pessoa {
    var nome:String = "Daniel"
    var cpf:String = "123.123.123-12"
}

fun main() {
    var pessoa1 = Pessoa()

    println("Seu nome é ${pessoa1.nome} e o seu cpf é ${pessoa1.cpf}")
}