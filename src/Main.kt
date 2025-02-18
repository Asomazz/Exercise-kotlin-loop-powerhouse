import java.security.Principal
import kotlin.collections.listOf as listOf1

fun main() {
   countUpwards(5, 7)
    countDownwards(3, 1)
    val numbers = intArrayOf(1,2,3)
    println("${calculateSum(numbers)}")
    checkEvenOdd(10)
    println("Factorial is: ${calculateFactorial(3)}")

    //Bonus
   askForNumber(9)

}

fun countUpwards(start: Int, end: Int) {
    for(number in start..end) println(number)
}

fun countDownwards(end: Int, start: Int) {
    var number = end
    while(number >= start){
        println(number)
        number--
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum: Int = 0
    for(number in numbers) {
        sum += number
    }
    return sum
}

fun checkEvenOdd(number: Int): Unit {

    var evenNumbers = mutableListOf<Int>()
    var oddNumbers = mutableListOf<Int>()

    for (i in 1..number){
        if (i % 2 == 0) {
            evenNumbers.add(i)
        } else {
            oddNumbers.add(i)
        }
    }

    println("Under the number $number, even numbers are:$evenNumbers , odd numbers are:$oddNumbers ")
}

fun calculateFactorial(number: Int): Long {

    var factorial: Long = 1

    for (i in 1..number){
        factorial *= i
    }

    return factorial
}

//Bonus

//fun askForNumber() {
//    var number: Int
//    do {
//        println("Please enter a number (Enter 7 to exit):")
//        readLine(number)
//    } while (number!=7) println("Exiting..")
//    }