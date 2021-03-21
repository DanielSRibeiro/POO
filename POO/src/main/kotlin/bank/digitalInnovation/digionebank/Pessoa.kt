package bank.digitalInnovation.digionebank

abstract class Pessoa(
    val nome:String,
    val cpf:String
){

    fun pessoaInformacao() = "Seu nome é $nome e o seu cpf é $cpf"

}