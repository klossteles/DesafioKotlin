abstract class Professor(val nome: String, val sobrenome: String, val codProfessor: Int) {
    val nomeCompleto: String
    val tempoDeCasa: Int
    init {
        nomeCompleto = "$nome $sobrenome"
        tempoDeCasa = 0
    }
}
