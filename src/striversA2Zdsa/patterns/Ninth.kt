package striversA2Zdsa.patterns

/*
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
 */

class Ninth {
    fun ninthPattern(value: Int) {
        for (i in 0 until value) {  //row
            for (j in 0 until (value - 1) - i) {
                print(" ")
            }
            for (j in 0 until (2 * i) + 1) {
                print("*")
            }
            println()
        }
        for (i in 0 until value) {
            for (j in 0 until i) {
                print(" ")
            }
            for (j in 0 until (2 * value - 1) - 2 * i) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val ninth = Ninth()
    ninth.ninthPattern(5)
}

















