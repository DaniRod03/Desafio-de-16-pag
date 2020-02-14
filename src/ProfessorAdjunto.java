public class ProfessorAdjunto extends Professor {

    private Integer horasMonitoria;

    public ProfessorAdjunto(String nomeProf, String sobrenomeProf, Integer matriculaProf, Integer horasMonitoria) {
        super(nomeProf, sobrenomeProf, matriculaProf);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
