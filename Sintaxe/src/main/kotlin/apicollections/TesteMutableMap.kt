package apicollections

fun main() {
    val daniel = Funcionario("Daniel",4310.00, "CLT")
    val ana = Funcionario("Ana",10020.00, "CPJ")
    val carlos = Funcionario("Carlos",2310.10, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(daniel.nome, daniel)
    repositorio.create(ana.nome, ana)
    repositorio.create(carlos.nome, carlos)

    println(repositorio.findById(daniel.nome))

    println("----------------------------------")

    repositorio.findAll().forEach { println(it) }

    println("----------------------------------")

    repositorio.remove(daniel.nome)
    repositorio.findAll().forEach { println(it) }
}