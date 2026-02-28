package striversA2Zdsa.patterns

/*
       A
      ABA
     ABCBA
    ABCDCBA
 */
class Print17 {
    fun print17(n: Int) {
        for (i in 1..n) {
            //space
            for (j in 1..n-i) {
                print(" ")
            }
            //char
            var startChar = 'A'
            for (j in 1..<2*i) {
                print(startChar)
                if (j < i) startChar++
                else startChar--
            }
            println()
        }
    }
}

fun main() {
    val print17 = Print17()
    print17.print17(4)
}