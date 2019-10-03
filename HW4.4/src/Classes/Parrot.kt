package ru.tinkoff

class Parrot(override val name:String,override val age:Int):Flyable,Voicable,Walkable,Pet(){
    override fun fly() {
        println("*flying*")
    }

    override fun walk() {
        println("*Walking*")
    }

    override fun voice() {
        println("*Trill*")
    }
}