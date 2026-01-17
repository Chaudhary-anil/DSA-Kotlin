package striversA2Zdsa.patterns

/*
    *
    * *
    * * *
    * * * *
    * * * * *

 */

class SecondPattern {
    fun secondPattern(n: Int) {
        for (i in 0..<n) {
            for (j in 0..i) {
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    val secondPattern = SecondPattern()
    print("Enter number of test case: ")
    val testCase = readln().toInt()
    for (i in 0..<testCase) {
        println("Enter number of row: ")
        val row = readln().toInt()
        secondPattern.secondPattern(n = row)
    }
}





















