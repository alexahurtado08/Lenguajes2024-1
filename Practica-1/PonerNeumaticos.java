public class PonerNeumaticos extends PitCrewTeam implements TeamDriverA, TeamDriverB{
    public int posicion;

    public PonerNeumaticos(String nombretrabajador, String rol, int team, int posicion) {
        super(nombretrabajador, rol, team);
        this.posicion = posicion;
    }
    public PonerNeumaticos() {

    }

    public void ponerNeumaticos(String[] neumaticos, String[] nuevosNeumaticos, PitCrewTeam[] pitCrew) {
        if (neumaticos == null || neumaticos.length == 0) {
            if (nuevosNeumaticos.length == 4) {
                neumaticos = nuevosNeumaticos.clone();
                System.out.println("Se han colocado nuevos neumáticos.");
                mostrarTrabajadoresTyreOn(neumaticos, pitCrew);
            } else {
                System.out.println("Debe proporcionar exactamente 4 neumáticos para colocar.");
            }
        } else {
            boolean hayEspacioVacio = false;
            for (int i = 0; i < neumaticos.length; i++) {
                if (neumaticos[i] == null) {
                    hayEspacioVacio = true;
                    break;
                }
            }
            if (!hayEspacioVacio) {
                System.out.println("El auto ya no tiene espacio para colocar neumáticos.");
                return;
            }

            int espaciosVacios = 0;
            for (String neumatico : neumaticos) {
                if (neumatico == null) {
                    espaciosVacios++;
                }
            }

            if (espaciosVacios == 4) {
                for (int i = 0; i < nuevosNeumaticos.length; i++) {
                    neumaticos[i] = nuevosNeumaticos[i];
                    mostrarTrabajadoresTyreOn(neumaticos, pitCrew);
                    break;
                }

            } else {
                System.out.println("El auto ya tiene neumáticos, pero aún hay espacio para colocar más.");
            }
        }
    }

    private void mostrarTrabajadoresTyreOn(String[] neumaticos, PitCrewTeam[] pitCrew) {
        for (int i = 0; i < neumaticos.length && i < pitCrew.length; i++) {
            if (pitCrew[i].getRol().equals("Tyre on")) {
                System.out.println(pitCrew[i].getNombretrabajador() + " está poniendo el neumático número " + (i + 1));
            }
        }
    }


    public void mostrarEstadoNeumaticos(String[] neumaticos) {
        System.out.println("Estado de los neumáticos:");
        System.out.println("Los neumaticos han sido puestos.");

    }
    @Override
    public void estadoactual(){
        System.out.println("\nEl auto del Team A continua en los pits");
    }

    @Override
    public void estadoactualb(){
        System.out.println("\nEl auto del Team B continua en los pits");
    }
}