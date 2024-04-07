package mtw

class Unit(
    val name: UnitsName,
    val type: UnitsType,
    val attack: Int,
    val totalDefence: Int,
    val hitPoints: Int,
    val experience: Int,
) {
    override fun toString(): String = name.toString()

    companion object {
        val predefinedUnits = listOf(
            FactionName.ENGLAND to Unit(
                name = UnitsName.YEOMAN_ARCHERS,
                type = UnitsType.MISSILE_INFANTRY,
                attack = 8,
                totalDefence = 5,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.ENGLAND to Unit(
                name = UnitsName.SHERWOOD_ARCHERS,
                type = UnitsType.MISSILE_INFANTRY,
                attack = 13,
                totalDefence = 18,
                hitPoints = 2,
                experience = 0
            ),
            FactionName.FRANCE to Unit(
                name = UnitsName.SCOTS_GUARD,
                type = UnitsType.MISSILE_INFANTRY,
                attack = 9,
                totalDefence = 17,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.THE_HOLY_ROMAN_EMPIRE to Unit(
                name = UnitsName.ZWEI_HANDER,
                type = UnitsType.HEAVY_INFANTRY,
                attack = 14,
                totalDefence = 11,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.MILAN to Unit(
                name = UnitsName.GENOESE_CROSSBOW_MILITIA,
                type = UnitsType.MISSILE_INFANTRY,
                attack = 12,
                totalDefence = 15,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.SICILY to Unit(
                name = UnitsName.MUSLIM_ARCHERS,
                type = UnitsType.MISSILE_INFANTRY,
                attack = 11,
                totalDefence = 10,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.EGYPT to Unit(
                name = UnitsName.TABARDARIYYA,
                type = UnitsType.HEAVY_INFANTRY,
                attack = 20,
                totalDefence = 11,
                hitPoints = 1,
                experience = 0
            ),
            FactionName.RUSSIA to Unit(
                name = UnitsName.TSARS_GUARD,
                type = UnitsType.HEAVY_CAVALRY,
                attack = 14,
                totalDefence = 19,
                hitPoints = 1,
                experience = 0
            )
        )
    }
}


enum class UnitsName(val unitsName: String) {
    YEOMAN_ARCHERS("Yeoman Archers"),
    SHERWOOD_ARCHERS("Sherwood Archers"),
    SCOTS_GUARD("Scots Guard"),
    ZWEI_HANDER("Zwei Hander"),
    GENOESE_CROSSBOW_MILITIA("Genoese Crossbow Militia"),
    MUSLIM_ARCHERS("Muslim Archers"),
    TABARDARIYYA("Tabardariyya"),
    TSARS_GUARD("Tsars Guard")
}

enum class UnitsType(val unitsType: String) {
    LIGHT_INFANTRY("Light infantry"),
    SPEAR_INFANTRY("Spear infantry"),
    HEAVY_INFANTRY("Heavy infantry"),
    MISSILE_INFANTRY("Missile infantry"),
    LIGHT_CAVALRY("Light cavalry"),
    HEAVY_CAVALRY("Heavy cavalry"),
    MISSILE_CAVALRY("Missile cavalry"),
    SIEGE_ENGINE("Siege engine"),
    VESSEL("Vessel")
}