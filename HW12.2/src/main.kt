fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val filteredList = myList.filter { it.length < 6 }
}