import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private List<Alunos> listaAlunos = new ArrayList<>();
    private String nomeCurso;
    private Integer codCurso;
    private Integer qtdMaxima;

    public Curso(String nomeCurso, Integer codCurso, Integer qtdMaxima) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.qtdMaxima = qtdMaxima;
    }





    public boolean adicionarUmAluno(Alunos umAluno){
            if (listaAlunos.size() == qtdMaxima){
                System.out.println("Turma lotada");
                return false;
            }
            else{
                System.out.println("Aluno matriculado");
                return true;
        }
    }
    public void excluirAluno(Alunos umAluno){
        if(listaAlunos.size() > 0){
        listaAlunos.remove(umAluno);
        System.out.println("Aluno Excluido com sucesso");
        }
        else{
            System.out.println("Turma vazia");
        }
    }

    public void addCurso(String nomeCurso, Integer codCurso, Integer qtdMaxima){
        System.out.println("Curso adicionado");

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codCurso, curso.codCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }
}
