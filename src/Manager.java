import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Alunos> alunos = new ArrayList<>();

    public Manager(List<Curso> cursos, List<Matricula> matriculas, List<Professor> professores, List<Alunos> alunos) {
        this.cursos = cursos;
        this.matriculas = matriculas;
        this.professores = professores;
        this.alunos = alunos;
    }
    public void registrarCurso(String nome, Integer codCurso, Integer qtdMaxima){
        Curso curso = new Curso(nome, codCurso, qtdMaxima);
        cursos.add(curso);
        System.out.println("Curso registrado");
    }
    public void excluirCurso(Integer codCurso){
        cursos.removeIf(curso ->
            curso.getCodCurso().equals(codCurso));
        System.out.println("Curso removido");
    }
    public void registrarProfessorAdjunto(String nomeProf, String sobrenomeProf, Integer matriculaProf, Integer horasMonitoria){
        Professor professor = new ProfessorAdjunto(nomeProf, sobrenomeProf, matriculaProf, horasMonitoria);
        professores.add(professor);
        System.out.println("Professor Adjunto Adicionado com sucesso");
    }
    public void registrarProfessorTitular(String nomeProf, String sobrenomeProf, Integer matriculaProf, String especialidade){
        Professor professor = new ProfessorTitular(nomeProf, sobrenomeProf, matriculaProf, especialidade);
        professores.add(professor);
        System.out.println("Professor titular adicionado");
    }
    public void excluirProfessor(Integer matriculaProf){
        professores.removeIf(professor ->
                professor.getMatriculaProf().equals(matriculaProf));
        System.out.println("Professor excluido com sucesso");
    }
    public void matricularAlunos(String nome, String sobrenome, Integer matriculaAluno){
        Alunos aluno = new Alunos(nome, sobrenome, matriculaAluno);
        alunos.add(aluno);
        System.out.println("Aluno add com sucesso");
    }
    public void matriculaAlunos(Integer matriculaAluno){
        if (matriculaAluno == alunos.equals(matriculaAluno))
    }

}
