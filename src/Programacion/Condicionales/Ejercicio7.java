package Programacion.Condicionales;
import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        double nota1 = consola.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = consola.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        double nota3 = consola.nextDouble();

        System.out.println("La nota media es de " + ((nota1 + nota2 + nota3) / 3));
    }
}
