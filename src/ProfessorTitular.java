public class ProfessorTitular extends Professor {

    private Professor professor;
    private String especialidade;

    public ProfessorTitular(String nomeProf, String sobrenomeProf, Integer matriculaProf, Professor professor, String especialidade) {
        super(nomeProf, sobrenomeProf, matriculaProf);
        this.setProfessor(professor);
        this.setEspecialidade(especialidade);
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
