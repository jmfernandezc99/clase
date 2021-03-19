package Programacion.Condicionales;
import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = consola.nextInt();
        int ultimoDigito = numero%10;
        System.out.println("El ultimo digito del numero " + numero + " es " + ultimoDigito + ".");
    }
}
