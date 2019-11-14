fun main() {
    val mySourceList = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val myTargetList = ArrayList<String>()
    val mySourceSet = setOf("Крош", "Ежик", "Нюша", "Бараш")
    val myTargetSet = LinkedHashSet<String>()
    for (i in mySourceList.indices) {
        myTargetList.add(mySourceList[i])
    }
    for (i in mySourceSet.indices) {
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