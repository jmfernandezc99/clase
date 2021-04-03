package Programacion.Pruebas.Bucles;
import java.util.*;
public class Exercici14 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        boolean condicion = true;
        while (condicion){
            System.out.print("Introduce un numero positivo: ");
            base = consola.nextInt();
            System.out.print("Introduce el exponente: ");
            exponente = consola.nextInt();
            if (base >= 0 && exponente >= 0){
                System.out.println("El resultado de base " + base + " al " + exponente + " = " + Math.pow(base, exponente));
            }
            else {
                System.out.println("Has introducido un numero negativo.");
                condicion = false;
            }
        }
    }
}
