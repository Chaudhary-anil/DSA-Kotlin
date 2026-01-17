package striversA2Zdsa.patterns

/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
class Fifth {
    fun fifthPattern(value: Int) {
        for (i in 0..<value) { // row ( 0, 1, 2 , 3 , 4 )
            for (j in 1.. value - i) { // column
                print("$j ")
            }
            println()
        }
    }
}

fun main() {
    val fifth = Fifth()
    print("Enter number for test case: ")
    val testCase = readln().toInt()
    for (i in 0 until testCase) {
        print("Enter value for pattern: ")
        val value = readln().toInt()
        fifth.fifthPattern(value)
    }
}