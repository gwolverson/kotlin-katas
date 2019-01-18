package greed

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GreedTest {

    lateinit var greed: Greed

    @BeforeAll
    fun setup() {
        greed = Greed()
    }

    @Test
    fun whenCalledWithSingleDieOf1ScoreReturns100() {
        Assertions.assertEquals(100, greed.score(listOf(1)))
    }

    @Test
    fun whenCalledWithSingleDieOf5ScoreReturns50() {
        Assertions.assertEquals(50, greed.score(listOf(5)))
    }

    @Test
    fun whenCalledWithThreeDiceOf111ScoreReturns1000() {
        Assertions.assertEquals(1000, greed.score(listOf(1,1,1)))
    }

    @Test
    fun whenCalledWithThreeDiceOf222ScoreReturns200() {
        Assertions.assertEquals(200, greed.score(listOf(2,2,2)))
    }

    @Test
    fun whenCalledWithThreeDiceOf333ScoreReturns300() {
        Assertions.assertEquals(300, greed.score(listOf(3,3,3)))
    }

    @Test
    fun whenCalledWithThreeDiceOf444ScoreReturns400() {
        Assertions.assertEquals(400, greed.score(listOf(4,4,4)))
    }

    @Test
    fun whenCalledWithThreeDiceOf555ScoreReturns500() {
        Assertions.assertEquals(500, greed.score(listOf(5,5,5)))
    }

    @Test
    fun whenCalledWithThreeDiceOf666ScoreReturns600() {
        Assertions.assertEquals(600, greed.score(listOf(6,6,6)))
    }
}