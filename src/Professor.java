import java.util.Objects;

public class Professor {

    private String nomeProf;
    private String sobrenomeProf;
    private Integer matriculaProf;

    public Professor(String nomeProf, String sobrenomeProf, Integer matriculaProf) {
        this.nomeProf = nomeProf;
        this.sobrenomeProf = sobrenomeProf;
        this.matriculaProf = matriculaProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(matriculaProf, professor.matriculaProf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculaProf);
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeProf() {
        return sobrenomeProf;
    }

    public void setSobrenomeProf(String sobrenomeProf) {
        this.sobrenomeProf = sobrenomeProf;
    }

    public Integer getMatriculaProf() {
        return matriculaProf;
    }

    public void setMatriculaProf(Integer matriculaProf) {
        this.matriculaProf = matriculaProf;
    }
}
