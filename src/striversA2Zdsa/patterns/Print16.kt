package striversA2Zdsa.patterns

/*
    A
    BB
    CCC
    DDDD
    EEEEE
 */

class Print16 {
    fun print16(n: Int) {
        var start = 'A'
        for (i in 1..n) {
            for (j in 1..i) {
                print(start)
            }
            start += 1
            println()
        }
    }
}

fun main() {
    val print16 = Print16()
    print16.print16(5)
}