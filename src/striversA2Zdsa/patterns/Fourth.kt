package striversA2Zdsa.patterns

/*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
 */
class Fourth {
    fun fourthPattern(n: Int) {
        for (i in 1..n) { // for row
            for (j in 1..i) { // for column
                print("$i ")
            }
            println()
        }
    }
}

fun main() {
    val fourth = Fourth()
    print("Enter number for test case: ")
    val testCase = readln().toInt()
    for (i in 0 until testCase) {
        print("Enter value: ")
        val n = readln().toInt()
        fourth.fourthPattern(n = n)
    }
}