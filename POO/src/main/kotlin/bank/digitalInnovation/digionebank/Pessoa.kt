package bank.digitalInnovation.digionebank

class Pessoa(var nome:String, var cpf:String) {

    inner class Endereco(){
        var rua:String = "Rua Teste"
    }

    fun pessoaInformacao() = "Seu nome é $nome e o seu cpf é $cpf"

}

fun main() {
    var pessoa1 = Pessoa("Daniel", "123.123.123-12")
    println(pessoa1.pessoaInformacao())
}