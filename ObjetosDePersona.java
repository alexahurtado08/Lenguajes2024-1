public class ObjetosDePersona {
    public static void main(String[]args) {
        //Herencia(capacidad de crear clases y objetos a partir de otra clase
Persona Administrativo=new Persona("Gloria", "1002345754", "Recepcionista", (short)37,false);
        System.out.println("La informacion del Administrativo es:");
        System.out.println("Nombre: " +Administrativo.getNombre());
        System.out.println("Id: "+Administrativo.getId());
        System.out.println("Ocupacion: "+ Administrativo.getOcupacion());
        System.out.println("Edad: " +Administrativo.getEdad());
        System.out.println("Estado: "+ Administrativo.getEstado());
        Administrativo.Estado(Administrativo.getEstado());
        Administrativo.realizarAccion("atender llamadas");
        System.out.println(Administrativo.getNombre() + " ¿Es mayor de edad? " + Administrativo.esMayorEdad());


Persona Estudiante1=new Persona( "1035973003", (short)18,false);
        System.out.println("\nLa informacion del Estuadiante es:");
        System.out.println("Id: "+Estudiante1.getId());
        System.out.println("Edad: " +Estudiante1.getEdad());
        Estudiante1.Estado(Estudiante1.getEstado());
        Estudiante1.realizarAccion("Estudiando");
        Estudiante1.FinCarrera();
        System.out.println("¿" +Estudiante1.getNombre() + " Es mayor de edad? " + Estudiante1.esMayorEdad());

        Persona Estudiante2=new Persona( "Maria","1035973003","Egresada", (short)23,true);
        System.out.println("\nLa informacion del Estuadiante es:");
        System.out.println("Nombre: "+Estudiante2.getNombre());
        System.out.println("Ocupacion: "+Estudiante2.getOcupacion());
        System.out.println("Id: "+Estudiante2.getId());
        System.out.println("Edad: " +Estudiante2.getEdad());
        Estudiante2.Estado(Estudiante2.getEstado());
        Estudiante2.realizarAccion("Durmiendo");
        Estudiante2.FinCarrera();
        System.out.println("¿" +Estudiante2.getNombre() + "Es mayor de edad? " + Estudiante2.esMayorEdad());

Persona Docente=new Persona("Docente");
        System.out.println("\nLa informacion del docente es:");
        Docente.setNombre("Paola");
        Docente.setId("12359583");
        Docente.setEdad((short)29);
        Docente.setEstado(false);
        System.out.println("Nombre: " +Docente.getNombre());
        System.out.println("Id: "+Docente.getId());
        System.out.println("Edad: " +Docente.getOcupacion());
        System.out.println("Edad: " +Docente.getEdad());
        Docente.Estado(Docente.getEstado());
        Docente.realizarAccion("En clase");
        Docente.cambiarEstado(true);
        Docente.realizarAccion("Se encuentra en horario de atencion");
        System.out.println("¿" +Docente.getNombre() + " Es mayor de edad? " + Docente.esMayorEdad());

    }
}
