import org.example.abc
import org.example.countXO
import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo XXOO")
    fun testCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoooo"))}
        )
    }

    @Test
    @Disabled
    fun testeNaoImplementado() {

    }

//    @Test
//    fun vaiFalhar() {
//        fail("Falhou")
//    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }

    


}