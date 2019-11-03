fun main() {
    val myArrayList = arrayListOf("Крош", "Ежик", "Нюша", "Бараш")
    val myHashSet = hashSetOf<String>("Крош", "Ежик", "Нюша", "Бараш")
    for (i in myArrayList) {
        print("$i ")
    }
    println()
    for (i in myHashSet) {
        print("$i ")
    }
}