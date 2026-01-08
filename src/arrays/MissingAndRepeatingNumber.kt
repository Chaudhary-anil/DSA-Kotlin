package arrays

// missing and repeating number

class MissingAndRepeatingNumber {
    fun findMissingAndRepeatingNumber(numArr: IntArray) {
        val n = numArr.size
        var repeatingNumber = -1
        for (i in 0..<n) {
            val index = Math.abs(numArr[i]) - 1
            if (numArr[index] < 0) {
                repeatingNumber = Math.abs(numArr[i])
            } else {
                numArr[index] = -numArr[index]
            }
        }
        println(numArr.contentToString())
        println("repeating number: $repeatingNumber")
        var missingNumber: Int = -1
        for (i in 0..<n) {
            if (numArr[i] > 0) {
                missingNumber = i + 1
                break
            }
        }

        println("missing number: $missingNumber")
    }
}

fun main() {
    val missingAndRepeatingNumber = MissingAndRepeatingNumber()
    val numArr = intArrayOf(1,3,4,5,1)
    missingAndRepeatingNumber.findMissingAndRepeatingNumber(numArr = numArr)
}