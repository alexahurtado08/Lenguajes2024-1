public class GatoLateral extends PitCrewTeam{
    public GatoLateral(String nombretrabajador, String rol, int team) {
        super(nombretrabajador, rol, team);
    }
    public void levantarGatoIzquierdo() {
        System.out.println("El gato izquierdo, operado por " + this.nombretrabajador+ ", está siendo levantado.");
        verificarEquipo();
    }

    public void bajarGatoIzquierdo() {
        System.out.println("El gato izquierdo, operado por " + this.nombretrabajador + ", está siendo bajado.");
        verificarEquipo();
    }

    public void levantarGatoDerecho() {
        System.out.println("El gato derecho, operado por " + this.nombretrabajador + ", está siendo levantado.");
        verificarEquipo();

    }

    public void bajarGatoDerecho() {
        System.out.println("El gato derecho, operado por " + this.nombretrabajador + ", está siendo bajado.");
        verificarEquipo();
    }
    private void verificarEquipo() {
        if (getTeam() == 2) {
            System.out.println( nombretrabajador + " pertenece al Team A");
        } else if (getTeam() == 3) {
            System.out.println( nombretrabajador + " pertenece al Team B");
        } else {
            System.out.println( nombretrabajador + " Pertenece al PitCrewTeam");
        }
    }
}
