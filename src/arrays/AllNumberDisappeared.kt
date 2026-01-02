package arrays

class AllNumberDisappeared {
    fun findAllNumber(numArr: IntArray, n: Int): IntArray {
        val set = numArr.toSet()
        val result = mutableSetOf<Int>()
        for (num in 1..n) {
            if (!set.contains(num)) {
                result.add(num)
            }
        }
        return result.toIntArray()
    }
}

fun main() {
    val allNumberDisappeared = AllNumberDisappeared()
    val arrNum = intArrayOf(1,3)
    val result = allNumberDisappeared.findAllNumber(numArr = arrNum, 5)
    println(result.contentToString())
}