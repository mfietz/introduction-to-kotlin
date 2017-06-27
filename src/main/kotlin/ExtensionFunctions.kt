package de.mfietz


fun main(args: Array<String>) {
    "otto".isPalindrom()
}

fun String.isPalindrom() = this.isNotEmpty() && this == this.reversed()


