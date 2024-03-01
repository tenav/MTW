fun main() {
    while (true) {
        println("1. Faction\nEnter - Exit")
        when (readln()) {
            "1" -> step1()
            "" -> return
            else -> println("Error. Please enter a valid value")
        }
    }
}

fun step1() {
    while (true) {
        println("1. List all factions name\n2. Menu for changing factions\nEnter - Return")
        when (readln()) {
            "1" -> println("England, France, The Holy Roman Empire, Milan, Sicily")
            "2" -> step2()
            "" -> return
            else -> println("Error. Please enter a valid value")
        }
    }
}

fun step2() {
    while (true) {
        println("1. Faction detailed info\nEnter - Return")
        when (readln()) {
            "1" -> step3()
            "" -> return
            else -> println("Error. Please enter a valid value")
        }
    }
}

fun step3() {
    while (true) {
        print("1. Enter name faction: ")
        when (readln()) {
            "England" -> println(england)
            "France" -> println(france)
            "The Holy Roman Empire" -> println(theHolyRomanEmpire)
            "Milan" -> println(Milan)
            "Sicily" -> println(Sicily)
            "" -> {
                return
            }
            else -> {
                println("Error. Please enter a valid value")
            }
        }
    }
}

