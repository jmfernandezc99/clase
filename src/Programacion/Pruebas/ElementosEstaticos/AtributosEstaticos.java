package Programacion.Pruebas.ElementosEstaticos;

public class AtributosEstaticos {
    public static void main(String[] args) {
        Estaticos persona1 = new Estaticos("Juanma");
        System.out.println(persona1);
        Estaticos persona2 = new Estaticos("Gustavo");
        System.out.println(persona2);
    }
}

class Estaticos{
    private static int idPersona;
    private final String nombre;

    Estaticos(String nombre){
        Estaticos.idPersona++;
        this.nombre = nombre;
    }

    public String toString(){
        return "idPersona: " + idPersona + ", nombre= " + this.nombre;
    }

}
