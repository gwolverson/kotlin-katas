package greed

import kotlin.math.absoluteValue

class Greed {

    fun score(dice: List<Int>) : Int {

        return dice.groupingBy { it.absoluteValue }
            .eachCount()
            .entries.stream()
            .mapToInt { getScoreForEntry(it) }
            .findFirst()
            .asInt
    }

    private fun getScoreForEntry(entry: Map.Entry<Int, Int>): Int {
        return when {
            entry.key == 1 && entry.value == 1 -> 100
            entry.key == 5 && entry.value == 1 -> 50
            entry.key == 1 && entry.value == 3 -> 1000
            entry.key == 2 && entry.value == 3 -> 200
            entry.key == 3 && entry.value == 3 -> 300
            entry.key == 4 && entry.value == 3 -> 400
            entry.key == 5 && entry.value == 3 -> 500
            entry.key == 6 && entry.value == 3 -> 600
            else -> 0
        }
    }
}