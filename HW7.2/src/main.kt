fun main() {
    val firstCat:Pet = Cat().apply{
        nickname = "Barsik"
        age=5
        sex="Male"
        furColor="White"
    }
    println(firstCat.isCat())
    /*
    Поскольку методы расширения являются статическими,
    то будет использован метод объявленного класса (Pet),
    несмотря на то, что мы его создавали при помощи
    конструктора дочернего класса "Cat"
     */
}