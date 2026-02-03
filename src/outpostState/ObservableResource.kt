package outpostState
import kotlin.properties.Delegates

class ObservableResource(val name: String, q : Int) {
    var q: Int by Delegates.observable(q) { _, old, new ->
        println("Ресурс $name изменён: $old → $new")
    }

}
