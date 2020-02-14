public class Professor {

    private String nomeProf;
    private String sobrenomeProf;
    private Integer matriculaProf;

    public Professor(String nomeProf, String sobrenomeProf, Integer matriculaProf) {
        this.nomeProf = nomeProf;
        this.sobrenomeProf = sobrenomeProf;
        this.matriculaProf = matriculaProf;
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
