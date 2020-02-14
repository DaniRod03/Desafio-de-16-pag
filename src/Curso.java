import java.util.Objects;

public class Curso {

    private String nomeCurso;
    private Integer codCurso;


    public Curso(String nomeCurso, Integer codCurso) {
        this.setNomeCurso(nomeCurso);
        this.setCodCurso(codCurso);
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
