package arrays

class AllDuplicateNumber {
    fun findAllDuplicateNumber(numArr: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        for (i in 0 until numArr.size) {
            val index = Math.abs(numArr[i]) - 1
            if (numArr[index] < 0) {
                result.add(Math.abs(numArr[i]))
                numArr[index] = 0
            }
            else if(numArr[index] > 0) {
                numArr[index] = -numArr[index]
            }
        }
        return result
    }
}

fun main() {
    val allDuplicateNumber = AllDuplicateNumber()
    val numArr = intArrayOf(1,1,2,3,3,1,1)
    val result = allDuplicateNumber.findAllDuplicateNumber(numArr = numArr)
    println(result)
}