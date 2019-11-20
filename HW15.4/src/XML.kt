open class Tag(val tagName: String) {
    var children = mutableListOf<Tag>()
    open var content: String? = null
    fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }
}

class Obj : Tag("object") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no content allowed in this tag")
    override var content: String? = null

    fun name(init: Name.() -> Unit) = doInit(Name(), init)
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

fun obj(init: Obj.() -> Unit) = Obj().apply(init)

class Name : Tag("name") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun name(init: Name.() -> Unit) = doInit(Name(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

class Surname : Tag("surname") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun name(init: Name.() -> Unit) = doInit(Name(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

class Birthdate : Tag("birthDate") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun name(init: Name.() -> Unit) = doInit(Name(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

class Address : Tag("address") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun name(init: Name.() -> Unit) = doInit(Name(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

class Addresses : Tag("addresses") {
    @Deprecated(level = DeprecationLevel.ERROR, message = "no content allowed in this tag")
    override var content: String? = null

    fun address(init: Address.() -> Unit) = doInit(Address(), init)
    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun name(init: Name.() -> Unit) = doInit(Name(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun birthDate(init: Birthdate.() -> Unit) = doInit(Birthdate(), init)

    @Deprecated(level = DeprecationLevel.ERROR, message = "no tags allowed in this tag")
    fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)
}

fun printXML(tag: Tag) {
    if (tag.children.size == 0) {
        print("<${tag.tagName}>")
        if (tag.content != null) {
            print(tag.content)
        }
    } else {
        println("<${tag.tagName}>")
    }
    if (tag.children.size != 0) {
        for (i in tag.children) {
            printXML(i)
        }
    }
    println("</${tag.tagName}>")
}