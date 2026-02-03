package outpostState
import java.io.File

object StateStorage {
    private const val fileName = "res.txt"

    fun save(resources: List<ObservableResource>) {
        File(fileName).printWriter().use { out -> resources.forEach {
                out.println("${it.name};${it.q}")
            }
        }
    }

    fun load(): List<ObservableResource> {
        val file = File(fileName)
        if (!file.exists()) return emptyList()
    }
}
