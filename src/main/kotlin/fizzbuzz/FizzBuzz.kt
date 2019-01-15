package fizzbuzz

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

fun Int.divisibleBy3() : Boolean {
    return this % 3 == 0
}

fun Int.divisibleBy5() : Boolean {
    return this % 5 == 0
}

fun Int.divisibleBy3And5() : Boolean {
    return this % 3 == 0 && this % 5 == 0
}