package mtw

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
            "1" -> println(Faction.factions)
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

// Создать список или map для всех фракций и осуществить вывод нужной по ключу (если map)

fun step3() {
    while (true) {
        print("1. Enter name faction: ")
        when (readln()) {
            Name.ENGLAND.factionName -> println(Faction.england)
            Name.FRANCE.factionName -> println(france)
            Name.THE_HOLY_ROMAN_EMPIRE.factionName -> println(theHolyRomanEmpire)
            Name.MILAN.factionName -> println(milan)
            Name.SICILY.factionName -> println(sicily)
            "" -> {
                return
            }
            else -> {
                println("Error. Please enter a valid value")
            }
        }
    }
}
