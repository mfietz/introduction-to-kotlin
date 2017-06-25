
fun main(args: Array<String>) {
    var nullSafename: String = "Kotlin"
    nullSafename.length // guaranteed to not cause an NPE
    nullSafename = null // compilation error

    var nullableName: String? = "Kotlin"
    nullableName.length // compilation error
    nullableName = null
}