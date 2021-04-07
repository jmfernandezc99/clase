package Programacion.Pruebas.CatalogoPeliculas.Excepciones;

/**
 * Clase para excepciones con los hijos EscrituraDatosEx y
 * LecturaDatosEx respectivamente.
 */

public class AccesoDatosEx extends Exception{
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
}
