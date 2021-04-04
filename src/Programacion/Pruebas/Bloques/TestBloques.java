package Programacion.Pruebas.Bloques;

public class TestBloques {
    public static void main(String[] args) {
        //Primero se ejecuta el bloque estático,
        //despues el no estático,
        //y finalmente el constructor.
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
        //La segunda vez que se ejecuta la creacion de un nuevo objeto,
        //ya no se ejecuta el bloque estático
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
