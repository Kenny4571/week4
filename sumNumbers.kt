fun main() {
    print("Enter a positive nonzero integer: ")
    val number = readLine()!!.toInt()
    var sum = 0
    for (i in 1..number) {
        sum += i
    }
    println("The sum of all integers from 1 to $number is $sum")
}
