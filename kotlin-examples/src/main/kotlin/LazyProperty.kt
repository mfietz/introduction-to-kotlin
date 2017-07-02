class StringCache {

    val cachedString by lazy {
        expensiveComputation()
    }

    private fun expensiveComputation(): String {
        println("called!")
        return "Kotlin"
    }

}

fun main(args: Array<String>) {
    val foo = StringCache()
    println(foo.cachedString)
    println(foo.cachedString)
}