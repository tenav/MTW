package mtw

data class Region(
    val cityName: String,
    val cityType: String,
    val isCapital: Boolean = false
) {
    companion object {
        val predefinedRegions = mapOf(
            CityName.PARIS to Region(
                cityName = CityName.PARIS.cityName,
                cityType = CityType.LARGE_TOWN.cityType,
                isCapital = true
            )
        )
    }
}

enum class CityName(val cityName: String) {
    PARIS("Paris"),
    // ANGERS("Angers", CityType.WOODEN_CASTLE, false),
    // MARSEILLE("Marseille", CityType.TOWN, false),
    // RHEIMS("Rheims", CityType.TOWN, false),
    // TOULOUSE("Toulouse", CityType.CASTLE, false),
    // LONDON("London", CityType.LARGE_TOWN, true),
    // CAEN("Caen", CityType.CASTLE, false),
    // NOTTINGHAM("Nottingham", CityType.CASTLE, false),
    // FRANKFURT("Frankfurt", CityType.LARGE_TOWN, true),
    // BOLOGNA("Bologna", CityType.LARGE_TOWN, false),
    // INNSBRUCK("Innsbruck", CityType.WOODEN_CASTLE, false),
    // NUREMBURG("Nuremburk", CityType.TOWN, false),
    // STAUFEN("Staufen", CityType.WOODEN_CASTLE, false),
    // VIENNA("Vienna", CityType.LARGE_TOWN, false),
    // MILAN("Milan", CityType.MINOR_CITY, true),
    // GENOA("Genoa", CityType.MINOR_CITY, false),
    // PALERMO("Palermo", CityType.CASTLE, true),
    // NAPLES("Naples", CityType.LARGE_TOWN, false)
}

enum class CityType(val cityType: String) {
    LARGE_TOWN("Large Town"),
    TOWN("Town"),
    CASTLE("Castle"),
    WOODEN_CASTLE("Wooden Castle"),
    MINOR_CITY("Minor City")
}