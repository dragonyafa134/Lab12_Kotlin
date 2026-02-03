package outpostState

class OutpostManager {
    val res: MutableList<ObservableResource> by lazy {
        println("Менеджер ресурсов создан")
        mutableListOf<ObservableResource>()
    }
}
