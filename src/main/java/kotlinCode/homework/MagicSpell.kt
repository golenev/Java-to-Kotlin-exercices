package kotlinCode.homework

class MagicSpell(private val spell: String) {
    operator fun not() {
        println("$spell!")
    }

    fun <T> canApplySpell(obj: T): Boolean {
        return when (obj) {
            is String -> true // Можно применить заклинание к строке
            is Int -> false // Нельзя применить заклинание к целому числу
            is List<*> -> true // Можно применить заклинание к списку
            else -> false // По умолчанию нельзя применить заклинание к другим типам
        }
    }

    fun <T> applySpellToObjects(objects: List<T>): Map<T, Boolean> {
        return objects.associateWith { canApplySpell(it) }
    }

}

fun main() {
    val magicSpell = MagicSpell("Abracadabra")
    // Используем переопределенный оператор not для отправки заклинания на печать с восклицательным знаком
    !magicSpell

 val result =  MagicSpell("wsd").canApplySpell(listOf(123))
    println(result)
}

