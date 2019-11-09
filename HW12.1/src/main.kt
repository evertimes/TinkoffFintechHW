fun main() {
    val myList = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val helloList = myList.map{"Привет "+it}
    println(helloList)
}