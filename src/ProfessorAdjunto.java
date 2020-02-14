public class ProfessorAdjunto extends Professor {

    private Professor professor;
    private Integer horasMonitoria;

    public ProfessorAdjunto(String nomeProf, String sobrenomeProf, Integer matriculaProf, Professor professor, Integer horasMonitoria) {
        super(nomeProf, sobrenomeProf, matriculaProf);
        this.setProfessor(professor);
        this.setHorasMonitoria(horasMonitoria);
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
