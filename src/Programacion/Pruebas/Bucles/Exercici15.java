package Programacion.Pruebas.Bucles;
import java.util.*;
public class Exercici15 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce la base.");
        int base = consola.nextInt();
        System.out.println("Introduce el exponente.");
        int exponente = consola.nextInt();
        int resultado = base;
        int contador = 1;
        System.out.print(1 + " " + resultado + " ");
        while (base > 0 & exponente > 0 & exponente != contador){
            resultado *= base;
            System.out.print(resultado + " ");
            contador++;
        }
    }
}
