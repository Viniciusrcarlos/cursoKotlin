import org.example.countXO
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste metodo XXOO")
    fun testCountXO() {
        Assertions.assertTrue(countXO("xxoo"))
    }

}