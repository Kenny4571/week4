fun main() {
    val sales = mutableListOf<Int>()

    for (i in 1..5) {
        print("Enter today's sales for store $i: ")
        val todaySales = readLine()!!.toInt()
        sales.add(todaySales)
    }

    println()

    for (i in 1..5) {
        print("Store $i: ")
        repeat(sales[i - 1] / 100) { print("*") }
        println()
    }
}
