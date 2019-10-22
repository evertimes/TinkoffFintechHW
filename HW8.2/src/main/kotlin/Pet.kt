import kotlinx.coroutines.delay

class Pet(val nickname:String,private val mealDuration:Long) {
    suspend fun eat(){
        delay(mealDuration)
        println("$nickname покушал")
    }
}