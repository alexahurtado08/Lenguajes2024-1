public class QuitarNeumatico extends PitCrewTeam implements TeamDriverA,TeamDriverB {
    public int posicion;

    public QuitarNeumatico(String nombretrabajador, String rol, int team, int posicion) {
        super(nombretrabajador, rol, team);
        this.posicion = posicion;
    }
    public QuitarNeumatico() {

    }
    private void verificarNeumaticosParaQuitar(String[] neumaticos) {
        if (neumaticos == null || neumaticos.length == 0) {
            System.out.println("No hay neumáticos para quitar.");
        } else {
            System.out.println("Se van a quitar neumáticos del auto.");
        }
    }

    // Método para quitar neumáticos del auto
    public void quitarNeumaticos(String[] neumaticos, PitCrewTeam[] pitCrew) {
        verificarNeumaticosParaQuitar(neumaticos);
        if (neumaticos != null && pitCrew != null) {
            boolean algunNeumaticoQuitado = false;
            int contadorTrabajadores = 0;
            for (int i = 0; i < neumaticos.length; i++) {
                if (neumaticos[i] != null) {
                    PitCrewTeam trabajadorTyreOff = null;
                    for (int j = contadorTrabajadores; j < pitCrew.length; j++) {
                        if (pitCrew[j].getRol().equals("Tyre off")) {
                            trabajadorTyreOff = pitCrew[j];
                            contadorTrabajadores = (j + 1) % pitCrew.length;
                            break;
                        }
                    }
                    if (trabajadorTyreOff != null) {
                        System.out.println(trabajadorTyreOff.getNombretrabajador() + " está quitando el neumático número" + neumaticos[i]);
                        neumaticos[i] = null;
                        algunNeumaticoQuitado = true;
                    }
                }
            }
        }
    }

        // Método para mostrar el estado de los neumáticos
        public void mostrarEstadoNeumaticos (String[]neumaticos){
            System.out.println("Estado de los neumáticos:");
            boolean todosRemovidos = true;
            for (int i = 0; i < neumaticos.length; i++) {
                if (neumaticos[i] != null) {
                    System.out.println("Neumático " + (i + 1) + ": " + neumaticos[i]);
                    todosRemovidos = false;
                }
            }
            if (todosRemovidos) {
                System.out.println("Todos los neumáticos han sido removidos.");
            }
        }
        @Override
        public void estadoactual () {
            System.out.println("\nEl auto del Team A continua en los pits");
        }

        @Override
        public void estadoactualb () {
            System.out.println("\nEl auto del Team B continua en los pits");
        }
    }




