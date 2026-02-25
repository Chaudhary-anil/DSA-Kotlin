package striversA2Zdsa.patterns

/*
    1             1
    1 2         2 1
    1 2 3     3 2 1
    1 2 3 4 4 3 2 1
 */
class Print12 {
    fun print12(n: Int) {
        var space = 2 * (n-1)
        for (i in 1..n) {
            for (j in 1..i) {
                print(j)
            }

            for (j in 1..space) {
                print(" ")
            }
            for (j in i downTo 1) {
                print(j)
            }
            println()
            space -= 2
        }
    }
}

fun main() {
    val print12 = Print12()
    print12.print12(4)
}