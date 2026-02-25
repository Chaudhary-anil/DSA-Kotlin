package striversA2Zdsa.patterns

/*
    ABCDE
    ABCD
    ABC
    AB
    A
 */

class Print15 {
    fun print15(n: Int) {
        for (i in n downTo 1) {
            for (j in 0 until i) {
                print('A' + j)
            }
            println()
        }
    }
}

fun main() {
    val print15 = Print15()
    print15.print15(5)
}




















