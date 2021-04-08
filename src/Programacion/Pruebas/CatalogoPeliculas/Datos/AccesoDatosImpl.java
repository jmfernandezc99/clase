package Programacion.Pruebas.CatalogoPeliculas.Datos;

/**
 * Archivo para implementar los metodos de la interface 'AccesoDatos.java'.
 */

import Programacion.Pruebas.CatalogoPeliculas.Domain.Pelicula;
import Programacion.Pruebas.CatalogoPeliculas.Excepciones.*;
import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx{
        File fichero = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(fichero));
            String linea = entrada.readLine();
            while (linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
            return peliculas;
        } catch (IOException ex){
            throw new LecturaDatosEx("Fallo al listar del archivo " + nombreArchivo);
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Información añadida: " + pelicula);
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Fallo al escribir el archivo " + nombreArchivo);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            boolean salir = false;
            String resultado = null;
            String lectura = entrada.readLine();
            int posicion = 1;
            while (lectura != null && !salir){
                if (buscar != null && buscar.equalsIgnoreCase(lectura)){
                    resultado = "Nombre pelicula: " + lectura + "; Encontrada en posicion: " + posicion;
                    salir = true;
                } else {
                    lectura = entrada.readLine();
                    posicion++;
                }
            }
            entrada.close();
            return resultado;
        } catch (IOException ex){
            throw new LecturaDatosEx("Fallo al buscar archivo.");
        }
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo " + nombreArchivo);
        } catch (IOException ex){
            ex.printStackTrace();
            throw new LecturaDatosEx("Fallo al crear archivo.");
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists())
            archivo.delete();
        System.out.println("Se ha eliminado el archivo " + nombreArchivo);
    }
}