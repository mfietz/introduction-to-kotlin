data class Person(
        val name: String,
        var age: Int? = null
)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice"), Person("Bob", age = 42))
    println("The oldest person is ${people.oldest()}}")
}

private fun List<Person>.oldest() = this.maxBy { it.age ?: 0 }