package apicollections

fun main() {
    val f1 = Funcionario("Daniel",4310.00, "CLT")
    val f2 = Funcionario("Ana",10020.00, "CPJ")
    val f3 = Funcionario("Carlos",2310.10, "CLT")

    val funcionarios = listOf(f1,f2,f3)

    funcionarios.forEach{ println(it)}

    println("-----------------------------")
    println(funcionarios.find{ it.nome == "Carlos"})

    println("-----------------------------")
    println(funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)})

    println("-----------------------------")
    println(funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)})
}
