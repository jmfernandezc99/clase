// Escriu una funció que, donat un array d'enters, diu si hi ha algun element duplicat.

package Programacion.Pruebas;

import java.util.Scanner;

public class Exercici13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamany de l'array: ");
        int a = sc.nextInt();
        int ar[] = new int[a];

        crearArray(ar,sc);
        boolean esRepeteix = elementDuplicat(ar);

        if (esRepeteix){
            System.out.print("Es repeteix algún element.");
        } else {
            System.out.println("No es repeteix cap element.");
        }

    }

    private static void crearArray (int ar[], Scanner sc){
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introdueix el valor de la posició " + (i + 1) + " :");
            ar[i] = sc.nextInt();
        }
    }

    private static boolean elementDuplicat (int ar[]){
        boolean esRepeteix = false;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[j] == ar[j - 1]) {
                    esRepeteix = true;
                    break;
                }
            }
        }
        return esRepeteix;
    }

}
