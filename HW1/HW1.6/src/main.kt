fun main() {
    val A = arrayOf<Int>(5, 2, 1, 4, 3, 10, 7, 8, 9, 6,15,14,12)

    qsort(A,0,A.size-1);

    for(element in A){
        println(element)
    }
}

fun qsort(A:Array<Int>,l:Int,r:Int){
    if(l<r) {
        var key = A[r]
        var i=l-1;
        for(j in l until r)
            if(A[j]<=key){
                i++;
                val tmp = A[i]
                A[i]=A[j]
                A[j]=tmp
            }
        val tmp = A[i+1]
        A[i+1]=A[r]
        A[r]=tmp

        qsort(A,l,i)
        qsort(A,i+2,r)
    }
}