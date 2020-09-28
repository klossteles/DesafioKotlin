class Curso(val nomeCurso: String, val codCurso: Int, var quantMaxAlunos: Int) {
    val alunos =  mutableListOf<Aluno>()
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunos.size >= quantMaxAlunos) {
            return false
        }
        alunos.add(umAluno)
        println("Aluno adicionado no curso")
        return true
    }

    fun excluirAluno(umAluno: Aluno) {
        alunos.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nomeCurso='$nomeCurso', codCurso=$codCurso, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, quantMaxAlunos=$quantMaxAlunos, alunos=$alunos)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (codCurso != other) return false

        return true
    }

    override fun hashCode(): Int {
        return codCurso
    }

}
