package Programacion.Pruebas.CatalogoPeliculas.ServicioCliente;

/**
 * Clase que implementa la interface 'ICatalogoPeliculas'.
 */

import Programacion.Pruebas.CatalogoPeliculas.Datos.*;
import Programacion.Pruebas.CatalogoPeliculas.Domain.Pelicula;
import Programacion.Pruebas.CatalogoPeliculas.Excepciones.AccesoDatosEx;

import java.io.*;
import java.util.Scanner;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Scanner consola = new Scanner(System.in);
        Pelicula pelicula = new Pelicula(nombrePelicula);
        System.out.println("¿Desea anexar la pelicula? s/n");
        boolean anexar;
        String opcion = consola.nextLine();
        if (opcion.equals("s")){
            anexar = true;
        }
        else {
            anexar = false;
        }
        try {
            anexar = datos.existe(this.NOMBRE_ARCHIVO);
            datos.escribir(pelicula, this.NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Error de acceso a datos");
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            peliculas.forEach(pelicula ->{
                System.out.println(pelicula);
            });
        } catch (AccesoDatosEx ex){
            System.out.println("Error de acceso de datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(this.NOMBRE_ARCHIVO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos.");
            ex.printStackTrace(System.out);
        }
        System.out.println("Resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(this.NOMBRE_ARCHIVO))
                datos.borrar(this.NOMBRE_ARCHIVO);
            datos.crear(this.NOMBRE_ARCHIVO);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas.");
            ex.printStackTrace(System.out);
        }
    }
}
