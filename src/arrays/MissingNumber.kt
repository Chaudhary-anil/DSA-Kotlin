package arrays

/*
    MissingNumber(0 to n)

    Given an array num from (0 to n). return the number that is missing in range.

    Approach:
        expectedSum = n(n+1) / 2
        actualSum = loop through array
        missingNumber = expectedSum - actualSum
 */

class MissingNumber{
    fun findMissingNumber(numArray: IntArray): Int {
        val n = numArray.size
        val expectedSum = n * (n + 1) / 2
        var actualSum = 0
        for (num in numArray) {
            actualSum += num
        }
        val missingNumber = expectedSum - actualSum
        return missingNumber
    }

    fun findMissingNumberUsingXor(numArray: IntArray): Int {
        var xorAll = 0
        for (i in numArray.indices) {
            xorAll = xorAll xor i xor numArray[i]
        }
        xorAll = xorAll xor numArray.size
        return xorAll
    }
}

fun main() {
    val missingNumber = MissingNumber()
    val numArr = intArrayOf(3,0,1,2,5)
    val result = missingNumber.findMissingNumberUsingXor(numArray = numArr)
    println(result)
}