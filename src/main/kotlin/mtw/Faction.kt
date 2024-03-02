package mtw

data class Faction(
    val name: String,
    val bannerColor: String,
    val culture: String,
    val religion: String,
    val region: List<Region>,
    val purse: Int,
    val strengths: String,
    val weaknesses: String
) {
    override fun toString(): String {
        val cityString = region.joinToString (", ") {
            "${it.cityName} - ${it.cityType}${if (it.isCapital) " (Capital)" else ""}"
        }
        return "Faction name: $name\n" +
                "Banner color: $bannerColor\n" +
                "Culture: $culture\n" +
                "Religion: $religion\n" +
                "Region: $cityString\n" +
                "Purse: ${purse}\n" +
                "Strengths: $strengths\n" +
                "Weaknesses: $weaknesses"
    }

    companion object {
        val england = Faction(
            Name.ENGLAND.factionName,
            BannerColor.RED_YELLOW.bannerColor,
            Culture.NORTHERN_EUROPE.culture,
            Religion.CATHOLIC.religion,
            listOf(
//                Region(CityName.LONDON.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
//                Region(CityName.CAEN.cityName, CityType.CASTLE.cityType, isCapital = false),
//                Region(CityName.NOTTINGHAM.cityName, CityType.CASTLE.cityType, isCapital = false)
            ),
            purse = 10000,
            strengths = "Boasts superb longbowmen and strong infantry",
            weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[0]
        )

        val france = Faction(
            Name.FRANCE.factionName,
            BannerColor.BLUE_YELLOW.bannerColor,
            Culture.WESTERN_EUROPE.culture,
            Religion.CATHOLIC.religion,
            listOf(
//                Region.predefinedRegions[CityName.PARIS],
//                Region.predefinedRegions[CityName.ANGER],
//                Region(CityName.PARIS.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
//                Region(CityName.ANGERS.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
//                Region(CityName.MARSEILLE.cityName, CityType.TOWN.cityType, isCapital = false),
//                Region(CityName.RHEIMS.cityName, CityType.TOWN.cityType, isCapital = false),
//                Region(CityName.TOULOUSE.cityName, CityType.CASTLE.cityType, isCapital = false)
            ),
            purse = 8000,
            strengths = Strengths.createDefaultStrengths().strengths[1],
            weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[1]
        )

        val theHolyRomanEmpire = Faction(
            Name.THE_HOLY_ROMAN_EMPIRE.factionName,
            BannerColor.BLACK_YELLOW.bannerColor,
            Culture.WESTERN_EUROPE.culture,
            Religion.CATHOLIC.religion,
            listOf(
//                Region(CityName.FRANKFURT.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
//                Region(CityName.BOLOGNA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
//                Region(CityName.INNSBRUCK.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
//                Region(CityName.NUREMBURG.cityName, CityType.TOWN.cityType, isCapital = false),
//                Region(CityName.STAUFEN.cityName, CityType.WOODEN_CASTLE.cityType, isCapital = false),
//                Region(CityName.VIENNA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false)
            ),
            purse = 6000,
            strengths = Strengths.createDefaultStrengths().strengths[2],
            weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[2]
        )

        val milan = Faction(
            Name.MILAN.factionName,
            BannerColor.GREEN_YELLOW.bannerColor,
            Culture.SOUTHERN_EUROPE.culture,
            Religion.CATHOLIC.religion,
            listOf(
//                Region(CityName.MILAN.cityName, CityType.LARGE_TOWN.cityType, isCapital = true),
//                Region(CityName.GENOA.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
            ),
            purse = 6000,
            strengths = Strengths.createDefaultStrengths().strengths[3],
            weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[3]
        )

        val sicily = Faction(
            Name.SICILY.factionName,
            BannerColor.GREY_YELLOW.bannerColor,
            Culture.SOUTHERN_EUROPE.culture,
            Religion.CATHOLIC.religion,
            listOf(
//                Region(CityName.PALERMO.cityName, CityType.CASTLE.cityType, isCapital = true),
//                Region(CityName.NAPLES.cityName, CityType.LARGE_TOWN.cityType, isCapital = false),
            ),
            purse = 9000,
            strengths = Strengths.createDefaultStrengths().strengths[4],
            weaknesses = Weaknesses.createDefaultWeaknesses().weaknesses[4]
        )

        val factions = listOf(
            england,
            france,
            theHolyRomanEmpire,
            milan,
            sicily
        )
    }
}

enum class Name (val factionName: String) {
    ENGLAND ("England"),
    FRANCE ("France"),
    THE_HOLY_ROMAN_EMPIRE ("The Holy Roman Empire"),
    MILAN ("Milan"),
    SICILY ("Sicily")
}

enum class BannerColor (val bannerColor: String) {
    RED_YELLOW ("Red Yellow"),
    BLUE_YELLOW ("Blue Yellow"),
    BLACK_YELLOW ("Black Yellow"),
    GREEN_YELLOW ("Green Yellow"),
    GREY_YELLOW ("Grey Yellow")
}

data class Strengths(val strengths: List<String>) {
    companion object {
        fun createDefaultStrengths(): Strengths = Strengths(
            listOf(
                "Boasts superb longbowmen and strong infantry",
                "Fields the best heavy cavalry in the west, and good infantry in the late period",
                "Strong all-round",
                "Boasts strong militia infantry, crossbowmen and late technology",
                "Can field strong militia, Norman knights and Muslim archers"
            )
        )
    }
}

data class Weaknesses(val weaknesses: List<String>) {
    companion object {
        fun createDefaultWeaknesses(): Weaknesses = Weaknesses(
            listOf(
                "Fields a poor variety of cavalry",
                "Relatively weak infantry in early period",
                "Lacks the later period professional armies of England and France",
                "Poor offensive cavalry",
                "Lacks good late period cavalry"
            )
        )
    }
}

