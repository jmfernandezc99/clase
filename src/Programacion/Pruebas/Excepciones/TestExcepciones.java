package Programacion.Pruebas.Excepciones;

/**
 * Como podemos observar podemos meter varios catch para llamar a diferentes tipos
 * de excepciones, así como hemos incluido la palabra finally al acabar el try catch,
 * que sirve para una vez acabado el try catch, se ejecute si o si ese bloque de código,
 * independientemente si se ejecuta alguna excepcion o no.
 */

import Programacion.Pruebas.Excepciones.Excepciones1.Aritmetica;
import Programacion.Pruebas.Excepciones.Excepciones1.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        try{
            int resultado = Aritmetica.division(10,0);
        } catch (OperacionExcepcion e){
            System.out.println("Tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Tipo Exception");
            //printStackTrace imprime el error que ocurrió.
            //e.printStackTrace(System.out);

            //Solo mandamos el mensaje de la excepcion, sin incluir la pila de excepciones.
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("FINALLY EJECUTADO AL FINAL.");
        }
    }
}
