public class PitCrewTeam{
    public String nombretrabajador;
    public String rol;
    public int team;

    public PitCrewTeam(String nombretrabajador, String rol, int team) {
        this.nombretrabajador = nombretrabajador;
        this.rol = rol;
        this.team = team;
    }
    public PitCrewTeam(){

    }

    public String getNombretrabajador() {
        return nombretrabajador;
    }

    public void setNombretrabajador(String nombretrabajador) {
        this.nombretrabajador = nombretrabajador;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {

        this.team = team;
    }

    public void asignarTeam(int team) {
        if (team==1) {
            System.out.println("PitCrewTeam");
        } else {
            if(team==2){
                System.out.println("TeamDriverA");
            }else{
                if(team==3){
                    System.out.println("Team DriverB");
                }else{
                    System.out.println("Equipo no válido. Debe ser 1, 2 o 3.");
                }
            }
        }
    }
    public static void exclusivos(PitCrewTeam[] pitCrew) {
        System.out.println("Bienvenidos a los pits, recuerda que tenemos miembros exclusivos para cada uno de los autos.");

        System.out.println("\nMiembros exclusivos del Team Driver A:");
        for (PitCrewTeam trabajador : pitCrew) {
            if (trabajador.getTeam() == 2) {
                System.out.println(trabajador.getNombretrabajador() + " que cumple el rol de " + trabajador.getRol());
            }
        }

        System.out.println("\nMiembros exclusivos del Team Driver B:");
        for (PitCrewTeam trabajador : pitCrew) {
            if (trabajador.getTeam() == 3) {
                System.out.println(trabajador.getNombretrabajador() + " que cumple el rol de " + trabajador.getRol());
            }
        }
        System.out.println("El resto de los trabajadores colaboraran a los 2 equipos");
        System.out.println("¡Buena suerte!");
    }
    public static void imprimirInformacion(PitCrewTeam[] pitCrew) {
        System.out.println("Información de todos los trabajadores:");

        for (PitCrewTeam trabajador : pitCrew) {
            System.out.println("Nombre: " + trabajador.getNombretrabajador());
            System.out.println("Rol: " + trabajador.getRol());
            System.out.print("Equipo: ");
            trabajador.asignarTeam(trabajador.getTeam());
            System.out.println();
        }
    }

}
