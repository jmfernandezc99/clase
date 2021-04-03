package Programacion.Pruebas.Condicionales;
import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int numero = consola.nextInt();
        String conversor = Integer.toString(numero);
        if (conversor.length() == 5){
            if (conversor.charAt(0) == conversor.charAt(4) && conversor.charAt(1) == conversor.charAt(3)){
                System.out.println("El numero " + numero + " es capicua.");
            }
            else {
                System.out.println("El numero " + numero + " no es capicua.");
            }
        }
        else if (conversor.length() == 4){
            if (conversor.charAt(0) == conversor.charAt(3) && conversor.charAt(1) == conversor.charAt(2)){
                System.out.println("El numero " + numero + " es capicua.");
            }
            else {
                System.out.println("El numero " + numero + " no es capicua.");
            }
        }
        else if (conversor.length() == 3){
            if (conversor.charAt(0) == conversor.charAt(2)){
                System.out.println("El numero " + numero + " es capicua.");
            }
            else {
                System.out.println("El numero " + numero + " no es capicua.");
            }
        }
        else if (conversor.length() == 2){
            if (conversor.charAt(0) == conversor.charAt(1)){
                System.out.println("El numero " + numero + " es capicua.");
            }
            else {
                System.out.println("El numero " + numero + " no es capicua.");
            }
        }
        else if (conversor.length() == 1){
            System.out.println("El numero " + numero + " solo tiene 1 digito.");
        }
        else {
            System.out.println("El numero " + numero + " tiene mas de 5 digitos.");
        }
    }
}
