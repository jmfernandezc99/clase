package Programacion.Pruebas.ArgumentosVariables;

/**
 * Ejercicio de práctica cuando queremos tener métodos con argumentos variables.
 */

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(6, 7, 8);
        imprimirNumeros(1, 2);
        variosParametros("Juanma", 3, 5, 6);
    }

    private static void variosParametros(String nombre, int... numeros){
        System.out.println(nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
