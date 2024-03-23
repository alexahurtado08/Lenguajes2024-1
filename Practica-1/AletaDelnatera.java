public class AletaDelnatera extends PitCrewTeam {
    private static boolean aletaFloja;

    public AletaDelnatera(String nombretrabajador, String rol, int team) {
        super(nombretrabajador, rol, team);
        aletaFloja = true;
    }

    private boolean revisarAleta(boolean aletaFloja) {
        return aletaFloja;
    }
    public void ajustarAleta() {
        if (revisarAleta(true)) {
            System.out.println("Ajustando aleta...");
            aletaFloja = false;
            System.out.println("La aleta ha sido ajustada por " +getNombretrabajador()+" exclusivo del team "+getTeam());
        }
    }
    public void cambiarAleta() {
        System.out.println("Cambiando aleta...");
        aletaFloja = true;
        System.out.println("La aleta ha sido cambiada por "+getNombretrabajador()+ "exclusivo del team "+getTeam());
    }
}

