import java.util.Scanner

fun main() {
    var height = 1
    var localHeight = 1
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()
    val cache = Array<Int>(n) { -1 }
    val tree = mutableListOf<Int>()
    fun seekRoot(index: Int) {
        if (tree[index] == -1)
            return
        else {
            if (cache[index] == -1) {
                seekRoot(tree[index])
                cache[index] = localHeight
            } else
                localHeight = cache[index]
        }
        localHeight++
    }

    for (i in 0 until n) {
        tree.add(scn.nextInt())
    }
    for (i in 0 until n) {
        seekRoot(i)
        if (localHeight > height) {
            height = localHeight
        }
        localHeight = 1
    }
    println(height)
}