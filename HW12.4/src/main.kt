fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val exists = myList.any { it.length==7 }
}