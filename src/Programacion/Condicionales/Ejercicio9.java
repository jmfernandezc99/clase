package Programacion.Condicionales;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Calculadora de ecuacion de segundo grado.");
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce la variable a: ");
        double a = consola.nextDouble();
        System.out.println("Introduce la variable b: ");
        double b = consola.nextDouble();
        System.out.println("Introduce la variable c: ");
        double c = consola.nextDouble();
        System.out.println("Introduce la variable x: ");
        double x = consola.nextDouble();
        double resultado = (a * (x * x)) + ((b * x) + c);
        System.out.println("El resultado es " + resultado);
    }
}
