public class Auto {
    public int numAuto;
    public String TeamAuto;
    private String[] neumaticos;
    private String[]tuercas;

    public Auto(int numAuto, String teamAuto) {
        this.numAuto = numAuto;
        TeamAuto = teamAuto;
        this.neumaticos = new String[]{"Neumático 1", "Neumático 2", "Neumático 3", "Neumático 4"};
        this.tuercas= new String[]{"Tuercas neumatico 1","Tuercas neumatico 2","Tuercas neumatico 3", "Tuercas neumatico 4"};
    }


    public String[] getNeumaticos() {
        return neumaticos;
    }

    public int getNumAuto() {
        return numAuto;
    }

    public void setNumAuto(int numAuto) {
        this.numAuto = numAuto;
    }

    public String getTeamAuto() {
        return TeamAuto;
    }

    public void setTeamAuto(String teamAuto) {
        TeamAuto = teamAuto;
    }

    public void setNeumaticos(String[] neumaticos) {
        this.neumaticos = neumaticos;
    }

    public String[] getTuercas() {
        return tuercas;
    }

    public void setTuercas(String[] tuercas) {
        this.tuercas = tuercas;
    }
}
