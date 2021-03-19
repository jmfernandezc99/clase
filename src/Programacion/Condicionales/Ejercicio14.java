package Programacion.Condicionales;
import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = consola.nextInt();
        if (numero % 5 == 0){
            System.out.println("El numero " + numero + " es divisible entre 5.");
        }
        else {
            System.out.println("El numero " + numero + " no es divisible entre 5.");
        }
    }
}
