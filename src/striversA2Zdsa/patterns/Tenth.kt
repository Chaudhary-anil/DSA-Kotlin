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

    fun tenthPatternII(value: Int) {
        for (i in 1..2 * value - 1) {
            val stars = if (i <= value) {
                i
            }
            else {
                2 * value - i
            }

            for (j in 1..stars) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val tenth = Tenth()
    tenth.tenthPatternII(5)
}




















