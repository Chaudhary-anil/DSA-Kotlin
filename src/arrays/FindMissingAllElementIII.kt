package arrays

import kotlin.math.abs

class FindMissingAllElementIII {
    fun findMissingElementIIII(numArr: IntArray): List<Int> {
         val n = numArr.size
        for (i in 0..<n) {
            val index = abs(numArr[i]) - 1
            if (numArr[index] > 0) {
                numArr[index] = -numArr[index]
            }
        }
        val result = mutableListOf<Int>()
        for (i in 0..<n) {
            if (numArr[i] > 0) {
                result.add(i + 1)
            }
        }
        return result
    }
}

fun main() {
    val findMissingAllElementIII = FindMissingAllElementIII()
    val numArr = intArrayOf(4,-3,2,7,8,2,3,1)
    val result = findMissingAllElementIII.findMissingElementIIII(numArr = numArr)
    println(result)
}