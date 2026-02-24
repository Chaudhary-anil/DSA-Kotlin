package striversA2Zdsa.patterns

/*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */

class Tenth {
    fun tenthPattern(value: Int) {
        for (i in 0 until value) {
            for (j in 0..i) {
                print("*")
            }
            println()
        }
        for (i in 0 until value - 1) {
            for (j in 0 until (value - i - 1)) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val tenth = Tenth()
    tenth.tenthPattern(5)
}




















