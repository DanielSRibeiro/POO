package bank.digitalInnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
){
    fun bancoInformacao() = "Nome: $nome \n" +
            "Número: $numero"
}
