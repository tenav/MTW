package mtw

class General(
    val name: String,
    val age: Int,
    val command: Int,
    val chivalry: Int,
    val loyalty: Int,
    val piety: Int,
    val coordinates: Coordinates,
) {
    companion object {
        val predefindedGeneral = mapOf(
            GeneralName.RICHARD_THE_LIONHEART to General(
                name = "Richard the Lionheart",
                age = 30,
                command = 10,
                chivalry = 10,
                loyalty = 10,
                piety = 10,
                coordinates = Coordinates(5, 9),
            ),
            GeneralName.AHMED_IBN_TULUN to General(
                name = "Ahmed ibn Tulun",
                age = 30,
                command = 10,
                chivalry = 10,
                loyalty = 10,
                piety = 10,
                coordinates = Coordinates(12, 12),
            ),
            GeneralName.SVYATOSLAV_I_IGOREVICH to General(
                name = "Svatoslav I Igorevich",
                age = 30,
                command = 10,
                chivalry = 10,
                loyalty = 10,
                piety = 10,
                coordinates = Coordinates(17, 14),
            )
        )
    }
}

enum class GeneralName {
    RICHARD_THE_LIONHEART,
    AHMED_IBN_TULUN,
    SVYATOSLAV_I_IGOREVICH
}