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


