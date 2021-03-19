package Programacion.Condicionales;
import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = consola.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = consola.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = consola.nextInt();
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(numero1);
            if (numero2 < numero3) {
                System.out.println(numero2);
                System.out.println(numero3);
            } else {
                System.out.println(numero3);
                System.out.println(numero2);
            }
        }
        else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println(numero2);
            if (numero1 < numero3) {
                System.out.println(numero1);
                System.out.println(numero3);
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
            }
        }
        else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println(numero3);
            if (numero1 < numero2) {
                System.out.println(numero1);
                System.out.println(numero2);
            } else {
                System.out.println(numero2);
                System.out.println(numero1);
            }
        }
    }
}
