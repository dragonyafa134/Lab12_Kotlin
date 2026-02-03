package example

object SystemLogger{
    init {
        println("Инциализирован")
    }
    fun log(message : String){
        println("log $message")
    }
}
val logger by lazy { SystemLogger }

fun main(){
    logger.log("Запуск базы")
    val loas = FileStorage.load()
//    loas.forEach { manager.add(it) }
//    if (loas.isEmpty()){
//        manager.add(OutpostResource(1,"Minerals", 300))
//        manager.add(OutpostResource(2,"Gas", 100))
//    }
//    FileStorage.save(manager.gerAll())
}