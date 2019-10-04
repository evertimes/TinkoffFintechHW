package ru.tinkoff

class Snake(override val name:String,override val age:Int):Pet(),Crawable,Voicable{
    override fun crawl() {
        println("*Crawling*")
    }

    override fun voice() {
        println("shhhhh")
    }
}