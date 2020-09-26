class Curso(val nomeCurso: String, val codCurso: Int, val professorTitular: ProfessorTitular, val professorAdjunto:
ProfessorAdjunto, var quantMaxAlunos: Int) {
    val alunos =  mutableListOf<Aluno>()

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
}
