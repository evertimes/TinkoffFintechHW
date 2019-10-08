package ru.tinkoff

data class Person(
    val lastName: String,
    val firstName: String,
    val age: Int,
    val zipCode: String,
    val phoneNumber: String
) {
    companion object : Comparator<Person> {
        override fun compare(o1: Person?, o2: Person?): Int {
            return if (o1?.firstName == o2?.firstName &&
                o1?.lastName == o2?.lastName &&
                o1?.age == o2?.age &&
                o1?.zipCode == o2?.zipCode &&
                o1?.phoneNumber == o2?.phoneNumber
            ) {
                1
            } else
                0
        }
    }
}


object PersonComparator : Comparator<Person> {
    override fun compare(o1: Person?, o2: Person?): Int {
        return if (o1?.firstName == o2?.firstName &&
            o1?.lastName == o2?.lastName &&
            o1?.age == o2?.age &&
            o1?.zipCode == o2?.zipCode &&
            o1?.phoneNumber == o2?.phoneNumber
        ) {
            1
        } else
            0
    }

}
