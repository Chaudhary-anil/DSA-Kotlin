package striversA2Zdsa.patterns

/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
class Eleven {
    fun elevenPattern(rowValue: Int) {
        var start = 1
        for (i in 0 until rowValue) {
            start = if (i % 2 == 0) {
                1
            } else {
                0
            }
            for (j in 0..i) {
                print(start)
                start = 1 - start
            }
            println()
        }
    }
}

fun main() {
    val eleven = Eleven()
    eleven.elevenPattern(5)
}