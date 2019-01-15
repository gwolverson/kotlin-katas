package fizzbuzz

import extensions.divisibleBy3
import extensions.divisibleBy3And5
import extensions.divisibleBy5

class FizzBuzz {

    fun generateFizzBuzzSequence(sequenceSize: Int) : List<String> {
        return (1..sequenceSize).map { it -> generateFizzBuzz(it) }
    }

    fun generateFizzBuzz(number: Int) : String {
        return when {
            number.divisibleBy3And5() -> "FizzBuzz"
            number.divisibleBy3() -> "Fizz"
            number.divisibleBy5() -> "Buzz"
            else -> {
                number.toString()
            }
        }
    }
}