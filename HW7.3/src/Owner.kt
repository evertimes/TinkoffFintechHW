class Owner<T:Pet>(var pet:T){
    fun feed(){
        println("Домашнее животное ${pet.nickname} накормлено")
    }
}