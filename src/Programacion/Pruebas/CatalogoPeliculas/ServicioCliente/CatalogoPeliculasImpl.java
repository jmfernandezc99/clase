package Programacion.Pruebas.CatalogoPeliculas.ServicioCliente;

/**
 * Clase que implementa la interface 'ICatalogoPeliculas'.
 */

import Programacion.Pruebas.CatalogoPeliculas.Datos.*;
import Programacion.Pruebas.CatalogoPeliculas.Domain.Pelicula;
import Programacion.Pruebas.CatalogoPeliculas.Excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            boolean anexar = this.datos.existe(this.NOMBRE_ARCHIVO);
            this.datos.escribir(pelicula, this.NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Error de acceso a los datos.");
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            peliculas.forEach(System.out::println);
        } catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a los datos.");
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(this.NOMBRE_ARCHIVO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a los datos.");
        }
        System.out.println("Resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(this.NOMBRE_ARCHIVO))
                this.datos.borrar(this.NOMBRE_ARCHIVO);
            this.datos.crear(this.NOMBRE_ARCHIVO);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas.");
        }
    }
}
