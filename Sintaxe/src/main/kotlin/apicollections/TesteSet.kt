package apicollections

fun main() {
    val daniel = Funcionario("Daniel",4310.00, "CLT")
    val ana = Funcionario("Ana",10020.00, "CPJ")
    val carlos = Funcionario("Carlos",2310.10, "CLT")

    val funcionario1 = setOf(daniel,ana)
    val funcionario2 = setOf(carlos)
    val funcionario3 = setOf(daniel,ana,carlos)

    val resulUnion = funcionario1.union(funcionario2)
    resulUnion.forEach{println(it)}

    println("---------------------------------")

    val resulSubtract = funcionario3.subtract(funcionario2)
    resulSubtract.forEach{println(it)}

    println("---------------------------------")

    val resulIntersert = funcionario3.intersect(funcionario2)
    resulIntersert.forEach{println(it)}
}