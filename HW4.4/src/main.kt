package ru.tinkoff

import java.util.*

fun main() {
    val menu=MainMenu()
    val gameLoop=GameLoop()
    val owner:PetOwner = menu.init()
    gameLoop.run(owner)
}
