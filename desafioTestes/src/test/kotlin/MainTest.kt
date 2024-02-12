import org.example.portaria
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun text() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "comum", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "comum", "xt"), "Welcome.")
        Assertions.assertEquals(portaria(20, "luxo", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(20, "comum", "x22"), "Negado.")

    }
}