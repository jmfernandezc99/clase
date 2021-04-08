package Programacion.Pruebas.CatalogoPeliculas.Datos;

/*
  Archivo interfaz para definir los métodos que posteriormente se implementarán
  en el archivo 'AccesoDatosImpl.java'.
 */

import Programacion.Pruebas.CatalogoPeliculas.Domain.Pelicula;
import Programacion.Pruebas.CatalogoPeliculas.Excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    //Metodo para la comprobacion de que el fichero existe
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    //Metodo para imprimir por pantalla el arraylist que almecena las peliculas
    List<Pelicula> listar(String nombre) throws LecturaDatosEx;

    //Metodo para escribir en el archivo 'peliculas.txt' una nueva pelicula
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    //Metodo para buscar una pelicula en concreto
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    //Metodo para crear el archivo de las peliculas
    void crear(String nombreArchivo) throws AccesoDatosEx;

    //Metodo para borrar el archivo de las peliculas
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
