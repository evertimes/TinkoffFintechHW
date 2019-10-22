fun main() {
    val firstOwner = Owner(Cat("Barsik", 2, "Male"))
    val secondOwner = Owner(Dog("Rex", 4, "Male"))
    firstOwner.feed()
    secondOwner.feed()
}