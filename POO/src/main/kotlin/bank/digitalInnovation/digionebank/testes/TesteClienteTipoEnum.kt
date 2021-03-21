package bank.digitalInnovation.digionebank.testes

import bank.digitalInnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    //ou
    println("--------------------------------------")

    val pf = ClienteTipo.PF
    println("${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.descricao}")
}