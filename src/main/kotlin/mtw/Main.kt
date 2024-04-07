import mtw.Faction
import mtw.FactionName

data class Input(var line: String? = null)
// в данном случае ключом является свойство line, а значением является строка,
// которая представляет пользовательский ввод

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
            "1" -> printAllFactionNames()
            "2" -> step2()
            "" -> return
            else -> println("Error. Please enter a valid value")
        }
    }
}

fun step2() {
    while (true) {
        println("1. Faction detailed info\n2. Print faction info\nEnter - Return")
        when (readln()) {
            "1" -> printAllFactionInfo()
            "2" -> printFactionInfo(Input())
            "" -> return
            else -> println("Error. Please enter a valid value")
        }
    }
}

fun printAllFactionNames() {
    println(Faction.predefinedFactions.entries.joinToString { it.value.name })
}
// entries является методом, который используется для преобразования коллекции в набор пар ключ - значение, где каждая пара представляет
// собой отдельную фракцию в виде ключ - значение. Этот набор пар ключ - значения может быть использован для итерации
// итерацией является перебор всех элементов в коллекции
// jointToString - это функция, которая объединаяет значении коллекции в одну строку

fun printAllFactionInfo() {
    println(
        Faction.predefinedFactions.entries.joinToString(
            // функция jointToString объединяет элементы коллекции в одну строку с заданным разделителем
            separator = "\n***************************\n",
            // это параметр, где указывается разделитель между элементами коллекции
            prefix = "\n",
            // это параметр, где указывается префикс, добавляемый к результирующей строки
        ) { it.value.toString() }
        // это лямбда выражение, которое преобразует каждую пару ключ значение из коллекции в строку
    )
}

fun printFactionInfo(input: Input) {
    // функция принимает в качестве парамерта объект input типа Input. Этот объект будет содержать введеное
    // пользователем название фракции. Когда мы передаем в качестве аргумента функции экземпляр Input,
    // мы предоставляем функции доступ к данным в этом экземпляре
    print("1. Enter name faction: ")
    input.line = readLine()
    // введеная строка будет сохранена в свойство line объекта input

    if (input.line.isNullOrBlank()) {
        // метод isNullOrBlank проверяет, является ли строка пустой или равной Null
        throw IllegalArgumentException("Faction name cannot be blank")
        // если строка input.line пуста или равна Null будет выброшено исключение
    }

    val faction = try {
        // переменная faction будет содержать результат выполнения кода внутри try или значение,
        // которое возникает из блока catch
        FactionName.valueOf(input.line!!)
        // Faction.Name перечисление из enum класса
        // valueOf - это статический метод, который используется для получения экземпляра константы по ее строковому представлению.
        // если строковое значение input.line соответствует имени константы в FactionName, valueOf возвращает этот экземпляр константы
        // знак "!!" является оператором принудительного вызова, который игнорирует возможные выбросы NullPointerException
    } catch (ex: Exception) {
        println("Faction '${input.line}' not found")
        return
    }
    println("\n${Faction.predefinedFactions[faction]}")
}