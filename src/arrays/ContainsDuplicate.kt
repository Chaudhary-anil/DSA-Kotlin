package arrays

/*
    return true if any number is repeated in an array else false if not repeated
    if(duplicate)
        return true
    else
        return false
 */

class ContainsDuplicate {
    fun isContainDuplicate(num: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (i in num) {
            if (seen.contains(i)) {
                return true
            }
            seen.add(i)
        }
        return false
    }
}

fun main() {
    val containsDuplicate = ContainsDuplicate()
    val arrayNum = intArrayOf(1,2,3,1)
    val result = containsDuplicate.isContainDuplicate(num = arrayNum)
    println(result)
}