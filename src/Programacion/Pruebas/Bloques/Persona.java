package Programacion.Pruebas.Bloques;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    {
        System.out.println("Ejecucion bloque NO estático.");
        //Como el atributo Persona.contadorPersonas ya se ha incrementado solo la asignamos, haremos un postincremento
        this.idPersona = Persona.contadorPersonas++;
    }

    //bloque de codigo de inicializacion estatico
    static{
        System.out.println("Ejecución bloque estático.");
        ++Persona.contadorPersonas;
        //No se puede agregar atributos no estáticos
        //this.idPersona = 1;
    }

    public Persona(){
        System.out.println("Ejecicion constructor.");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
