class DigitalHouseManager () {
    val alunos =  mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        if (nome.isEmpty()) {
            println("Nome do curso inválido.")
            return
        }
        if (quantidadeMaximaDeAlunos == 0) {
            println("Quantidade máxima de alunos inválida.")
            return
        }

        val curso = cursos.find { it.equals(codigoCurso) }
        if (curso != null) {
            println("Código do curso inválido.")
            return
        }

        cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in cursos) {
            if (curso.equals(codigoCurso)) {
                cursos.remove(curso)
                break
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHorasMonitoria: Int) {
        if (nome.isEmpty()) {
            println("Nome do professor adjunto inválido.")
            return
        }
        if (sobrenome.isEmpty()) {
            println("Sobrenome do professor adjunto inválido.")
            return
        }
        if (quantidadeDeHorasMonitoria.equals(0)) {
            println("Quantidade de horas do professor adjunto inválido.")
            return
        }

        val professor = professores.find { it.equals(codigoProfessor) }
        if (professor != null) {
            println("Código do professor adjunto inválido.")
            return
        }

        professores.add(ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHorasMonitoria))
    }

    fun  registrarProfessorTitular(nome: String, sobrenome: String , codigoProfessor: Int, especialidade: String ) {
        if (nome.isEmpty()) {
            println("Nome do professor titular inválido.")
            return
        }

        if (sobrenome.isEmpty()) {
            println("Sobrenome do professor titular inválido.")
            return
        }

        if (especialidade.isEmpty()) {
            println("Especialidade do professor titular inválida.")
            return
        }

        val professor = professores.find { it.equals(codigoProfessor) }
        if (professor != null) {
            println("Código do professor titular inválido.")
            return
        }

        professores.add(ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (professor in professores) {
            if (professor.equals(codigoProfessor)) {
                professores.remove(professor)
                break
            }
        }
    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int){
        if (nome.isEmpty()) {
            println("Nome do aluno inválido.")
            return
        }

        if (sobrenome.isEmpty()) {
            println("Sobrenome do aluno inválido.")
            return
        }

        val aluno = alunos.find { it.equals(codigoAluno) }
        if (aluno != null) {
            println("Código do aluno inválido.")
            return
        }

        alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.find { it.equals(codigoCurso) }
        if (curso == null) {
            println("Curso não encontrado.")
            return
        }

        val aluno = alunos.find { it.equals(codigoAluno) }
        if (aluno == null) {
            println("Aluno não encontrado.")
            return
        }

        if (curso.alunos.size >= curso.quantMaxAlunos ) {
            println("Não foi possível realizar a matrícula pois não há vagas.")
            return
        }
        curso.alunos.add(aluno)
        matriculas.add(Matricula(aluno, curso))
        println("Aluno matriculado no curso.")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val curso = cursos.find { it.equals(codigoCurso) }
        if (curso == null) {
            println("Curso não encontrado.")
            return
        }

        val professorTitular = professores.find { it.equals(codigoProfessorTitular) }
        if (professorTitular == null) {
            println("Professor titular não encontrado.")
            return
        }

        val professorAdjunto = professores.find { it.equals(codigoProfessorAdjunto) }
        if (professorAdjunto == null) {
            println("Professor adjunto não encontrado.")
            return
        }

        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
        curso.professorTitular = professorTitular as ProfessorTitular
    }
}
