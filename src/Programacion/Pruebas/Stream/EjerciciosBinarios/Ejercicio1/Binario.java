package Programacion.Pruebas.Stream.EjerciciosBinarios.Ejercicio1;

import java.io.*;

public class Binario {
    //101 -> 5
    //0010 1001 -> 41



    public static void escribirArchivoBin(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException exc) {
            System.out.println(exc);
        }
    }
}



