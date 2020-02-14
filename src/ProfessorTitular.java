public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nomeProf, String sobrenomeProf, Integer matriculaProf, String especialidade) {
        super(nomeProf, sobrenomeProf, matriculaProf);
        this.setEspecialidade(especialidade);
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
