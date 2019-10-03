package ru.tinkoff

class Cat(override val name:String,override val age:Int):Walkable,Voicable,Pet(){
    override fun voice(){
        println("Meow")
    }
    override fun walk(){
        println("*Walking*")
    }
}