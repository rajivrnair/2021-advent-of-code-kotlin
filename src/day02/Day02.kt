package day02

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var depth = 0
        var horizontal = 0

        input.forEach {
            val command = it.split(" ")
            when(command[0]) {
                "forward" -> horizontal += command[1].toInt()
                "down" -> depth += command[1].toInt()
                "up" -> depth -= command[1].toInt()
            }
        }
        return depth * horizontal
    }

    fun part2(input: List<String>): Int {
        var depth = 0
        var horizontal = 0
        var aim = 0

        input.forEach {
            val command = it.split(" ")
            when(command[0]) {
                "forward" -> {
                    horizontal += command[1].toInt()
                    depth += (aim * command[1].toInt())
                }
                "down" -> aim += command[1].toInt()
                "up" -> aim -= command[1].toInt()
            }
        }
        return depth * horizontal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
//    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
//    println(part1(input))
    println(part2(input))
}
