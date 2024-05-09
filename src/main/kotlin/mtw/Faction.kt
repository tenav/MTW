package mtw

class Faction(
    val name: String,
    val bannerColor: String,
    val culture: String,
    val religion: String,
    val regions: List<Region>,
    val purse: Int,
    val strengths: String,
    val weaknesses: String,
    val units: List<MtwUnit?>,
    // содержит список, элементами которого являются списки объектов типа Unit
) {

    override fun toString(): String {
        return """
            Faction name: $name
            Banner color: $bannerColor
            Culture: $culture
            Religion: $religion
            Capital: ${regions.find { it.isCapital }?.name} - ${regions.find { it.isCapital }?.type?.type}
            Provinces: ${
            regions.filter { !it.isCapital }.joinToString(separator = ", ") { "${it.name} - ${it.type.type}" }
        } 
            Purse: $purse
            Strengths: $strengths
            Weaknesses: $weaknesses
            Units: ${units.map { it?.name?.unitsName }.joinToString(separator = ", ")}
        """.trimMargin()
        /*
        Функция find принимает лямбда-выражение в качестве аргумента. find будет возвращать первый элемент из списка
        regions для которого условие isCapital истинно. { it.isCapital } является условием поиска.
        ?.name - оператор безопасного вызова. Если результат метода find не будет равен null, то будет вызвано
        свойство name этого результата.
        Если результат метода find будет равен null, вызов свойства name будет пропущен.
        ?.type?.type - используется оператор ?. безопасного вызова с цепочкой.

        { !it.isCapital } - "!" означает отрицание. Следовательно, условие !it.isCapital будет истинным (true), когда
        it.isCapital имеет значение false. Это выражение фильтрует все элементы, для которых isCapital не равен true,
        то есть отбрасывает столицы, и выбирает только регионы не являющиеся столицами.
        Метод joinToString объединяет отфильтрованные элементы в одну строку с помощью определенного разделителя.
         */
    }

    companion object {
        val predefinedFactions = mapOf(
            FactionName.ENGLAND to Faction(
                name = FactionName.ENGLAND.factionName,
                bannerColor = BannerColor.RED_YELLOW.bannerColor,
                culture = Culture.NORTHERN_EUROPEAN.culture,
                religion = Religion.Catholic.toString(),
                regions = listOf(
                    Region.predefinedRegions[RegionName.London]!!,
                    Region.predefinedRegions[RegionName.Caen]!!,
                    Region.predefinedRegions[RegionName.Nottingham]!!
                ),
                // requireNotNull - функция библеотеки Kotlin, которая используется для проверки значения на Null
                purse = 10000,
                strengths = "Boasts superb longbowmen and strong infantry",
                weaknesses = "Fields a poor variety of cavalry",
                units = listOf(
                    MtwUnit.predefinedUnits[UnitsName.YEOMAN_ARCHERS]!!,
                    MtwUnit.predefinedUnits[UnitsName.SHERWOOD_ARCHERS]!!
                    // UnitsName.SHERWOOD_ARCHERS - является ключем с типом UnitsName
                    // MtwUnit.predefinedUnits - является значением с типом MtwUnit
                )
            ),

//            FactionName.FRANCE to Faction(
//                name = FactionName.FRANCE.factionName,
//                bannerColor = BannerColor.BLUE_YELLOW.bannerColor,
//                culture = Culture.NORTHERN_EUROPEAN.culture,
//                religion = Religion.Catholic.toString(),
//                regions = listOf(
//                    Region.predefinedRegions[RegionName.Paris]!!,
//                    Region.predefinedRegions[RegionName.Angers]!!,
//                    Region.predefinedRegions[RegionName.Marseille]!!,
//                    Region.predefinedRegions[RegionName.Rheims]!!,
//                    Region.predefinedRegions[RegionName.Toulouse]!!
//                ),
//                purse = 8000,
//                strengths = "Fields the best heavy cavalry in the west, and good infantry in the late period",
//                weaknesses = "Relatively weak infantry in early period",
//                units = listOf()
//            ),
//
//            FactionName.THE_HOLY_ROMAN_EMPIRE to Faction(
//                name = FactionName.THE_HOLY_ROMAN_EMPIRE.factionName,
//                bannerColor = BannerColor.BLACK_YELLOW.bannerColor,
//                culture = Culture.NORTHERN_EUROPEAN.culture,
//                religion = Religion.Catholic.toString(),
//                regions = listOf(
//                    Region.predefinedRegions[RegionName.Frankfurt]!!,
//                    Region.predefinedRegions[RegionName.Bologna]!!,
//                    Region.predefinedRegions[RegionName.Innsbruck]!!,
//                    Region.predefinedRegions[RegionName.Nuremburg]!!,
//                    Region.predefinedRegions[RegionName.Staufen]!!,
//                    Region.predefinedRegions[RegionName.Vienna]!!
//                ),
//                purse = 6000,
//                strengths = "Strong all-round",
//                weaknesses = "Lacks the later period professional armies of England and France",
//                units = listOf()
//            ),
//
//            FactionName.MILAN to Faction(
//                name = FactionName.MILAN.factionName,
//                bannerColor = BannerColor.GREEN_YELLOW.bannerColor,
//                culture = Culture.SOUTHERN_EUROPEAN.culture,
//                religion = Religion.Catholic.toString(),
//                regions = listOf(
//                    Region.predefinedRegions[RegionName.Milan]!!,
//                    Region.predefinedRegions[RegionName.Genoa]!!
//                ),
//                purse = 6000,
//                strengths = "Boasts strong militia infantry, crossbowmen and late technology",
//                weaknesses = "Poor offensive cavalry",
//                units = listOf()
//            ),
//
//            FactionName.SICILY to Faction(
//                name = FactionName.SICILY.factionName,
//                bannerColor = BannerColor.GREY_YELLOW.bannerColor,
//                culture = Culture.SOUTHERN_EUROPEAN.culture,
//                religion = Religion.Catholic.toString(),
//                regions = listOf(
//                    Region.predefinedRegions[RegionName.Palermo]!!,
//                    Region.predefinedRegions[RegionName.Naples]!!
//                ),
//                purse = 9000,
//                strengths = "Can field strong militia, Norman knights and Muslim archers",
//                weaknesses = "Lacks good late period cavalry",
//                units = listOf()
//            ),
            FactionName.EGYPT to Faction(
                name = FactionName.EGYPT.factionName,
                bannerColor = BannerColor.LIGHT_BROWN.bannerColor,
                culture = Culture.MIDDLE_EASTERN.culture,
                religion = Religion.Islam.toString(),
                regions = listOf(
                    Region.predefinedRegions[RegionName.Cairo]!!,
                    Region.predefinedRegions[RegionName.Alexandria]!!,
                    Region.predefinedRegions[RegionName.Gaza]!!
                ),
                purse = 8000,
                strengths = "Relies on powerful cavalry, particularly the Mamluks",
                weaknesses = "Lacks heavy infantry, particularly in the late period",
                units = listOf(
                    MtwUnit.predefinedUnits[UnitsName.TABARDARIYYA]!!
                )
            ),
            FactionName.RUSSIA to Faction(
                name = FactionName.RUSSIA.factionName,
                bannerColor = BannerColor.DARK_BLUE.bannerColor,
                culture = Culture.EASTERN_EUROPEAN.culture,
                religion = Religion.Orthodox.toString(),
                regions = listOf(
                    Region.predefinedRegions[RegionName.Novgorod]!!
                ),
                purse = 11000,
                strengths = "Has a great mix of missile and melee cavalry",
                weaknesses = "Poor early infantry and missile units",
                units = listOf(
                    MtwUnit.predefinedUnits[UnitsName.TSARS_GUARD]!!
                )
            )
        )
    }
}

enum class FactionName(val factionName: String) {
    ENGLAND("England"),
    FRANCE("France"),
    THE_HOLY_ROMAN_EMPIRE("The Holy Roman Empire"),
    MILAN("Milan"),
    SICILY("Sicily"),
    EGYPT("Egypt"),
    RUSSIA("Russia")
}

val factions = Faction.predefinedFactions.keys
var userChoice: FactionName? = null
var computerChoices: List<FactionName> = listOf()