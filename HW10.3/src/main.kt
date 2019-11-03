fun main() {
    val mySourceList = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val myTargetList = ArrayList<String>()
    val mySourceSet = setOf("Крош", "Ежик", "Нюша", "Бараш")
    val myTargetSet = LinkedHashSet<String>()
    for (i in 0..3) {
        myTargetList.add(mySourceList[i])
        myTargetSet.add(mySourceSet.elementAt(i))
    }
    for (element in myTargetList) {
        print("$element ")
    }
    println()
    for (element in myTargetSet) {
        print("$element ")
    }
}