import java.time.LocalDateTime

data class Matricula(val aluno: Aluno, val curso: Curso) {
    var dataMatricula: LocalDateTime
    init {
        dataMatricula  = LocalDateTime.now()
    }

    override fun toString(): String {
        return "Aluno=$aluno, curso=$curso, dataMatricula=$dataMatricula"
    }
}
