package arrays

// 4, 1, 5, 2

class BestTimeToBuySellStockII {
    fun totalProfit(priceArray: IntArray): Int {
        var profit = 0
        for (i in 1..<priceArray.size) {
            if (priceArray[i] > priceArray[i - 1]) {
                profit += priceArray[i] - priceArray[i -1]
            }
        }
        return profit
    }
}

fun main() {
    val bestTimeToBuySellStockII = BestTimeToBuySellStockII()
    val priceArray = intArrayOf(7,1,5,3,6,4)
    val priceArray1 = intArrayOf(1,2,3,4,5)
    val result = bestTimeToBuySellStockII.totalProfit(priceArray = priceArray)
    val result1 = bestTimeToBuySellStockII.totalProfit(priceArray = priceArray1)
    println(result)
    println(result1)
}