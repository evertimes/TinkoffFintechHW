fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val str = myList.find {it == myList.maxBy { it.length }}
}