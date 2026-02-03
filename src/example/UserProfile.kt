package example
import kotlin.properties.Delegates

class UserProfile(initialName: String, initialEmail : String){
    var name: String by Delegates.observable(initialName){_,old, new-> println("Имя измененно $old -> $new")}
    var email: String by Delegates.observable(initialEmail){_, old, new -> println("Email обновлен $old -> $new")}
//    val avatar: String by lazy { println("Загружен аватар для $name") "avatar_of_$name.png"}
}
fun main(){
    println("Создаем профель пользователя..")
    val user = UserProfile("Алиса", "dfdf@gamail.com")

    println("Имя ${user.name}")
    println("Почта ${user.email}")

    println("Обращаемся к автору впервые")
//    println("Файл ${user.avatar}")

    println("Меняем почту")
    user.email = "we"

    println("Меняем имя")
    user.name = "Алиса К."
}