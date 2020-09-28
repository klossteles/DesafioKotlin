fun main () {
//    CRIAÇÃO DO MANAGER
    val digitalHouseManager = DigitalHouseManager()
//    INSERÇÃO DE ALUNOS
    digitalHouseManager.matricularAluno("Lucas", "Silvestre", 1)
    digitalHouseManager.matricularAluno("Lucas", "Kloss", 2)
    digitalHouseManager.matricularAluno("Lucas", "Teles", 3)

//    INSERÇÃO DE ALUNOS INVÁLIDA
//    digitalHouseManager.matricularAluno("Lucas", "Kloss", 2)

//    INSERÇÃO DO CURSO
    digitalHouseManager.registrarCurso("Mobile Android", 1, 2)

//    INSERÇÃO DO CURSO INVÁLIDO
//    digitalHouseManager.registrarCurso("", 1, 2)

//    INSERÇÃO DE PROFESSORES
    digitalHouseManager.registrarProfessorTitular("Felipe", "Medeiros", 1, "Kotlin")
    digitalHouseManager.registrarProfessorAdjunto("Lucas", "Gabriel", 2, 10)

//    INSERÇÃO DE PROFESSORES INVÁLIDOS
//    digitalHouseManager.registrarProfessorTitular("", "Miranda", 1, "Kotlin")
//    digitalHouseManager.registrarProfessorTitular("Felipe", "", 1, "Kotlin")
//    digitalHouseManager.registrarProfessorTitular("Felipe", "Miranda", 1, "Kotlin")
//    digitalHouseManager.registrarProfessorAdjunto("", "Gabriel", 2, 10)
//    digitalHouseManager.registrarProfessorAdjunto("Lucas", "", 2, 10)
//    digitalHouseManager.registrarProfessorAdjunto("Lucas", "Gabriel", 1, 10)

//    ALOCAÇÃO DE PROFESSORES
    digitalHouseManager.alocarProfessores(1,1,2)

//    ALOCAÇÃO DE PROFESSORES INVÁLIDOS
//    digitalHouseManager.alocarProfessores(2,1,2)
//    digitalHouseManager.alocarProfessores(1,3,2)
//    digitalHouseManager.alocarProfessores(1,1,3)

//    MATRÍCULA DE ALUNOS
    digitalHouseManager.matricularAluno(1,1)
    digitalHouseManager.matricularAluno(2,1)

//    MATRÍCULA DE ALUNOS INVÁLIDOS
//    digitalHouseManager.matricularAluno(3,1)
//    digitalHouseManager.matricularAluno(1,2)

//    EXCLUSÃO DE PROFESSORES
    digitalHouseManager.excluirProfessor(1)
    digitalHouseManager.excluirProfessor(2)

//    EXCLUSÃO DO CURSO
    digitalHouseManager.excluirCurso(1)
}
