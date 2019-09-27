fun main() {
    val A = arrayOf<Int>(5, 2, 1, 4, 3, 10, 7, 8, 9, 6)

    sort(A);

    for(i in 0..9){
        println(A[i]);
    }
}
fun sort(A:Array<Int>) {
    var i: Int;
    var key: Int
    for (j in 1 until A.size) {
        key = A[j]
        i = j - 1
        while (i >= 0 && A[i] > key) {
            A[i + 1] = A[i]
            i--;
        }
        A[i+1]=key;
    }
}