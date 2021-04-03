package Programacion.Pruebas.Bucles;
import java.util.Scanner;
public class Exercici9 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = consola.nextInt();
        String digitos= Integer.toString(numero);
        System.out.println(numero + " tiene " + digitos.length() + " digitos");
    }
}