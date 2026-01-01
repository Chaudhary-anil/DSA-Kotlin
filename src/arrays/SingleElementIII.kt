package arrays

class SingleElementIII {
    fun findMultipleSingleElement(numArr: IntArray): IntArray {
        val uniqueElementArr = mutableSetOf<Int>()
        for (num in numArr) {
            if (uniqueElementArr.contains(num)) {
                uniqueElementArr.remove(num)
            }
            else {
                uniqueElementArr.add(num)
            }
        }
        return uniqueElementArr.toIntArray()
    }
}

fun main() {
    val singleElementIII = SingleElementIII()
    val numArr = intArrayOf(2,2,1,3,4,4,1,5,8)
    val result = singleElementIII.findMultipleSingleElement(numArr = numArr)
    println(result.contentToString())
}