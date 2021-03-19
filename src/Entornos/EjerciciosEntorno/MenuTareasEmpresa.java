package Entornos.EjerciciosEntorno;

import java.util.*;

public class MenuTareasEmpresa {
    private static void menu() {
        Scanner consola = new Scanner(System.in);
        System.out.println("1: Gestion empleados RRHH.");
        System.out.println("2: Gestion de productos.");
        System.out.println("3: Gestion de compra/venta.");
        System.out.println("4: Salir del programa");
        System.out.print("Introduce una opcion del 1 al 4: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                subMenuRrhh();
                break;
            case 2:
                subMenuGestionProductos();
                break;
            case 3:
                subMenuCompraVenta();
                break;
            case 4:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("No has seleccionado una opcion entre 1 y 4.");
                menu();
        }
    }

    private static void subMenuRrhh() {
        Scanner consola = new Scanner(System.in);
        System.out.println("1.1: Dar de alta a empleado.");
        System.out.println("1.2: Modificar un empleado.");
        System.out.println("1.3: Dar de baja a un empleado.");
        System.out.print("Introduce una opcion del 1 al 3: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                altaEmpleado();
                break;
            case 2:
                modificarEmpleado();
                break;
            case 3:
                bajaEmpleado();
                break;
            default:
                System.out.println("Selecciona una opcion entre 1 y 3.");
                subMenuRrhh();
        }
    }

    private static void subMenuGestionProductos() {
        Scanner consola = new Scanner(System.in);
        System.out.println("2.1: Dar de alta a un producto.");
        System.out.println("2.2: Modificar un producto.");
        System.out.println("2.3: Dar de baja un producto.");
        System.out.print("Introduce una opcion del 1 al 3: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                altaProducto();
                break;
            case 2:
                modificarProducto();
                break;
            case 3:
                bajaProducto();
                break;
            default:
                System.out.println("Selecciona una opcion entre 1 y 3.");
                subMenuGestionProductos();
        }
    }

    private static void subMenuCompraVenta() {
        Scanner consola = new Scanner(System.in);
        System.out.println("3.1: Gestion de comandos.");
        System.out.println("3.2: Ver estadisticas y graficos.");
        System.out.print("Introduce una opcion del 1 al 2: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                gestionComandos();
                break;
            case 2:
                visionEstadisticasGraficos();
                break;
            default:
                System.out.println("Selecciona una opcion entre 1 y 2.");
                subMenuCompraVenta();
        }
    }

    private static void altaEmpleado() {
        System.out.println("Alta empleado.");
    }

    private static void modificarEmpleado() {
        System.out.println("Modificar empleado.");
    }

    private static void bajaEmpleado() {
        System.out.println("Baja empleado.");
    }

    private static void altaProducto() {
        System.out.println("Alta producto.");
    }

    private static void modificarProducto() {
        System.out.println("Modificar producto.");
    }

    private static void bajaProducto() {
        System.out.println("Baja producto.");
    }

    private static void gestionComandos() {
        System.out.println("Gestion de comandos.");
    }

    private static void visionEstadisticasGraficos() {
        System.out.println("Vision de estadisticas y graficos.");
    }

    public static void main(String[] args) {
        menu();
    }
}
