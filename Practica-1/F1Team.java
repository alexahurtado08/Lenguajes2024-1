public  class F1Team {
    public static String name;
    public static int Foundation;
    public static int numTrabajadores;
    public static String estado;


    public F1Team(String name, int foundation, int numTrabajadores) {
        this.name = name;
        this.Foundation = foundation;
        this.numTrabajadores = numTrabajadores;
        estado = "En preparacion";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getFoundation() {
        return Foundation;
    }

    public void setFoundation(int foundation) {
        Foundation = foundation;
    }

    public int getNumTrabajdores() {
        return numTrabajadores;
    }

    public void setNumTrabajdores(int numTrabajdores) {
        numTrabajadores = numTrabajdores;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }
        public static void imprimirInformacion () {
            System.out.println("Nombre del equipo: " + name);
            System.out.println("Año de fundación: " + Foundation);
            System.out.println("Número de trabajadores: " + numTrabajadores);
            System.out.println("El equipo se encuentra: " + estado);
        }
    private static boolean equipoListoParaCompetir() {
        return estado.equals("Compitiendo");
    }

    public static void iniciarCarrera() {
        if (equipoListoParaCompetir()) {
            System.out.println("¡El equipo está listo para competir! Iniciando la carrera...");
            // Aquí iría la lógica para iniciar la carrera
        } else {
            System.out.println("El equipo no está listo para competir.");
        }
    }
}