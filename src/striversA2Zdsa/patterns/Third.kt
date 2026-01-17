package striversA2Zdsa.patterns

/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */


class Third {
    fun thirdPattern(n: Int) {
        for (i in 1..n) {
            for (j in 1 .. i) {
                print("$j ")
            }
            println()
        }
    }
}

fun main() {
    val third = Third()
    print("Enter number of testcase: ")
    val testCase = readln().toInt()
    for (i in 0..<testCase) {
        println("Enter value for row: ")
        val rowValue = readln().toInt()
        third.thirdPattern(n = rowValue)
    }
}




































