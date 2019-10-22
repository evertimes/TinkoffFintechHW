import kotlinx.coroutines.*

suspend fun main() {
    val cat = Pet("Barsik", 3000)
    val dog = Pet("Rex", 2000)
    val parrot = Pet("Kesha", 5000)
    val hamster = Pet("Homa",500)
    val rat = Pet("Rat",1000)

    runBlocking {
        launch {
            cat.eat()}
        launch {
            dog.eat()}
        launch{
            parrot.eat()}
        launch{
            hamster.eat()}
        launch{
            rat.eat()}
    }
    println("Животные накормлены")
    }
