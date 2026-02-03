package example
import kotlin.properties.Delegates

data class OutpostResource(
    val id : Int,
    val name : String,
    val amointInt : Int){
    var amount : Int by Delegates.observable(amointInt) { _, old, new -> println("Ресурс ${name} изменился $old => $new")}
}
