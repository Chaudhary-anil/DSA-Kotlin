package striversA2Zdsa.patterns

/*
    E
    DE
    CDE
    BCDE
    ABCDE
 */

class Print18 {
    fun print18(n: Int) {
        for (i in 1..n){
            var startChar = 'A' + (n-i)
            for (j in 1..i) {
                print(startChar)
                startChar++
            }
            println()
        }
    }
}

fun main() {
    val print18 = Print18()
    print18.print18(5)
}