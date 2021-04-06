package Programacion.Pruebas.Excepciones.Excepciones2;

public class Aritmetica {
    //indicamos throws para decirle al método que hay la posibilidad de pasarle una excepcion.
    //finalmente indicamos la excepcion que es la clase OperacionExcepcion
    public static int division(int numerador, int denominador){
        if (denominador == 0){
            //Creamos objeto de tipo excepcion y le pasamos el constructor.
            throw new OperacionExcepcion("Division entre cero");
        }

        return numerador / denominador;
    }
}
