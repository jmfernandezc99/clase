package Programacion.Pruebas.Excepciones.Excepciones2;

/**
 * Creamos nuestra clase de expecion donde lo que hacemos es extenderla de Exception,
 * le creamos un constructor pasándole el mensaje por parámetro y finalmente se lo
 * mandamos al padre con super(mensaje)
 */

/**
 * Esta vez extendemos de la clase RuntimeException, la principal diferencia entre esta y
 * Exception es que no se requiere de throws exception en el método ni try catch en la clase
 * main, pero nos mostrará la pila de excepciones y el programa se parará de forma inmediata,
 * pero nos mostrará la excepción definida en el método a la hora de ejecutarlo, dependiendo
 * de nuestras necesidades, usaremos un tipo y otro.
 */

public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
