package Programacion.Pruebas.Excepciones.Excepciones1;

/**
 * Creamos nuestra clase de expecion donde lo que hacemos es extenderla de Exception,
 * le creamos un constructor pasándole el mensaje por parámetro y finalmente se lo
 * mandamos al padre con super(mensaje)
 */

//Esta vez extendemos de la clase Exception.
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
