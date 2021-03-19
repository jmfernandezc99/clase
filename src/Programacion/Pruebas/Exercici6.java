// Escriu un codi que, donat un array de booleans bidimensional, imprimeixi una taula on hi
// hagi el caràcter «*» si és true i un espai si és false, per cada element.

package Programacion.Pruebas;

import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el tamany de la creu: ");
        int a = sc.nextInt();

        boolean ar[][] = new boolean[a][a];

        ferArray(ar, a);
        imprimirArray(ar);
    }

    private static void ferArray (boolean[][] ar, int a){
        primeraMeitat(ar, a);
        meitat(ar, a);
        segonaMeitat(ar, a);
    }

    private static void primeraMeitat(boolean[][] ar, int a){

        for (int i = 0; i <= a/2 - 1; i++) {
            int espais = a / 2 - 1;
            for (int j = 0; j < ar.length; j++) {
                if (espais >= 0) {
                    ar[i][j] = false;
                    espais--;
                } else{
                    ar[i][j] = true;
                    espais = a/2 - 1;
                }
            }
        }
    }

    private static void meitat(boolean ar[][], int a){
        for (int i = 0; i < ar.length; i++) {
            ar[a/2][i] = true;
        }
    }

    private static void segonaMeitat(boolean ar[][], int a){

        for (int i = a/2 + 1; i < ar.length; i++) {
            int espais = a/2 - 1;
            for (int j = 0; j < ar.length; j++) {
                if (espais >= 0) {
                    ar[i][j] = false;
                    espais--;
                } else{
                    ar[i][j] = true;
                    espais = a/2 - 1;
                }
            }
        }
    }

    private static void imprimirArray(boolean ar[][]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[j][i]){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
