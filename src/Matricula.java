import java.util.Date;

public class Matricula {
    private Alunos alunos;
    private Curso curso;
    private Date dataMatricula;

    public Matricula(Alunos alunos, Curso curso, Date dataMatricula) {
        this.alunos = alunos;
        this.curso = curso;
        this.dataMatricula = new Date();
    }



}
