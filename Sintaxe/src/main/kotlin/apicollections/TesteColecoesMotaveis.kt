package apicollections

fun main() {
    val daniel = Funcionario("Daniel",4310.00, "CLT")
    val ana = Funcionario("Ana",10020.00, "CPJ")
    val carlos = Funcionario("Carlos",2310.10, "CLT")


    println("------------LIST-----------------")
    val funcionarios = mutableListOf(daniel, carlos)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionarios.add(ana)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionarios.remove(daniel)
    funcionarios.forEach { println(it) }

    println("------------SET-----------------")
    val funcionariosSet = mutableListOf(daniel)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.add(ana)
    funcionariosSet.add(carlos)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.remove(ana)
    funcionariosSet.forEach { println(it) }

}