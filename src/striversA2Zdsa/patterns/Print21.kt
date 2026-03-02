package striversA2Zdsa.patterns
/*
    * * * *
    *     *
    *     *
    * * * *

   first row -> all column
   last row -> all column
   remaining row -> start and end only
 */

class Print21 {
    fun print21(n: Int) {
        for (i in 1..n) {
            for (j in 1..n) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    print("*")
                }
                else {
                    print(" ")
                }
            }
            println()
        }
    }
}

fun main() {
    val print21 = Print21()
    print21.print21(5)
}














