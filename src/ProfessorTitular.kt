class ProfessorTitular(nome:String, sobrenome:String, codProfessor:Int, val especialidade: String): Professor(nome,
        sobrenome, codProfessor)  {

    override fun toString(): String {
        return "ProfessorTitular(nome='$nome', sobrenome='$sobrenome', codProfessor='$codProfessor', " +
                "nomeCompleto='$nomeCompleto', especialidade='$especialidade')"
    }
}
