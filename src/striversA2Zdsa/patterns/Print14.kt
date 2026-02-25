package striversA2Zdsa.patterns

/*
    A
    A B
    A B C
    A B C D
    A B C D E
 */

class Print14 {
    fun print14(n: Int) {
        for (i in 0 until n) {
            for (j in 0..i) {
                print('A' + j)
            }
            println()
        }
    }
}

fun main() {
    val print14 = Print14()
    print14.print14(5)
}























