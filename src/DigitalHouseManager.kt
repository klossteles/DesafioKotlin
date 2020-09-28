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
            println("Quantidade de alunos inválida.")
            return
        }
        for (curso in cursos) {
            if (curso.equals(codigoCurso)) {
                println("Código do curso inválido.")
                return
            }
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

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        if (nome.isEmpty()) {
            println("Nome do professor inválido.")
            return
        }
        if (sobrenome.isEmpty()) {
            println("Sobrenome do professor inválido.")
            return
        }
        if (quantidadeDeHoras.equals(0)) {
            println("Quantidade de horas do professor inválido.")
            return
        }

        for (professor in professores){
            if (professor.equals(codigoProfessor)) {
                println("Código do professor inválido.")
                return
            }
        }

        professores.add(ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras))
    }

    fun  registrarProfessorTitular(nome: String, sobrenome: String , codigoProfessor: Int, especialidade: String ) {
        if (nome.isEmpty()) {
            println("Nome do professor inválido.")
            return
        }

        if (sobrenome.isEmpty()) {
            println("Sobrenome do professor inválido.")
            return
        }

        if (especialidade.isEmpty()) {
            println("Especialidade do professor inválida.")
            return
        }

        for (professor in professores){
            if (professor.equals(codigoProfessor)) {
                println("Código do professor inválido.")
                return
            }
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

        for (aluno in alunos) {
            if (aluno.equals(codigoAluno)) {
                println("Código do aluno inválido.")
                return
            }
        }

        alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var curso: Curso? = null
        for (c in cursos) {
            if (c.equals(codigoCurso)) {
                curso = c
                break
            }
        }
        if (curso == null) {
            println("Curso não encontrado.")
            return
        }

        var aluno: Aluno? = null
        for (al in alunos) {
            if (al.equals(codigoAluno)) {
                aluno = al
                break
            }
        }
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
        var curso: Curso? = null
        for (c in cursos) {
            if (c.equals(codigoCurso)) {
                curso = c
                break
            }
        }
        if (curso == null) {
            println("Curso não encontrado.")
            return
        }

        var professorTitular: Professor? = null
        for (professor in professores){
            if (professor.equals(codigoProfessorTitular)) {
                professorTitular = professor
                break
            }
        }
        if (professorTitular == null) {
            println("Professor titular não encontrado.")
            return
        }

        var professorAdjunto: Professor? = null
        for (professor in professores){
            if (professor.equals(codigoProfessorAdjunto)) {
                professorAdjunto = professor
                break
            }
        }
        if (professorAdjunto == null) {
            println("Professor adjunto não encontrado.")
            return
        }

        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
        curso.professorTitular = professorTitular as ProfessorTitular
    }
}
