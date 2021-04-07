package Programacion.Pruebas.CatalogoPeliculas.Datos;

/**
 * Archivo interfaz para definir los métodos que posteriormente se implementarán
 * en el archivo 'AccesoDatosImpl.java'.
 */

import Programacion.Pruebas.CatalogoPeliculas.Domain.Pelicula;
import Programacion.Pruebas.CatalogoPeliculas.Excepciones.*;
import java.util.List;

public interface IAccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombre) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
