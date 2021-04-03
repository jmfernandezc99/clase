package Programacion.Pruebas.Condicionales;
import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = consola.nextInt();
        int ultimoDigito = numero%10;
        String conversor = Integer.toString(numero);
        if (conversor.length() <= 6 && conversor.charAt(0) == '-'){
            System.out.println("El ultimo digito del numero " + numero + " es " + ultimoDigito + ".");
        }
        else if (conversor.length() <= 5){
            System.out.println("El ultimo digito del numero " + numero + " es " + ultimoDigito + ".");
        }
        else {
            System.out.println("El numero " + numero + " tiene mas de 5 digitos.");
        }
    }
}
