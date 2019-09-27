import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s = scan.next()
    print(isCapitalized(s))
}

fun isCapitalized(S:String):Boolean{
    return S[0].isUpperCase();

    //Или только для англтийских символов

    //return (S[0]>= 41.toChar() && S[0]<= 90.toChar())
}

