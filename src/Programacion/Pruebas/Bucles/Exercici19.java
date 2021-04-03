package Programacion.Pruebas.Bucles;/*
Hecho dia sáb. 21/11/2020
Creado por: Juanma
Paquete: Bucles
Descripcion:Fes un programa que pinti una piràmide per pantalla on l’alçada s’introduirà per teclat. També haurà de
demanar per teclat amb quin caràcter volem pintar la piràmide. Si l’alçada fos 5, per exemple i el caràcter # tindríem
la següent figura:
*/

// POR HACER
import java.util.*;
public class Exercici19 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Scanner consola1 = new Scanner(System.in);
        System.out.print("Introduce la altura de la piramide: ");
        int altura = consola.nextInt();
        System.out.print("Introduce el caracter de la piramide: ");
        String caracter = consola1.nextLine();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(caracter);
            }
        }
    }
}
