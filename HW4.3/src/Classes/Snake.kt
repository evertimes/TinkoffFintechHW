package ru.tinkoff

class Snake(val name:String,val age:Int):Pet(),Crawable,Voicable{
    override fun crawl() {
        println("*Crawling*")
    }

    override fun voice() {
        println("shhhhh")
    }
}