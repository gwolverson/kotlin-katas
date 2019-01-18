package stringcalculator

import java.math.BigDecimal
import java.util.regex.Pattern

class StringCalculator {

    fun add(numbers: String) : BigDecimal {
        return when {
            numbers.isEmpty() -> BigDecimal(0)
            else -> {
                addNumbers(numbers)
            }
        }
    }

    private fun addNumbers(numbers: String): BigDecimal {
        val separatorPattern = Pattern.compile(",|\n")
        return numbers.split(separatorPattern)
            .map { it.trim().toBigDecimal() }
            .reduce { acc, bigDecimal ->  acc + bigDecimal}
    }
}