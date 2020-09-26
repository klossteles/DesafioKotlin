class ProfessorAdjunto(nome: String, sobrenome: String, codProfessor: Int, val quantHorasMonitoria: Int): Professor
(nome, sobrenome, codProfessor) {
    override fun toString(): String {
        return "ProfessorTitular(nome='$nome', sobrenome='$sobrenome', codProfessor='$codProfessor', " +
                "nomeCompleto='$nomeCompleto', quantHorasMonitoria='$quantHorasMonitoria')"
    }
}
