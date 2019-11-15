open class TAG(val tagName:String){
    var children = mutableListOf<TAG>()
    open var content:String? = null
    fun <T: TAG> doInit(child:T,init: T.() -> Unit){
        child.init()
        children.add(child)
    }
}
class OBJ : TAG("object"){
    @Deprecated(level = DeprecationLevel.ERROR,message="no content allowed in this tag")
    override var content:String? = null
    fun name(init: NAME.() -> Unit) = doInit(NAME(),init)
    fun surname(init: SURNAME.() -> Unit) = doInit(SURNAME(),init)
    fun birthDate(init: BIRTHDATE.()->Unit) = doInit(BIRTHDATE(),init)
    fun addresses(init: ADDRESSES.()->Unit) = doInit(ADDRESSES(),init)
}
fun obj(init: OBJ.() -> Unit) = OBJ().apply(init)

class NAME : TAG("name")
class SURNAME : TAG("surname")
class BIRTHDATE : TAG("birthDate")
class ADDRESS : TAG("address")

class ADDRESSES : TAG("addresses"){
    @Deprecated(level = DeprecationLevel.ERROR,message="no content allowed in this tag")
    override var content:String? = null
    fun address(init: ADDRESS.()->Unit) = doInit(ADDRESS(),init)
}

fun printXML(tag: TAG){
    if(tag.children.size ==0 ){
        print("<${tag.tagName}>")
        if(tag.content!=null) {
            print(tag.content)
        }
    }else{
        println("<${tag.tagName}>")
    }
    if(tag.children.size !=0 ){
        for(i in tag.children){
            printXML(i)
        }
    }
    println("</${tag.tagName}>")
}
