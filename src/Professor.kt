abstract class Professor(val nome: String, val sobrenome: String, val codProfessor: Int) {
    val nomeCompleto: String
    val tempoDeCasa: Int
    init {
        nomeCompleto = "$nome $sobrenome"
        tempoDeCasa = 0
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (codProfessor != other) return false

        return true
    }

    override fun hashCode(): Int {
        return codProfessor
    }
}
