package striversA2Zdsa.patterns

/*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */

class Print13 {
    fun print13(n: Int) {
        var counter = 1
        for (i in 1..n) {
            for (j in 1..i){
                print("$counter ")
                counter++
            }
            println()
        }
    }
}

fun main() {
    val print13 = Print13()
    print("Enter number of testCase: ")
    val testCase = readln().toInt()
    for (i in 1..testCase) {
        print("Enter value for row: ")
        val rowValue = readln().toInt()
        print13.print13(rowValue)
    }
}