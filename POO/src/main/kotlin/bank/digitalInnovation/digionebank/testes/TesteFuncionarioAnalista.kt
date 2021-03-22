package bank.digitalInnovation.digionebank.testes

import bank.digitalInnovation.digionebank.Gerente
import bank.digitalInnovation.digionebank.ImprimirRelatorioFuncionario

fun main() {
    val maria = Gerente("João","123.123.123-12",2000.0)
    ImprimirRelatorioFuncionario.imprimir(maria)
}