public class Tuerca extends PitCrewTeam{

    public int posicion;

    public Tuerca(String nombretrabajador, String rol, int team, int posicion) {
        super(nombretrabajador, rol, team);
        posicion = posicion;
    }
    public Tuerca() {

    }

    public void quitarTuercas(String[] tuercas,PitCrewTeam[] pitCrew) {
        if (tuercas != null) {
            boolean algunaTuercaQuitada = false;
            for (int i = 0; i < tuercas.length; i++) {
                if (tuercas[i] != null) {
                    System.out.println("Quitando la tuerca del neumático " + (i + 1));
                    tuercas[i] = null;
                    algunaTuercaQuitada = true;
                }
            }
            mostrarTrabajadoresTyreGunner(pitCrew);
            if (!algunaTuercaQuitada) {
                System.out.println("No se encontraron tuercas para quitar.");
            }
        } else {
            System.out.println("No hay tuercas para quitar.");
        }
    }
    public void ponerTuercas(String[] tuercas,PitCrewTeam[] pitCrew) {
        if (tuercas != null) {
            boolean tuercaColocada = false;
            for (int i = 0; i < tuercas.length; i++) {
                if (tuercas[i] == null) {
                    System.out.println("Poniendo la tuerca en el neumático " + (i + 1));
                    tuercas[i] = "Tuerca";
                    tuercaColocada = true;
                }
            }
            mostrarTrabajadoresTyreGunner(pitCrew);
            if (!tuercaColocada) {
                System.out.println("No hay espacio para poner más tuercas.");
            }
        } else {
            System.out.println("El arreglo de tuercas es nulo.");
        }
    }
    private void mostrarTrabajadoresTyreGunner(PitCrewTeam[] pitCrew) {
        System.out.println("Trabajadores Tyre Gunner:");
        for (PitCrewTeam trabajador : pitCrew) {
            if (trabajador.getRol().equals("Tyre gunner")) {
                System.out.println("El mecanico " + trabajador.getNombretrabajador() + ", del Team " + trabajador.getTeam());
            }
        }
    }

}
