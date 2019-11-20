fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val str = myList.maxBy { it.length }
}