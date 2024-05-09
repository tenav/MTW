package mtw
class Region(
    val name: RegionName,
    val type: RegionType,
    val isCapital: Boolean = false,
    val coordinates: Coordinates
) {
    override fun toString(): String = name.toString()
    companion object {
        val predefinedRegions = mapOf(
            RegionName.London to Region(
                name = RegionName.London,
                type = RegionType.LARGE_TOWN,
                isCapital = true,
                coordinates = Coordinates(9,8)
            ),
            RegionName.Caen to Region(
                name = RegionName.Caen,
                type = RegionType.CASTLE,
                isCapital = false,
                coordinates = Coordinates(2,2)
            ),
            RegionName.Nottingham to Region(
                name = RegionName.Nottingham,
                type = RegionType.CASTLE,
                isCapital = false,
                coordinates = Coordinates(3,3)
            ),
            RegionName.Paris to Region(
                name = RegionName.Paris,
                type = RegionType.LARGE_TOWN,
                isCapital = true,
                coordinates = Coordinates(4,4)
            ),
            RegionName.Angers to Region(
                name = RegionName.Angers,
                type = RegionType.WOODEN_CASTLE,
                isCapital = false,
                coordinates = Coordinates(5,5)
            ),
            RegionName.Marseille to Region(
                name = RegionName.Marseille,
                type = RegionType.TOWN,
                isCapital = false,
                coordinates = Coordinates(6,6)
            ),
            RegionName.Rheims to Region(
                name = RegionName.Rheims,
                type = RegionType.TOWN,
                isCapital = false,
                coordinates = Coordinates(7,7)
            ),
            RegionName.Toulouse to Region(
                name = RegionName.Toulouse,
                type = RegionType.CASTLE,
                isCapital = false,
                coordinates = Coordinates(8,8)
            ),
            RegionName.Frankfurt to Region(
                name = RegionName.Frankfurt,
                type = RegionType.LARGE_TOWN,
                isCapital = true,
                coordinates = Coordinates(9,9)
            ),
            RegionName.Bologna to Region(
                name = RegionName.Bologna,
                type = RegionType.LARGE_TOWN,
                isCapital = false,
                coordinates = Coordinates(10,10)
            ),
            RegionName.Innsbruck to Region(
                name = RegionName.Innsbruck,
                type = RegionType.WOODEN_CASTLE,
                isCapital = false,
                coordinates = Coordinates(11,11)
            ),
            RegionName.Nuremburg to Region(
                name = RegionName.Nuremburg,
                type = RegionType.TOWN,
                isCapital = false,
                coordinates = Coordinates(12,12)
            ),
            RegionName.Staufen to Region(
                name = RegionName.Staufen,
                type = RegionType.WOODEN_CASTLE,
                isCapital = false,
                coordinates = Coordinates(13,13)
            ),
            RegionName.Vienna to Region(
                name = RegionName.Vienna,
                type = RegionType.LARGE_TOWN,
                isCapital = false,
                coordinates = Coordinates(14,14)
            ),
            RegionName.Milan to Region(
                name = RegionName.Milan,
                type = RegionType.MINOR_CITY,
                isCapital = true,
                coordinates = Coordinates(15,15)
            ),
            RegionName.Genoa to Region(
                name = RegionName.Genoa ,
                type = RegionType.MINOR_CITY,
                isCapital = false,
                coordinates = Coordinates(16,16)
            ),
            RegionName.Palermo to Region(
                name = RegionName.Palermo,
                type = RegionType.CASTLE,
                isCapital = true,
                coordinates = Coordinates(17,17)
            ),
            RegionName.Naples to Region(
                name = RegionName.Naples,
                type = RegionType.LARGE_TOWN,
                isCapital = false,
                coordinates = Coordinates(18,18)
            ),
            RegionName.Cairo to Region(
                name = RegionName.Cairo,
                type = RegionType.MINOR_CITY,
                isCapital = true,
                coordinates = Coordinates(19,19)
            ),
            RegionName.Alexandria to Region(
                name = RegionName.Alexandria,
                type = RegionType.LARGE_TOWN,
                isCapital = false,
                coordinates = Coordinates(20,20)
            ),
            RegionName.Gaza to Region(
                name = RegionName.Gaza,
                type = RegionType.CASTLE,
                isCapital = false,
                coordinates = Coordinates(21,21)
            ),
            RegionName.Novgorod to Region(
                name = RegionName.Novgorod,
                type = RegionType.MINOR_CITY,
                isCapital = true,
                coordinates = Coordinates(3,14)
            ),
            RegionName.Moscow to Region(
                name = RegionName.Moscow,
                type = RegionType.TOWN,
                isCapital = false,
                coordinates = Coordinates(16,14)
            )
        )
    }
}

enum class RegionName {
    London,
    Caen,
    Nottingham,
    Paris,
    Angers,
    Marseille,
    Rheims,
    Toulouse,
    Frankfurt,
    Bologna,
    Innsbruck,
    Nuremburg,
    Staufen,
    Vienna,
    Milan,
    Genoa,
    Palermo,
    Naples,
    Cairo,
    Alexandria,
    Gaza,
    Novgorod,
    Moscow
}

enum class RegionType(val type: String) {
    LARGE_TOWN("Large Town"),
    TOWN("Town"),
    CASTLE("Castle"),
    WOODEN_CASTLE("Wooden Castle"),
    MINOR_CITY("Minor City")
}

class Coordinates (val x: Int, val y: Int)