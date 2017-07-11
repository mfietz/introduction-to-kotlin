fun main(args: Array<String>) {
    apply(mult(), 2, 3)
}

fun apply(operation: (Int, Int) -> Int, first: Int, second: Int): Int {
    return operation(first, second)
}

fun mult(): (Int, Int) -> Int = { x, y -> x + y }