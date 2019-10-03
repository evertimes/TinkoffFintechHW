package ru.tinkoff

class Snake(override val name:String,override val age:Int):Crawable,Voicable,Pet(){
    override fun crawl() {
        println("*Crawling*")
    }

    override fun voice() {
        println("shhhhh")
    }
}