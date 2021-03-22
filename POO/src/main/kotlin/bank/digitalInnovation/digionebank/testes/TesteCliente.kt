package bank.digitalInnovation.digionebank.testes

import bank.digitalInnovation.digionebank.Cliente
import bank.digitalInnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente("Jose","123.321.123.11",ClienteTipo.PF,"123")

    println(jose)

    TesteAutenticacao.autenticar(jose)
}