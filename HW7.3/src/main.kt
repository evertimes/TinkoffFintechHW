fun main() {
    val firstOwner = Owner(Pet().apply {
        nickname="SomeNickname"
        age=1
        sex="Male"
    })
    val secondOwner = Owner(Cat().apply{
        nickname="Barsik"
        age = 2
        sex = "Male"
    })
    val thirdOwner = Owner(Dog().apply{
        nickname="Rex"
        age = 4
        sex = "Male"
    })
    firstOwner.feed()
    secondOwner.feed()
    thirdOwner.feed()
}