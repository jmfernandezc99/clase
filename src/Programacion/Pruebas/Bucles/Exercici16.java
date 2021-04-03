package Programacion.Pruebas.Bucles;
import java.util.*;
public class Exercici16 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        int numero = consola.nextInt();
        int contador = 1;
        boolean bucle = true;
        while (contador < numero) {
            if (numero % contador == 0){
                System.out.println("El numero no es primo.");
            }
            else {
                contador++;
            }
        }
    }
}
