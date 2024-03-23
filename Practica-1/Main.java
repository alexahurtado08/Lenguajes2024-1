import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;
        F1Team eafunF1Team = new F1Team("Eafun F1 Team", 2005, 23);
        PitCrewTeam[] pitCrew = new PitCrewTeam[22];


        pitCrew[0] = new PitCrewTeam("juan", "Tyre on", 1);
        pitCrew[1] = new PitCrewTeam("Maria", "Tyre on", 1);
        pitCrew[2] = new PitCrewTeam("Jeronimo", "Tyre on", 1);
        pitCrew[3] = new PitCrewTeam("Carlos", "Tyre on", 1);
        pitCrew[4] = new PitCrewTeam("Carla", "Tyre off", 1);
        pitCrew[5] = new PitCrewTeam("Daniel", "Tyre off", 1);
        pitCrew[6] = new PitCrewTeam("Pablo", "Tyre off", 1);
        pitCrew[7] = new PitCrewTeam("Cesar", "Tyre off", 1);
        pitCrew[8] = new PitCrewTeam("Maicol", "Tyre gunner", 1);
        pitCrew[9] = new PitCrewTeam("Omaira", "Tyre gunner", 1);
        pitCrew[10] = new PitCrewTeam("Camilo", "Tyre gunner", 1);
        pitCrew[11] = new PitCrewTeam("Aleja", "Tyre gunner", 1);
        pitCrew[12] = new PitCrewTeam("Augusto", "Front jack", 2);
        pitCrew[13] = new PitCrewTeam("Pepe", "Front jack", 3);
        pitCrew[14] = new PitCrewTeam("Moni", "Rear jack", 2);
        pitCrew[15] = new PitCrewTeam("Lina", "Rear jack", 3);
        pitCrew[16] = new PitCrewTeam("Fernando", "side jack", 1);
        pitCrew[17] = new PitCrewTeam("Luis", "side jack", 1);
        pitCrew[18] = new PitCrewTeam("Martina", "Lollipop man", 2);
        pitCrew[19] = new PitCrewTeam("luisito", "Lollipop man", 3);
        pitCrew[20] = new PitCrewTeam("Irma", "Aleta Delantera", 2);
        pitCrew[21] = new PitCrewTeam("Checho", "Aleta Delantera", 3);


        do {
            System.out.println("Menú:");
            System.out.println("1. Ver información general");
            System.out.println("2. Ir a los pits");
            System.out.println("3. Terminar");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    F1Team.getEstado();
                    F1Team.imprimirInformacion();

                    PitCrewTeam trabajador=new  PitCrewTeam();
                    PitCrewTeam.imprimirInformacion(pitCrew);
                    PitCrewTeam.exclusivos(pitCrew);
                    break;
                case 2:
                    F1Team.setEstado("Compitiendo");
                    F1Team.iniciarCarrera();
                    System.out.println("El equipo se encuentra " + F1Team.getEstado());
                    System.out.println("\nAuto Team A");
                    Auto auto1 = new Auto(1, "EafunF1 Team");
                    PonerNeumaticos ponerNeumaticos = new PonerNeumaticos("Nombre1", "Rol", 1, 1);
                    QuitarNeumatico quitarNeumatico = new QuitarNeumatico("Nombre", "Rol", 1, 1);
                    GatoLateral lateral= new GatoLateral("Fernando", "side jack",1);
                    GatoLateral gato= new GatoLateral("Luis", "side jack",1);
                    GatoDelantero gatod=new GatoDelantero("Augusto","Front jack",2);
                    LollipopMan bandera= new LollipopMan("Martina","Lollipop man",2);
                    AletaDelnatera aleta= new AletaDelnatera("Irma","Aleta delantera",2);
                    Tuerca tuerca= new Tuerca("tuerca","Tuercas",1,2);
                    GatoTrasero gatot=new GatoTrasero("Moni","Rear jack",2);

                    bandera.levantarBandera();
                    gatod.estadoactual();

                    String[] neumaticos = auto1.getNeumaticos();
                    String[] tuercas = auto1.getTuercas();


                    gatod.levantarGatoD();
                    gatot.levantarGatoT();

                    lateral.levantarGatoIzquierdo();
                    gato.levantarGatoDerecho();

                    tuerca.quitarTuercas(tuercas,pitCrew);

                    quitarNeumatico.quitarNeumaticos(neumaticos,pitCrew);
                    quitarNeumatico.mostrarEstadoNeumaticos(neumaticos);

                    quitarNeumatico.estadoactual();

                    String[] nuevosNeumaticos = {"Neumático 1", "Neumático 2", "Neumático 3", "Neumático 4"};

                    ponerNeumaticos.ponerNeumaticos(neumaticos,  nuevosNeumaticos,pitCrew);
                    auto1.getTuercas();
                    tuerca.ponerTuercas(tuercas,pitCrew);
                    ponerNeumaticos.mostrarEstadoNeumaticos(neumaticos);
                    ponerNeumaticos.estadoactual();

                    gatod.quitarGatod();
                    gatot.quitarGatoT();
                    lateral.bajarGatoIzquierdo();
                    gato.bajarGatoDerecho();
                    aleta.ajustarAleta();
                    bandera.bajarBandera();
                    bandera.estadoactual();

                    System.out.println("\nAuto team B");
                    Auto auto2 = new Auto(2, "EafunF1 Team");
                    PonerNeumaticos ponerNeumaticos2 = new PonerNeumaticos();
                    QuitarNeumatico quitarNeumatico2 = new QuitarNeumatico();
                    GatoLateral lateral2= new GatoLateral("Fernando", "side jack",1);
                    GatoLateral gato2= new GatoLateral("Luis", "side jack",1);
                    GatoDelantero gatod2=new GatoDelantero("Pepe","Front Jack",3);
                    LollipopMan bandera2= new LollipopMan("Luisito","Lollipop man",3);
                    AletaDelnatera aleta2= new AletaDelnatera("Checho","Aleta delantera",3);
                    Tuerca tuerca2= new Tuerca();
                    GatoTrasero gatot2=new GatoTrasero("Lina","Rear Jack",3);
                    bandera2.levantarBandera();
                    gatod2.estadoactualb();

                    String[] neumaticos2 = auto2.getNeumaticos();
                    String[] tuercas2 = auto2.getTuercas();

                    gatod2.levantarGatoD();
                    gatot2.levantarGatoT();
                    lateral2.levantarGatoIzquierdo();
                    gato2.levantarGatoDerecho();

                    tuerca2.quitarTuercas(tuercas2,pitCrew);


                    quitarNeumatico2.quitarNeumaticos(neumaticos2,pitCrew);
                    quitarNeumatico2.mostrarEstadoNeumaticos(neumaticos2);
                    quitarNeumatico2.estadoactualb();

                    String[] nuevosNeumaticos2 = {"Neumático 1", "Neumático 2", "Neumático 3", "Neumático 4"};
                    ponerNeumaticos2.ponerNeumaticos(neumaticos2,nuevosNeumaticos2, pitCrew);
                    auto2.getTuercas();
                    tuerca2.ponerTuercas(tuercas2,pitCrew);
                    ponerNeumaticos2.mostrarEstadoNeumaticos(neumaticos2);
                    ponerNeumaticos2.estadoactualb();

                    gatod2.quitarGatod();
                    gatot2.quitarGatoT();
                    lateral2.bajarGatoIzquierdo();
                    gato2.bajarGatoDerecho();
                    aleta2.cambiarAleta();
                    bandera2.bajarBandera();
                    bandera2.estadoactualb();
                    break;
                case 3:
                    terminar = true;
                    System.out.println("¡Gracias por apoyar nuestro equipo!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (!terminar);


    }
}
