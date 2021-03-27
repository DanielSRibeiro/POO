const val MAX_AGE = 68
const val MIN_AGE = 16

fun main() {
    var age = (1..100).random()

    println(age)
    println(" Pode Doar Sangue ?  ${age <= MAX_AGE && age >= MIN_AGE}")
}