public class LollipopMan extends PitCrewTeam implements TeamDriverA,TeamDriverB{
    public LollipopMan(String nombretrabajador, String rol, int team) {
        super(nombretrabajador, rol, team);
    }
public void levantarBandera() {
    System.out.println("La bandera de entrada de " + nombretrabajador + " está siendo levantada para la entrada del auto a los pits");
    verificarEquipo();
}
public void bajarBandera() {
    System.out.println("La bandera de " + nombretrabajador + " está indicando la salida del auto de los pits");
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
    @Override
    public void estadoactual(){
        System.out.println("El auto del Team A salio de los pits\n");
    }

    @Override
    public void estadoactualb(){
        System.out.println("El auto del Team B salio en los pits\n");
    }
}
