fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val finList = myList
        .asSequence()
        .filter { it.length<=4 }
        .map { "Привет $it" }
        .toList()
}