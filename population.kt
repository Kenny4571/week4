fun main() {
    print("Enter the starting population: ")
    var population = readLine()!!.toInt()

    while (population < 2) {
        print("Starting population must be greater than or equal to 2. Enter a valid value: ")
        population = readLine()!!.toInt()
    }

    print("Enter the average daily population increase as a percentage (e.g., 50): ")
    var increasePercentage = readLine()!!.toDouble()

    while (increasePercentage < 0) {
        print("Daily increase percentage cannot be negative. Enter a valid value: ")
        increasePercentage = readLine()!!.toDouble()
    }

    print("Enter the number of days they will multiply: ")
    var daysToMultiply = readLine()!!.toInt()

    while (daysToMultiply < 1) {
        print("Number of days to multiply must be greater than or equal to 1. Enter a valid value: ")
        daysToMultiply = readLine()!!.toInt()
    }

    for (i in 1..daysToMultiply) {
        population += (population * (increasePercentage / 100)).toInt()
        println("Population after day $i: $population")
    }
}
