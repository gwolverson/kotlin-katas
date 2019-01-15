package extensions

fun Int.divisibleBy3() : Boolean {
    return this % 3 == 0
}

fun Int.divisibleBy5() : Boolean {
    return this % 5 == 0
}

fun Int.divisibleBy3And5() : Boolean {
    return this % 3 == 0 && this % 5 == 0
}

fun Int.divisibleBy7() : Boolean {
    return this % 7 == 0
}