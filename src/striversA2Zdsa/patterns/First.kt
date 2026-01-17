package striversA2Zdsa.patterns

/*
    * * * *
    * * * *
    * * * *
    * * * *

    rows -> 4
    column -> 4
 */

class First {
    fun printFirstPattern(n: Int) {
        for (i in 0..<n) {  // for rows
            for (j in 0 until n) {  // for columns
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    val first = First()
    print("Enter the number of test case: ")
    val testCase = readln().toInt()
    println()
    for (i in 0..<testCase) {
        println("Enter the number of rows- ")
        val n = readln().toInt() // readln() fxn, used to take i/p from user
        first.printFirstPattern(n = n)
    }
}


























