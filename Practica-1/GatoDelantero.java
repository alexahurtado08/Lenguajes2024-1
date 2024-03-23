public class GatoDelantero extends PitCrewTeam implements TeamDriverA, TeamDriverB {
    public boolean posicion;

    public GatoDelantero(String nombretrabajador, String rol, int team) {
        super(nombretrabajador, rol, team);
        posicion = true;
    }

    private boolean estaEnPosicion() {
        return posicion;
    }

    public void levantarGatoD() {
        if (estaEnPosicion()) {
            System.out.println("El gato delantero está siendo levantado por " + getNombretrabajador());
            // Realizar acciones para levantar el gato
        } else {
            System.out.println("No se puede levantar el gato delantero porque no está en posición.");
        }
    }

    public void quitarGatod() {
        if (posicion) {
            posicion = false; // Marca el gato como no puesto
            System.out.println("El gato delantero ha sido retirado por "+getNombretrabajador()+" Perteneciente al team "+getTeam());
        } else {
            System.out.println("El gato delantero ya está fuera de posición.");
        }
    }

    @Override
    public void estadoactual() {
        System.out.println("\nEl auto del team A ingresó a los pits.");
    }

    @Override
    public void estadoactualb() {
        System.out.println("\nEl auto del team B ingresó a los pits.");
    }
}


