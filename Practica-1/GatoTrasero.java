public class GatoTrasero extends PitCrewTeam implements TeamDriverA, TeamDriverB {
    public boolean posicion;

    public GatoTrasero(String nombretrabajador, String rol, int team) {
        super(nombretrabajador, rol, team);
        posicion = true;
    }
    private boolean estaEnPosicion() {
        return posicion;
    }

    public void levantarGatoT() {
        if (estaEnPosicion()) {
            System.out.println("El gato trasero está siendo levantado por " + getNombretrabajador());
        } else {
            System.out.println("No se puede levantar el gato trasero porque no está en posición.");
        }
    }


    public void quitarGatoT() {
        if (posicion) {
            posicion = false; // Marca el gato como no puesto
            System.out.println("El gato trasero ha sido retirado por el "+getRol()+" del team "+getTeam());
        } else {
            System.out.println("El gato trasero ya está fuera de posición.");
        }
    }

    @Override
    public void estadoactual() {
        System.out.println("\nEl auto del team A ingreso a los pits.");
    }

    @Override
    public void estadoactualb() {
        System.out.println("\nEl auto del team B ingreso a los pits.");
    }
}
