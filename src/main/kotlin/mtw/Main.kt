package mtw

data class Input(var line: String? = null)
// В данном случае ключом является свойство line, а значением является строка, которая представляет пользовательский ввод.

fun main() {
    while (true) {
        println("1. Faction\n2. Start a company\nEnter - Exit")
        when (readln()) {
            "1" -> step1()
            "2" -> step3(Input())
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
/*
entries является методом, который используется для преобразования коллекции в набор пар ключ - значение, где каждая
пара представляет собой отдельную фракцию в виде ключ - значение. Этот набор пар ключ - значения может быть использован
для итерации. Итерацией является перебор всех элементов в коллекции.
jointToString - это функция, которая объединаяет значении коллекции в одну строку.
 */

fun printAllFactionInfo() {
    println(
        Faction.predefinedFactions.entries.joinToString(
            // Функция jointToString объединяет элементы коллекции в одну строку с заданным разделителем.
            separator = "\n***************************\n",
            // Это параметр, где указывается разделитель между элементами коллекции.
            prefix = "\n",
            // Это параметр, где указывается префикс, добавляемый к результирующей строки.
        ) { it.value.toString() }
        // Это лямбда выражение, которое преобразует каждую пару ключ значение из коллекции в строку.
    )
}

fun printFactionInfo(input: Input) {
    /*
    Функция принимает в качестве парамерта объект input типа mtw.Input. Этот объект будет содержать введеное
    пользователем название фракции. Когда передаем в качестве аргумента функции экземпляр mtw.Input, предоставляем
    функции доступ к данным в этом экземпляре.
     */
    print("1. Enter name faction: ")
    input.line = readLine()
    // Введеная строка будет сохранена в свойство line объекта input.

    if (input.line.isNullOrBlank()) {
        // Метод isNullOrBlank проверяет, является ли строка пустой или равной Null.
        throw IllegalArgumentException("Faction name cannot be blank")
        // Если строка input.line пуста или равна Null будет выброшено исключение.
    }

    val faction = try {
        /*
        Переменная faction будет содержать результат выполнения кода внутри try или значение, которое возникает из
        блока catch.
         */
        FactionName.valueOf(input.line!!)
        /*
        Faction.Name перечисление из enum класса.
        valueOf - это статический метод, который используется для получения экземпляра константы по ее строковому
        представлению. Если строковое значение input.line соответствует имени константы в FactionName, valueOf
        возвращает этот экземпляр константы. Знак "!!" является оператором принудительного вызова, который игнорирует
        возможные выбросы NullPointerException.
         */
    } catch (ex: Exception) {
        println("Faction '${input.line}' not found")
        return
    }
    println("\n${Faction.predefinedFactions[faction]}")
}

fun step3(input: Input) {
    /*
    (input: Input) - параметр функции step3.
    input - это имя параметра, которое будет использоваться внутри функции для обращения к переданному объекту типа Input.
    Input - это тип данных параметра. В данном случае, это класс Input.
     */
    while (true) {
        println("Select a faction from the list:")
        factions.forEachIndexed { index, faction ->
            println("${index + 1}. ${faction.factionName}")
        }
        /*
        factions.forEachIndexed { index, faction -> ... } - это конструкция, которая выполняет итерацию по списку
        factions и позволяет выполнить определенное действие для каждого элемента списка.
        factions: это список фракций, по которому мы хотим выполнить итерацию.

        forEachIndexed { index, faction -> ... }: это функция высшего порядка (higher-order function), которая применяет
        заданную операцию к каждому элементу списка factions. Здесь forEachIndexed принимает два параметра:
        index: это индекс текущего элемента в списке.
        faction: это сам элемент списка, т.е., объект фракции.
        Таким образом, внутри блока { ... } мы можем использовать index для получения текущего индекса элемента и
        faction для получения самого элемента, то есть объекта фракции.
        Далее, внутри этого блока, мы выполняем операции с каждым элементом списка. В данном случае, мы используем
        println("${index + 1}. ${faction.factionName}") для вывода порядкового номера фракции (увеличиваем индекс на 1,
        так как индексация начинается с 0) и ее названия.
        Таким образом, этот код позволяет перечислить все фракции из списка factions, отображая их порядковые
        номера и названия.
         */

        println("Enter the name of the selected faction:")
        input.line = readLine()

        userChoices = factions.find { it.factionName.equals(input.line, ignoreCase = true) }
        /*
        С помощью функции find ищем первый элемент списка factions, который соответствует условию внутри фигурных скобок.
        it - ключевое слово, которое является неявным именем для единственного параметра лямбда-выражения.
        it.factionName - обращение к свойству factionName объекта, на который указывает it.
        equals() - это метод, для сравнения строки factionName объекта (it.factionName) с введеноой пользователем
        строкой (input.line).
        Параметр ignoreCase = true указывает на то, что сравнение должно производиться без учета регистра символов.

        Таким образом, это лямбда-выражение сравнивает factionName каждого элемента в списке с введенной пользователем
        строкой без учета регистра символов и возвращает true, если они равны, и false в противном случае.
         */
        if (userChoices != null) {
            computerChoices = factions.filter { it != userChoices }
            /*
            Создается новый список из фракций, которые не совпадают с userChoices.
            computerChoices - это список фракций, за которые компьютер будет играть, который был предварительно
            отфильтрован.
            filter { } - функция высшего порядка, которая возвращает новый список, содеращий только те элементы из
            исходного списка, для которых лямбда - выражение возвращает true.
            { it != userFaction } - это лямбда-выражение, которое принимает каждый элемент списка factions
            (обозначаемый как it) и проверяет, не равен ли он выбранной пользователем фракции (userChoices). Если
            элемент не равен userChoices, то он остается в новом списке, иначе он исключается из него.
             */
            println("Move No. 1")
            println("You choosed: ${userChoices!!.factionName}")
            println(
                "Purse: ${
                    Faction.predefinedFactions.values.find {
                        it.name.equals(
                            input.line,
                            ignoreCase = true
                        )
                    }?.purse
                }"
            )
            /*
            values - это метод, применяемый к Faction.predefinedFactions, который возвращает коллекцию всех значений
            (фракций) из словаря (или мапы) predefinedFactions. В данном случае, Faction.predefinedFactions представляет
            собой словарь, где ключами являются идентификаторы фракций, а значениями - сами фракции.
            find { ... }: Проходится по каждому элементу коллекции и проверяет условие внутри фигурных скобок.
            it.name.equals(input.line, ignoreCase = true): Для каждой фракции проверяет, равно ли значение свойства
            name (имя фракции), введенное пользователем через input.line, игнорируя при этом регистр символов.
            ?.purse: Если условие в блоке find выполняется для какой-то фракции, то возвращает свойство purse этой
            фракции. Здесь ?. обеспечивает безопасный вызов, чтобы избежать ошибок в случае, если ни одна фракция не
            удовлетворяет условию.

            Таким образом, этот код позволяет найти фракцию по введенному пользователем имени (игнорируя регистр
            символов) и вывести значение её кошелька (purse). Если ни одна фракция не соответствует введенному имени,
            будет выведено null.
             */
            println("****************")
            println("The computer will play as:")
            computerChoices.forEach { factionComputer ->
                Faction.predefinedFactions[factionComputer]?.let {
                    println("${it.name} \nPurse: ${it.purse}\n****************")
                }
            }
            /*
            forEach - это функция высшего порядка (higher-order function), которая выполняет указанное действие для
            каждого элемента списка.
            factionComputer - это переменная, которая используется в качестве параметра для лямбда-выражения в коде.
            В данном контексте faction представляет собой каждый элемент списка computerChoices, который перебирается
            в цикле forEach. То есть, на каждой итерации цикла factionComputer будет ссылаться на текущий элемент списка
            computerChoices. В данном коде factionComputer используется для доступа к объекту Faction из предопределенного
            списка фракций и вывода информации о нем.

            Faction.predefinedFactions[factionComputer]: Этот код получает значение типа Faction? (фракции) из списка
            предопределенных фракций по ключу factionComputer.
            Метод predefinedFactions возвращает фракцию (Faction), соответствующую ключу factionComputer.

            ?.let { ... }: Это оператор безопасного вызова (safe call operator). Он позволяет безопасно
            вызывать методы или обращаться к свойствам объекта, проверяя наличие значения объекта перед обращением к
            нему. Если значение объекта не является null, то выполняется блок кода внутри let, где it представляет
            собой полученный объект. Если значение объекта равно null, то блок кода внутри let не выполняется.
             */
        } else {
            println("Invalid input. Please select a faction from the list")
            continue
        }
    }
}