package arrays

//finding missing number
class Practice {
    fun findMissingNumber(numArr: IntArray) {
        val n = numArr.size
        val expectedSum = n * (n + 1) / 2
        var actualSum = 0
        for (i in numArr.indices) {
            actualSum += numArr[i]
        }
        val result = expectedSum - actualSum
        println("missing element: $result")
    }
}

fun main() {
    val practice = Practice()
    val numArr = intArrayOf(0,1,3)
    practice.findMissingNumber(numArr = numArr)
}