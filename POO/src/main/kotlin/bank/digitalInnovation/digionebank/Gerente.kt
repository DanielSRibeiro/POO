package bank.digitalInnovation.digionebank

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha:String)
    : Funcionario(nome, cpf, salario), Logavel {
    override fun calcularAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "123456" == senha
}