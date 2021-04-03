package Programacion.Pruebas.Condicionales;
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Calculadora de la ecuacion 'ax+b=0'.");
        System.out.println("Escribe el valor de 'a': ");
        int a = consola.nextInt();
        System.out.println("Escribe el valor de 'x': ");
        int x = consola.nextInt();
        System.out.println("Escribe el valor de 'b': ");
        int b = consola.nextInt();
        System.out.println("El resultado es: " + (a * x + b));
    }
}
