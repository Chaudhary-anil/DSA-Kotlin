package striversA2Zdsa.patterns

/*      output ->
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *

 */
class Seventh {
    fun seventhPattern(value: Int) {
        for (i in 0 until value) {
            for (j in 0 until value - i - 1) {
                print(" ")
            }
            for (j in 0 until  (2 * i) + 1) {
                print("*")
            }
            for (j in 0 until value - i - 1) {
                print(" ")
            }
            println()
        }
    }
}

fun main() {
    val seventh = Seventh()
    print("Enter number for testCase: ")
    val testCase = readln().toInt()
    for (i in 0 until testCase) {
        print("Enter value for pattern: ")
        val value = readln().toInt()
        seventh.seventhPattern(value)
    }
}