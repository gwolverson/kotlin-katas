package fizzbuzz

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FizzBuzzTest {

    lateinit var fizzBuzz: FizzBuzz

    @BeforeAll
    fun setup() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun whenGenerateFizzBuzzSequenceIsCalledWithSizeOf2ThenListOf2IsReturned() {
        Assertions.assertEquals(listOf("1", "2"), fizzBuzz.generateFizzBuzzSequence(2))
    }

    @Test
    fun whenGenerateFizzBuzzSequenceIsCalledWithSizeOf3ThenListOf3WithFizzIsReturned() {
        Assertions.assertEquals(listOf("1", "2", "Fizz"), fizzBuzz.generateFizzBuzzSequence(3))
    }

    @Test
    fun whenGenerateFizzBuzzSequenceIsCalledWithSizeOf5ThenListOf5WithFizzAndBuzzIsReturned() {
        Assertions.assertEquals(listOf("1", "2", "Fizz", "4", "Buzz"), fizzBuzz.generateFizzBuzzSequence(5))
    }

    @Test
    fun whenGenerateFizzBuzzSequenceIsCalledWithSizeOf15ThenListOf5WithFizzAndBuzzAndFizzBuzzIsReturned() {
        Assertions.assertEquals(
            listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"),
            fizzBuzz.generateFizzBuzzSequence(15))
    }
}