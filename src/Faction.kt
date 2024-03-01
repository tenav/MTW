data class Faction(
    val name: String,
    val bannerColor: String,
    val culture: String,
    val religion: String,
    val region: List<Region>,
    val purse: String,
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

enum class Culture (val culture: String) {
    NORTHERN_EUROPE ("Northern Europe"),
    WESTERN_EUROPE ("Western Europe"),
    SOUTHERN_EUROPE ("Southern Europe")
}

enum class Religion (val religion: String) { CATHOLIC ("Catholic") }



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

enum class Religion (val religion: String) { CATHOLIC ("Catholic") }