package ru.tinkoff

class Snake(val name:String,val age:Int):Crawable,Voicable,Pet(){
    override fun crawl() {
        println("*Crawling*")
    }

    override fun voice() {
        println("shhhhh")
    }
}