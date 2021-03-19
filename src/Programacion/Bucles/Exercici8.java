package Programacion.Bucles;
import java.util.Scanner;
public class Exercici8 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean bucle = true;
        int contador = 0;
        while (bucle){
            System.out.println("Introduzca un numero:");
            int numero = consola.nextInt();
            if (numero >= 0 && numero <= 9 && contador <= 10){
                while (numero >= 0 && numero <= 9 && contador <= 10){
                    System.out.println(numero + " x " + contador + " = " + (numero * contador));
                    contador++;
                    bucle = false;
                }
            } else
            System.out.println("No has introducido un numero del 0 al 9");
        }
    }
}
