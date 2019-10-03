package ru.tinkoff

import java.util.*

fun main() {
    val owner = PetOwner()
    val menu=MainMenu()
    do {
        menu.init(owner)
    }while(owner.myPet==null)
    println("Pet name is: ${owner.myPet!!.name}  and pet age is ${owner.myPet!!.age}")
    menu.gameLoop(owner)
}
