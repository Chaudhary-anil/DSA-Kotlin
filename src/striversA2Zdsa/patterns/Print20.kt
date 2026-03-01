package striversA2Zdsa.patterns

class Print20 {
    fun print20(n: Int) {
        for(i in 1..<2*n){
            var col = 0
            col = if (i<=n) {
                i
            } else {
                2 * n - i
            }
            //star
            for (j in 1..col) {
                print("*")
            }
            //space
            for (i in 1..2 * n - 2 * col) {
                print(" ")
            }
            //star
            for (i in 1..col) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val print20 = Print20()
    print20.print20(5)
}
