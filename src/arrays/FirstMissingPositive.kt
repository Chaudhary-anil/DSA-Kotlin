package arrays

class FirstMissingPositive {
    fun findMissingPositiveNumber(numArr: IntArray): Int {
        val n = numArr.size
        for (i in 0..< n) {
            if (numArr[i] <= 0 || numArr[i] > n) {
                numArr[i] = n + 1
            }
        }
        println("after n + 1 op: ${numArr.contentToString()}")

        for (i in 0..<n) {
            val value = Math.abs(numArr[i])
            if (value in 1..n) {
                val index = value - 1
                if (numArr[index] > 0) {
                    numArr[index] = -numArr[index]
                }
            }
        }

        for (i in 0..<n) {
            if (numArr[i] > 0) {
                return i + 1
            }
        }
        return n + 1
    }
}

fun main() {
    val firstMissingPositive = FirstMissingPositive()
    val numArr = intArrayOf(-1,5,0,2,3,1)
    val result = firstMissingPositive.findMissingPositiveNumber(numArr = numArr)
    println(result)
}




















