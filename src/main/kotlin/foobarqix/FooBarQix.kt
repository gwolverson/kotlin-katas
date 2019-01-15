package foobarqix

import extensions.divisibleBy3
import extensions.divisibleBy3And5
import extensions.divisibleBy5
import extensions.divisibleBy7

class FooBarQix {

    fun compute(stringToCompute: String) : String {
        var occurenceString = ""
        var divisorString = ""

        when {
            stringToCompute.toInt().divisibleBy3And5() -> divisorString = "FooBar"
            stringToCompute.toInt().divisibleBy3() -> divisorString = "Foo"
            stringToCompute.toInt().divisibleBy5() -> divisorString = "Bar"
            stringToCompute.toInt().divisibleBy7() -> divisorString = "Qix"
        }

        stringToCompute.forEach {
            when (it) {
                '3' -> occurenceString += "Foo"
                '5' -> occurenceString += "Bar"
                '7' -> occurenceString += "Qix"
            }
        }

        val computedString: String
        val finalString = "$divisorString$occurenceString"

        computedString = if(!finalString.isBlank()) {
            finalString
        } else {
            stringToCompute
        }

        return computedString
    }
}