fun main () {
//    CRIAÇÃO DO MANAGER
    val digitalHouseManager = DigitalHouseManager()
//    INSERÇÃO DE ALUNOS
    digitalHouseManager.matricularAluno("Lucas", "Silvestre", 1)
    digitalHouseManager.matricularAluno("Lucas", "Kloss", 2)
    digitalHouseManager.matricularAluno("Lucas", "Teles", 3)

//    INSERÇÃO DO CURSO
    digitalHouseManager.registrarCurso("Mobile Android", 1, 2)

//    INSERÇÃO DE PROFESSORES
    digitalHouseManager.registrarProfessorTitular("Felipe", "Medeiros", 1, "Kotlin")
    digitalHouseManager.registrarProfessorAdjunto("Lucas", "Gabriel", 2, 10)

//    ALOCAÇÃO DE PROFESSORES
    digitalHouseManager.alocarProfessores(1,1,2)

//    MATRÍCULA DE ALUNOS
    digitalHouseManager.matricularAluno(1,1)
    digitalHouseManager.matricularAluno(2,1)

//    EXCLUSÃO DE PROFESSORES
    digitalHouseManager.excluirProfessor(1)
    digitalHouseManager.excluirProfessor(2)

//    EXCLUSÃO DO CURSO
    digitalHouseManager.excluirCurso(1)
}
