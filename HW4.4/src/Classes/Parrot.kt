package ru.tinkoff

class Parrot(override val name: String, override val age: Int) : Pet(), Flyable, Voicable, Walkable {

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