data class Aluno (val nome: String, val sobrenome: String, val codAluno: Int) {
    var nomeCompleto:String
    init {
        nomeCompleto = "$nome $sobrenome"
    }
}
