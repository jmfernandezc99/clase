// Implementa el procediment d'ordenació «bubble sort» amb dues passades.

package Programacion.Pruebas;

import java.util.Scanner;

public class Exercici11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quants d'índexs tendrà l'array?: ");
        int a = sc.nextInt();

        int ar[] = new int[a];

        crearArray(ar, sc);
        ordenarArray(ar);
        imprimirArray(ar);
    }

    private static void crearArray (int ar[], Scanner sc){
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introdueix el valor de la posició " + (i + 1) + " :");
            ar[i] = sc.nextInt();
        }
    }

    private static void ordenarArray (int ar[]){
        int aux;
        for (int i = 0; i < ar.length/2; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[j - 1] > ar[j]){
                    aux = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = aux;
                }
            }
            for (int j = ar.length - 1; j > 0; j--) {
                if (ar[j - 1] > ar[j]){
                    aux = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = aux;
                }
            }
        }
    }

    private static void imprimirArray (int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
    }
}
