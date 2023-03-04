fun main() {
    print("Enter a string: ")
    val inputString = readLine()!!
    print("Enter a character to count: ")
    val charToCount = readLine()!!.first()
    val count = inputString.count { it == charToCount }
    println("The character '$charToCount' appears $count times in the string '$inputString'")
}
