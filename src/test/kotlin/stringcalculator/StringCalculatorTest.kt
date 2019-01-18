package stringcalculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.math.BigDecimal

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringCalculatorTest {

    lateinit var stringCalculator: StringCalculator

    @BeforeAll
    fun setup() {
        stringCalculator = StringCalculator()
    }

    @Test
    fun whenCalledWithEmptyStringAddReturns0() {
        Assertions.assertEquals(BigDecimal(0), stringCalculator.add(""))
    }

    @Test
    fun whenCalledWith1AddReturns1() {
        Assertions.assertEquals(BigDecimal(1), stringCalculator.add("1"))
    }

    @Test
    fun whenCalledWith2AddReturns2() {
        Assertions.assertEquals(BigDecimal(2), stringCalculator.add("2"))
    }

    @Test
    fun whenCalledWith1And2AddReturns3() {
        Assertions.assertEquals(BigDecimal(3), stringCalculator.add("1,2"))
    }

    @Test
    fun whenCalledWith2And3AddReturns5() {
        Assertions.assertEquals(BigDecimal(5), stringCalculator.add("2,3"))
    }

    @Test
    fun whenCalledWithTwoDecimalNumbersAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(3.3), stringCalculator.add("1.1,2.2"))
    }

    @Test
    fun whenCalledWithSpacesAfterSeparatorAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(9), stringCalculator.add("5, 4"))
    }

    @Test
    fun whenCalledWithTwoLargeDecimalNumbersAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(3542.1), stringCalculator.add("1050.9,2491.2"))
    }

    @Test
    fun whenCalledWith3NumbersAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(12), stringCalculator.add("3,6,3"))
    }

    @Test
    fun whenCalledWith5NumbersAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(20), stringCalculator.add("3,1,6,2,8"))
    }

    @Test
    fun whenCalledWith10NumbersAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(100), stringCalculator.add("10,10,10,10,10,10,10,10,10,10"))
    }

    @Test
    fun whenCalledWithNewlineSeparatorAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(10), stringCalculator.add("5\n5"))
    }

    @Test
    fun whenCalledWithMultipleNumbersAndNewlineSeparatorsAddReturnsCorrectValue() {
        Assertions.assertEquals(BigDecimal.valueOf(20), stringCalculator.add("5\n5\n5\n5"))
    }
}