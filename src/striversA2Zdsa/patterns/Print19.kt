package striversA2Zdsa.patterns

class Print19 {
    fun print19(n: Int) {
        for(i in 1..2*n) {
            if (i <= n) { // i => 1..5
                //star
                for (j in 1..n-i+1) {
                    print("*")
                }
                //space
                for (j in 1 ..(2 + i - 3) * 2) {
                    print(" ")
                }
                //star
                for (j in 1..n-i+1) {
                    print("*")
                }
            }
            else {
                // i => 6..10
                //star
                for (j in 1..i-n) {
                    print("*")
                }
                //space
                for (j in 1..4*n - 2 * i) {
                    print(" ")
                }
                //star
                for (j in 1..i-n) {
                    print("*")
                }
            }
            println()
        }
    }
}

fun main() {
    val print19 = Print19()
    print19.print19(5)
}