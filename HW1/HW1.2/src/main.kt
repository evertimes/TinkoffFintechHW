fun main() {
    println(greater(21,4,5,22))
}
fun greater(n1:Int,n2:Int,n3:Int,n4:Int):Int{
    var g1 = if(n1>n2) n1 else n2
    var g2 = if(n3>n4) n3 else n4
    return if(g1>g2) g1 else g2
}