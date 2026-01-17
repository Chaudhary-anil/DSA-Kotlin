package striversA2Zdsa.patterns

/*
    * * * * *
    * * * *
    * * *
    * *
    *
 */
class Sixth {
    fun sixthPattern(value: Int) {
        for (i in 0..<value) { // row
            for (j in 0..<value - i) {
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    val sixth = Sixth()
    print("Enter value for test case: ")
    val testCase: Int = readln().toInt()
    for (i in 0 until testCase) {
        print("Enter value for pattern: ")
        val value = readln().toInt()
        sixth.sixthPattern(value)
    }
}