package Programacion.Pruebas.Condicionales;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Calculadora de tiempo en caer");
        System.out.println("Introduce la altura:");
        int altura = consola.nextInt();

        System.out.println("El resultado es: " + Math.sqrt(2 * altura) / 9.81);
    }
}
