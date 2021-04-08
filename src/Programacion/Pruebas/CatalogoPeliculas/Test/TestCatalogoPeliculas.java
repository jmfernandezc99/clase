package Programacion.Pruebas.CatalogoPeliculas.Test;

/*
 * Metodo de prueba main para poner en practica el desarrollo realizado
 */

import Programacion.Pruebas.CatalogoPeliculas.ServicioCliente.CatalogoPeliculasImpl;
import Programacion.Pruebas.CatalogoPeliculas.ServicioCliente.ICatalogoPeliculas;

import java.util.*;

public class TestCatalogoPeliculas {
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        int opcion = -1;
        while (opcion != 0){
            System.out.println("""
                    Elige una opcion.
                    1.- Iniciar catalogo peliculas.
                    2.- Agregar pelicula.
                    3.- Listar peliculas.
                    4.- Buscar pelicula.
                    0.- Salir.""");
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1 -> catalogo.iniciarCatalogoPeliculas();
                case 2 -> {
                    System.out.print("Pon el nombre de la pelicula que desea agregar: ");
                    String nombrePelicula = consola.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                }
                case 3 -> catalogo.listarPeliculas();
                case 4 -> {
                    System.out.print("Pon el nombre de la pelicula que desea buscar: ");
                    String nombrePelicula = consola.nextLine();
                    catalogo.buscarPelicula(nombrePelicula);
                }
                case 0 -> System.out.println("Saliendo del programa, hasta pronto.");
                default -> System.out.println("Opción no disponible.");
            }
        }
    }
}
