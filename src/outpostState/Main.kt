package outpostState


fun main() {
    val manager = OutpostManager()
    val observer = ResourceObserver()
    val minerals = ObservableResource("Minerals", 100)
    val energy = ObservableResource("Energy", 50)
    minerals.q = 120
    energy.q = 75
}
