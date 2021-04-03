package Programacion.Pruebas.Herencia;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente("Charo", 'F', 46, "Avda. Antonio Maura N1 ESC A 3º 3ª", true);
        System.out.println("cliente1 = " + cliente1);
    }
}
