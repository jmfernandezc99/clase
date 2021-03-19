package Entornos.EjerciciosEntorno;
import java.util.*;

public class MenuEmpresa {
    private static void menu() {
        Scanner consola = new Scanner(System.in);
        System.out.println("1: Crear usuario.");
        System.out.println("2: Buscar usuario.");
        System.out.println("3: Cambiar contrasena");
        System.out.println("4: Dar de baja");
        System.out.println("5: Salir del programa");
        System.out.print("Introduce una opcion del 1 al 5: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                //crearUsuario();
                System.out.println("crearUsuario");
                break;
            case 2:
                //buscarUsuario();
                System.out.println("buscarUsuario");
                break;
            case 3:
                //cambiarContrasena();
                System.out.println("cambiarContrasena");
                break;
            case 4:
                //darBaja();
                System.out.println("darBaja");
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Selecciona una opcion entre 1 y 5.");
                menu();
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
