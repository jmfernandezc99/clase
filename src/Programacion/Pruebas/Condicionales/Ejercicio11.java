package Programacion.Pruebas.Condicionales;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        int hora = consola.nextInt();
        System.out.println("Introduce el minuto: ");
        int minuto = consola.nextInt();

        int horaRestante = 24 - hora;
        int minutoRestante = 60 - minuto;
        System.out.println("Quedan " + ((horaRestante - 1) * 60 * 60) + (minutoRestante * 60) + "seg para medianoche.");
    }
}
