package Programacion.Bucles;
import java.util.*;
public class Exercici10 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce una nota: ");
        double nota = consola.nextDouble();
        int contador = 1;
        double sumatorioNotas = 0;
        while (nota >= 0) {
            sumatorioNotas += nota;
            System.out.print("Introduce una nota: ");
            nota = consola.nextDouble();
            contador++;
        }
        System.out.println("La media es: " + (sumatorioNotas / (contador - 1)));
    }
}