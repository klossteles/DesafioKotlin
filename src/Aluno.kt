data class Aluno (val nome: String, val sobrenome: String, val codAluno: Int) {
    var nomeCompleto:String
    init {
        nomeCompleto = "$nome $sobrenome"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (codAluno != other) return false

        return true
    }

    override fun hashCode(): Int {
        return codAluno
    }
}
