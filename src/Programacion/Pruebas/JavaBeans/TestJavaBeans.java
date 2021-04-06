package Programacion.Pruebas.JavaBeans;

public class TestJavaBeans {
    public static void main(String[] args) {
        //Lo normal en JavaBeans es que el objeto se cree vacío.
        Persona persona = new Persona();
        
        //Se asigna la informacion con los metodos SET respectivamente.
        persona.setNombre("Juanma");
        persona.setApellido("Fernandez");

        //Obteniendo informacion desde toString y los GETTERS.
        System.out.println("persona = " + persona);
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Apellido = " + persona.getApellido());
    }
}
