package bank.digitalInnovation.digionebank.testes

import bank.digitalInnovation.digionebank.Banco

fun main() {
    val digitalOneBank = Banco("DigitalBank",12)

    println(digitalOneBank.nome)
    println(digitalOneBank.numero)

    println("----------------------------------------------")

    val banco2 = digitalOneBank.copy(nome = "Mudando o Nome")
    println(banco2.bancoInformacao())
}