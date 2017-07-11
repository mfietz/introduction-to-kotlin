import java.util.Collections.list

fun main(args: Array<String>) {
    val list = listOf(1,2,3)
    list.any { it > 4 } // Boolean: false
    list.all { it > 0 } // Boolean: true
    list.none { it % 2 == 0 } // Boolean: false
    list.fold(initial = 0) { total, next -> total + next } // Int: 6
    list.forEach { println(it) }
    list.forEachIndexed { index, item -> println("${index}) $item") } // "1) 1[...]"
    list.filter { it % 2 == 1 } // listOf(1, 3)
    list.take(2) // listOf(1, 2)
    list.groupBy { if (it % 2 == 0) "even" else "odd" }) // mapOf("odd" to listOf(1, 3), "even" to...
    list.map { it * 2} // listOf(2, 4, 6)
}