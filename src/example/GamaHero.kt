package example
import kotlin.properties.Delegates

class GamaHero(startName: String) {
    var name : String by Delegates.observable(startName){_, old, new -> println("$old получил новое имя $new")}
    var mana: Int by Delegates.observable(100){_, old, new -> println(" Mana $old $new")}
//    val uitimate: String by lazy { println("Загружаем анимацию..") "Метеоритный дождь" }
}

class UserProfile(internalName: String, initialEmail : String)


fun main() {
    println("Создаем героя...")
    val hero = GamaHero("Воин света")
    println("Текущая мана ${hero.mana}")
    println("Герой пытается использовать способность")
//    println("Способность ${hero.uitimate}")
    println("Повторный вызов способности ")
//    println("Способность ${hero.uitimate}")
    println("Меняем имя героя")
    hero.name = "Темний паладин"
    println("Герой востанавливает ману")
    hero.mana = 200
}

