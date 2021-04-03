// Escriu una funció que calculi una mitja ponderada. El primer paràmetre són les notes, en
// forma d'array d'enters, i el segon paràmetre són els «pesos», en forma d'array de doubles. El
// resultat ha d'ésser un double.

package Programacion.Pruebas.Ejercicios;

import java.util.Scanner;

public class Exercici10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantes notes hi haurà en total?: ");
        int a = sc.nextInt();

        int notes[] = new int[a];
        double pesos[] = new double[a];
        double mitja = 0;

        demanarNotes(notes, sc);
        demanarPesos(pesos, sc);
        imprimirArrays(notes, pesos);
        mitja = mitjaPonderada(notes, pesos, mitja);

        System.out.println("La mitja ponderada és: " + mitja);

    }

    private static void demanarNotes (int ar[], Scanner sc){
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introdueix la nota " + (i + 1) + " :");
            ar[i] = sc.nextInt();

            if (ar[i] < 0 || ar[i] > 10){
                System.out.println("Recorda que les notes han d'estar entre 0 i 10.");
                System.exit(0);
            }
        }
    }

    private static void demanarPesos (double ar[], Scanner sc){
        double error = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introdueix el pes " + (i + 1) + " :");
            ar[i] = sc.nextDouble();
            error = error + ar[i];
        }

        if (error != 1){
            System.out.println("Recorda que la suma dels pesos ha de ser 1.");
            System.exit(0);
        }
    }

    private static void imprimirArrays (int ar[], double ar2[]){
        System.out.println("L'array notes és: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.print("\n");

        System.out.println("L'array pesos és: ");
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + " || ");
        }
        System.out.print("\n");
    }

    private static double mitjaPonderada (int ar[], double ar2[], double mitja){
        double numerador = 0, denominador = 0;
        for (int i = 0; i < ar.length; i++) {
            numerador = numerador + (ar[i] * ar2[i]);
            denominador = denominador + ar2[i];
        }

        mitja = numerador / denominador;
        return mitja;
    }
}
