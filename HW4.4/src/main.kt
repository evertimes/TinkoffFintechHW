package ru.tinkoff


fun main() {
    val menu=MainMenu()
    val gameLoop=GameLoop()
    val owner:PetOwner = menu.init()
    gameLoop.run(owner)
}
