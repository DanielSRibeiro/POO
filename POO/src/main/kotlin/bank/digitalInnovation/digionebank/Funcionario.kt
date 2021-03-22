package bank.digitalInnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario:Double

) : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilio() : Double

    override fun toString(): String = """
        Nome: $nome 
        CPF: $cpf 
        Salário: R$$salario
        Bônus do Auxílio: R$${calcularAuxilio()}
    """.trimIndent()
}