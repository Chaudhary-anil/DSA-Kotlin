package striversA2Zdsa.patterns

/*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
 */
class Eighth {
    fun eighthPattern(value: Int) {
        for (i in 0 until value) { // row
            for (j in 0 until i) {
                print(" ")
            }

            for (j in 0 until (2 * value - 1) - 2 * i) {
                print("*")
            }

            for (j in 0 until i) {
                print(" ")
            }

            println()
        }
    }
}

fun main() {
    val eighth = Eighth()
    print("Enter number for test case: ")
    val testCase = readln().toInt()
    for (i in 0 until testCase) {
        print("Enter value for row: ")
        val rowNumber = readln().toInt()
        eighth.eighthPattern(value = rowNumber)
    }
}