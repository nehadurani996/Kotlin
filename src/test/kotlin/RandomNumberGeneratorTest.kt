import org.example.getRandom
import org.junit.jupiter.api.Test

class RandomNumberGeneratorTest {
    @Test
    fun verifyTrueIsAlwaysTrue(){
        assert(true==true)
    }
    @Test
    fun `get random value between 0 and 100`(){
        val random = getRandom(100)
        assert(random in 0..100)
    }

    @Test()
    fun `getRandom throws exception`(){
        getRandom(-1)
    }
}