package outpostState

class ResourceObserver {
    fun r(resource: ObservableResource) {
        println("Наблюдатель: ресурс ${resource.name} теперь равен ${resource.q}")
    }
}
