fun main() {

    println("--- Parking Fee Calculator ---")
    println("> the first 5 hours are billed at \$1 per hour.")
    println("> after that, each hour is billed at \$0.5 per hour.")
    println("> for each 24 hours, there is a flat fee of \$15.")
    println("============================================================")
    print("Enter the number of hours: ")
    val hours = readLine()!!.toInt()

    println("Your Parking Fee is \$" + calculateParkingFee(hours))
}
fun calculateParkingFee(hours: Int): Double {
    val total: Double
    var billed = 0.0
    var fullDay = 0
    if (hours <= 5){
        billed = 1.0 * hours
    } else if (hours in 6..24){
        billed = 5 + ((hours - 5) * 0.5)
    }else if (hours > 24){
        billed = (hours % 24) * 0.5
        fullDay = 15 * (hours / 24)
    }
    total = fullDay + (billed)
    return total
}