package arrays

class FindDuplicateNumber {
    fun duplicateNumberFinder(numArr: IntArray): Int {
        val size = numArr.size
        for (i in 0 until size) {
            val index = Math.abs(numArr[i]) - 1
            if (numArr[index] < 0) {
                return Math.abs(numArr[i])
            }
            numArr[index] = -numArr[index]
        }
        return -1
    }
}

fun main() {
    val findDuplicateNumber = FindDuplicateNumber()
    val numArr = intArrayOf(3,1,3)
    val result = findDuplicateNumber.duplicateNumberFinder(numArr = numArr)
    println(result)
}