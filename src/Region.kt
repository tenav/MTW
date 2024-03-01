data class Region(
    val cityName: String,
    val cityType: String,
    val isCapital: Boolean = false
)

enum class CityName (val cityName: String, val cityType: CityType, val isCapital: Boolean) {
    PARIS("Paris", CityType.LARGE_TOWN, true),
    ANGERS("Angers", CityType.WOODEN_CASTLE, false),
    MARSEILLE("Marseille", CityType.TOWN, false),
    RHEIMS("Rheims", CityType.TOWN, false),
    TOULOUSE("Toulouse", CityType.CASTLE, false),
    LONDON("London", CityType.LARGE_TOWN,true),
    CAEN("Caen",CityType.CASTLE, false),
    NOTTINGHAM("Nottingham",CityType.CASTLE, false),
    FRANKFURT("Frankfurt", CityType.LARGE_TOWN, true),
    BOLOGNA("Bologna", CityType.LARGE_TOWN, false),
    INNSBRUCK("Innsbruck", CityType.WOODEN_CASTLE, false),
    NUREMBURG("Nuremburk", CityType.TOWN, false),
    STAUFEN("Staufen", CityType.WOODEN_CASTLE, false),
    VIENNA("Vienna", CityType.LARGE_TOWN, false),
    MILAN("Milan", CityType.MINOR_CITY, true),
    GENOA("Genoa", CityType.MINOR_CITY, false),
    PALERMO("Palermo", CityType.CASTLE, true),
    NAPLES("Naples", CityType.LARGE_TOWN, false)
}

val england = Faction(
    Name.ENGLAND.factionName,
    BannerColor.RED_YELLOW.bannerColor,
    Culture.NORTHERN_EUROPE.culture,
    Religion.CATHOLIC.religion,
    listOf(
        Region(CityName.LONDON.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
        Region(CityName.CAEN.cityName, CityType.CASTLE.cityType, isCapital = false),
        Region(CityName.NOTTINGHAM.cityName, CityType.CASTLE.cityType, isCapital = false)
    ),
    purse = "10 000",
    strengths = Strengths.createDefaultStrengths().strengths[0],
    weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[0]
)

val france = Faction(
    Name.FRANCE.factionName,
    BannerColor.BLUE_YELLOW.bannerColor,
    Culture.WESTERN_EUROPE.culture,
    Religion.CATHOLIC.religion,
    listOf(
        Region(CityName.PARIS.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
        Region(CityName.ANGERS.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
        Region(CityName.MARSEILLE.cityName, CityType.TOWN.cityType, isCapital = false),
        Region(CityName.RHEIMS.cityName, CityType.TOWN.cityType, isCapital = false),
        Region(CityName.TOULOUSE.cityName, CityType.CASTLE.cityType, isCapital = false)
    ),
    purse = "8 000",
    strengths = Strengths.createDefaultStrengths().strengths[1],
    weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[1]
)
val theHolyRomanEmpire = Faction(
    Name.THE_HOLY_ROMAN_EMPIRE.factionName,
    BannerColor.BLACK_YELLOW.bannerColor,
    Culture.WESTERN_EUROPE.culture,
    Religion.CATHOLIC.religion,
    listOf(
        Region(CityName.FRANKFURT.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
        Region(CityName.BOLOGNA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
        Region(CityName.INNSBRUCK.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
        Region(CityName.NUREMBURG.cityName, CityType.TOWN.cityType, isCapital = false),
        Region(CityName.STAUFEN.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
        Region(CityName.VIENNA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false)
    ),
    purse = "6 000",
    strengths = Strengths.createDefaultStrengths().strengths[2],
    weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[2]
)

val Milan = Faction(
    Name.MILAN.factionName,
    BannerColor.GREEN_YELLOW.bannerColor,
    Culture.SOUTHERN_EUROPE.culture,
    Religion.CATHOLIC.religion,
    listOf(
        Region(CityName.MILAN.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
        Region(CityName.GENOA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
    ),
    purse = "6 000",
    strengths = Strengths.createDefaultStrengths().strengths[3],
    weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[3]
)

val Sicily = Faction(
    Name.SICILY.factionName,
    BannerColor.GREY_YELLOW.bannerColor,
    Culture.SOUTHERN_EUROPE.culture,
    Religion.CATHOLIC.religion,
    listOf(
        Region(CityName.PALERMO.cityName, CityType.CASTLE.cityType, isCapital = true),
        Region(CityName.NAPLES.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
    ),
    purse = "9 000",
    strengths = Strengths.createDefaultStrengths().strengths[4],
    weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[4]
)

enum class CityType (val cityType: String) {
    LARGE_TOWN ("Large Town"),
    TOWN ("Town"),
    CASTLE ("Castle"),
    WOODEN_CASTLE ("Wooden Castle"),
    MINOR_CITY ("Minor City")
}