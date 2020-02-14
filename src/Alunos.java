import java.util.Objects;

public class Alunos {

    private String nome;
    private String sobrenome;
    private Integer matriculaAluno;

    public Alunos(String nome, String sobrenome, Integer matriculaAluno) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matriculaAluno = matriculaAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(matriculaAluno, alunos.matriculaAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculaAluno);
    }
}
